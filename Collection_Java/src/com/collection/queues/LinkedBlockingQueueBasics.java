package com.collection.queues;

import java.util.concurrent.*;

public class LinkedBlockingQueueBasics {

    public static void waysToInitialize() {
        // 1. Default Constructor (Unbounded Queue)
        LinkedBlockingQueue<Integer> queue1 = new LinkedBlockingQueue<>();
        System.out.println("LinkedBlockingQueue (Unbounded): " + queue1);

        // 2. Bounded Queue with Capacity Limit
        LinkedBlockingQueue<Integer> queue2 = new LinkedBlockingQueue<>(5);
        System.out.println("LinkedBlockingQueue (Bounded with Capacity = 5): " + queue2);

        // 3. Initializing with a Collection
        LinkedBlockingQueue<Integer> queue3 = new LinkedBlockingQueue<>(java.util.Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("LinkedBlockingQueue (Initialized with Collection): " + queue3);
    }

    public static void linkedBlockingQueueOperations() {
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>(3); // Bounded queue

        try {
            // Adding elements
            queue.put(10);
            queue.put(20);
            queue.put(30);
            System.out.println("\nLinkedBlockingQueue after adding elements: " + queue);

            // Peeking (Retrieve but do not remove)
            System.out.println("Peek: " + queue.peek());

            // Polling (Retrieve and remove)
            System.out.println("Poll: " + queue.poll());
            System.out.println("Queue after poll(): " + queue);

            // Offer (Adds an element if possible, otherwise returns false)
            boolean added = queue.offer(40);
            System.out.println("Offered 40: " + added);
            System.out.println("Queue after offer(): " + queue);

            // Removing an element
            queue.remove(20);
            System.out.println("Queue after remove(20): " + queue);

            // Checking size
            System.out.println("Size of LinkedBlockingQueue: " + queue.size());

            // Checking if queue is empty
            System.out.println("Is Queue empty? " + queue.isEmpty());

            // Clearing the queue
            queue.clear();
            System.out.println("Queue after clear(): " + queue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Producer-Consumer Example using LinkedBlockingQueue
    static class Producer implements Runnable {
        private LinkedBlockingQueue<Integer> queue;

        public Producer(LinkedBlockingQueue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            try {
                for (int i = 1; i <= 5; i++) {
                    queue.put(i * 10);
                    System.out.println("Produced: " + (i * 10));
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Consumer implements Runnable {
        private LinkedBlockingQueue<Integer> queue;

        public Consumer(LinkedBlockingQueue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            try {
                for (int i = 1; i <= 5; i++) {
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
        linkedBlockingQueueOperations();

        // Running Producer-Consumer Example
        LinkedBlockingQueue<Integer> sharedQueue = new LinkedBlockingQueue<>(2);
        Thread producer = new Thread(new Producer(sharedQueue));
        Thread consumer = new Thread(new Consumer(sharedQueue));

        producer.start();
        consumer.start();
    }
}
