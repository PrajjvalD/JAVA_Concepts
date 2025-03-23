package com.collection.queues;
import java.util.concurrent.*;

public class PriorityBlockingQueueBasics {

    public static void waysToInitialize() {
        // 1. Default Constructor (Natural Ordering)
        PriorityBlockingQueue<Integer> queue1 = new PriorityBlockingQueue<>();
        System.out.println("PriorityBlockingQueue (Default, Natural Order): " + queue1);

        // 2. Using Initial Capacity
        PriorityBlockingQueue<Integer> queue2 = new PriorityBlockingQueue<>(5);
        System.out.println("PriorityBlockingQueue (With Initial Capacity = 5): " + queue2);

        // 3. Using Comparator (Descending Order)
        PriorityBlockingQueue<Integer> queue3 = new PriorityBlockingQueue<>(5, (a, b) -> b - a);
        System.out.println("PriorityBlockingQueue (Custom Comparator - Descending Order): " + queue3);
    }

    public static void priorityBlockingQueueOperations() {
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();

        // Adding elements
        queue.add(40);
        queue.add(10);
        queue.add(30);
        queue.add(20);
        System.out.println("\nPriorityBlockingQueue after adding elements (Natural Order): " + queue);

        // Polling elements (Removes and returns the highest priority element)
        System.out.println("Polling element: " + queue.poll());
        System.out.println("Queue after poll(): " + queue);

        // Peeking (Retrieve highest priority element without removing)
        System.out.println("Peek (Highest Priority Element): " + queue.peek());

        // Checking size
        System.out.println("Size of PriorityBlockingQueue: " + queue.size());

        // Checking if queue is empty
        System.out.println("Is PriorityBlockingQueue empty?: " + queue.isEmpty());

        // Iterating over the queue
        System.out.println("Iterating over PriorityBlockingQueue:");
        for (Integer num : queue) {
            System.out.println(num);
        }

        // Clearing all elements
        queue.clear();
        System.out.println("PriorityBlockingQueue after clear(): " + queue);
    }

    // Producer-Consumer Example
    static class Producer implements Runnable {
        private PriorityBlockingQueue<Integer> queue;

        public Producer(PriorityBlockingQueue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            try {
                int[] numbers = {50, 10, 40, 20, 30};
                for (int num : numbers) {
                    queue.put(num);
                    System.out.println("Produced: " + num);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Consumer implements Runnable {
        private PriorityBlockingQueue<Integer> queue;

        public Consumer(PriorityBlockingQueue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < 5; i++) {
                    int value = queue.take();
                    System.out.println("Consumed: " + value);
                    Thread.sleep(1500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        waysToInitialize();
        priorityBlockingQueueOperations();

        // Running Producer-Consumer
        PriorityBlockingQueue<Integer> sharedQueue = new PriorityBlockingQueue<>();
        Thread producer = new Thread(new Producer(sharedQueue));
        Thread consumer = new Thread(new Consumer(sharedQueue));

        producer.start();
        consumer.start();
    }
}
