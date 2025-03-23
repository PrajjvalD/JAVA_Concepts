package com.collection.queues;

import java.util.concurrent.*;

public class BlockingQueueBasics {

    public static void waysToInitialize() {
        // 1. Using LinkedBlockingQueue (Unbounded, FIFO)
        BlockingQueue<Integer> queue1 = new LinkedBlockingQueue<>();
        System.out.println("LinkedBlockingQueue (Unbounded): " + queue1);

        // 2. Using LinkedBlockingQueue with Capacity
        BlockingQueue<Integer> queue2 = new LinkedBlockingQueue<>(5);
        System.out.println("LinkedBlockingQueue (Bounded, Capacity = 5): " + queue2);

        // 3. Using ArrayBlockingQueue (Bounded, FIFO)
        BlockingQueue<Integer> queue3 = new ArrayBlockingQueue<>(3);
        System.out.println("ArrayBlockingQueue (Bounded, FIFO, Capacity = 3): " + queue3);

        // 4. Using PriorityBlockingQueue (Unbounded, Natural Order)
        BlockingQueue<Integer> queue4 = new PriorityBlockingQueue<>();
        System.out.println("PriorityBlockingQueue (Unbounded, Natural Order): " + queue4);

        // 5. Using DelayQueue (For Delayed Tasks)
        BlockingQueue<DelayedElement> queue5 = new DelayQueue<>();
        System.out.println("DelayQueue (For Delayed Elements): " + queue5);
    }

    public static void blockingQueueOperations() {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);

        try {
            // 1. Adding elements
            queue.put(10);
            queue.put(20);
            queue.put(30);
            System.out.println("\nBlockingQueue after adding elements: " + queue);

            // 2. Removing elements
            queue.take(); // Removes the front element (10)
            System.out.println("BlockingQueue after take(): " + queue);

            // 3. Peek (Retrieve head without removing)
            System.out.println("Peek (Front element): " + queue.peek());

            // 4. Checking size
            System.out.println("BlockingQueue Size: " + queue.size());

            // 5. Checking if the queue is empty
            System.out.println("Is BlockingQueue Empty?: " + queue.isEmpty());

            // 6. Iterating over the queue
            System.out.println("Iterating over BlockingQueue:");
            for (Integer num : queue) {
                System.out.println(num);
            }

            // 7. Clearing all elements
            queue.clear();
            System.out.println("BlockingQueue after clear(): " + queue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Producer-Consumer Example
    static class Producer implements Runnable {
        private BlockingQueue<Integer> queue;

        public Producer(BlockingQueue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            try {
                for (int i = 1; i <= 5; i++) {
                    queue.put(i);
                    System.out.println("Produced: " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Consumer implements Runnable {
        private BlockingQueue<Integer> queue;

        public Consumer(BlockingQueue<Integer> queue) {
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
        blockingQueueOperations();

        // Running Producer-Consumer
        BlockingQueue<Integer> sharedQueue = new ArrayBlockingQueue<>(2);
        Thread producer = new Thread(new Producer(sharedQueue));
        Thread consumer = new Thread(new Consumer(sharedQueue));

        producer.start();
        consumer.start();
    }
}

// Custom Delayed Element for DelayQueue
class DelayedElement implements Delayed {
    private long startTime;

    public DelayedElement(long delayInMillis) {
        this.startTime = System.currentTimeMillis() + delayInMillis;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(startTime - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.startTime, ((DelayedElement) o).startTime);
    }
}
