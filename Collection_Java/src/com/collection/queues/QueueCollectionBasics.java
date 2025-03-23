package com.collection.queues;

import java.util.*;

public class QueueCollectionBasics {

    public static void waysToInitialize() {
        // 1. Using LinkedList (FIFO Queue)
        Queue<String> queue1 = new LinkedList<>();
        queue1.add("Apple");
        queue1.add("Banana");
        queue1.add("Orange");
        System.out.println("LinkedList Queue: " + queue1);

        // 2. Using PriorityQueue (Sorted Order)
        Queue<Integer> queue2 = new PriorityQueue<>();
        queue2.add(30);
        queue2.add(10);
        queue2.add(20);
        System.out.println("PriorityQueue (Natural Order): " + queue2);

        // 3. Using PriorityQueue with Comparator (Descending Order)
        Queue<Integer> queue3 = new PriorityQueue<>(Collections.reverseOrder());
        queue3.add(30);
        queue3.add(10);
        queue3.add(20);
        System.out.println("PriorityQueue (Descending Order): " + queue3);

        // 4. Using ArrayDeque (Efficient FIFO Queue)
        Queue<String> queue4 = new ArrayDeque<>();
        queue4.add("One");
        queue4.add("Two");
        queue4.add("Three");
        System.out.println("ArrayDeque Queue: " + queue4);
    }

    public static void queueOperations() {
        Queue<Integer> queue = new LinkedList<>();

        // 1. Adding elements
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        System.out.println("\nQueue after adding elements: " + queue);

        // 2. Removing elements
        queue.poll(); // Removes the front element (10)
        System.out.println("Queue after poll(): " + queue);

        // 3. Peek (Retrieve head without removing)
        System.out.println("Peek (Front element): " + queue.peek());

        // 4. Checking size
        System.out.println("Queue Size: " + queue.size());

        // 5. Checking if the queue is empty
        System.out.println("Is Queue Empty?: " + queue.isEmpty());

        // 6. Iterating over the queue
        System.out.println("Iterating over Queue using for-each loop:");
        for (Integer num : queue) {
            System.out.println(num);
        }

        // 7. Iterating using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 8. Converting Queue to Array
        Integer[] array = queue.toArray(new Integer[0]);
        System.out.println("Queue converted to Array: " + Arrays.toString(array));

        // 9. Clearing all elements
        queue.clear();
        System.out.println("Queue after clear(): " + queue);
    }

    public static void main(String[] args) {
        waysToInitialize();
        queueOperations();
    }
}
