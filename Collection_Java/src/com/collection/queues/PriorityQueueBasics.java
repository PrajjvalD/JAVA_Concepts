package com.collection.queues;
import java.util.*;

public class PriorityQueueBasics {

    public static void waysToInitialize() {
        // 1. Default Natural Ordering (Min-Heap)
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.add(30);
        pq1.add(10);
        pq1.add(20);
        System.out.println("PriorityQueue (Min-Heap, Default): " + pq1);

        // 2. PriorityQueue with Custom Comparator (Max-Heap)
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        pq2.add(30);
        pq2.add(10);
        pq2.add(20);
        System.out.println("PriorityQueue (Max-Heap): " + pq2);

        // 3. PriorityQueue with Initial Capacity
        PriorityQueue<Integer> pq3 = new PriorityQueue<>(5);
        pq3.add(40);
        pq3.add(50);
        pq3.add(60);
        System.out.println("PriorityQueue with Initial Capacity: " + pq3);

        // 4. PriorityQueue using a List
        List<Integer> list = Arrays.asList(70, 80, 90);
        PriorityQueue<Integer> pq4 = new PriorityQueue<>(list);
        System.out.println("PriorityQueue from List: " + pq4);

        // 5. PriorityQueue for Strings (Lexicographical Order)
        PriorityQueue<String> pq5 = new PriorityQueue<>();
        pq5.add("Banana");
        pq5.add("Apple");
        pq5.add("Mango");
        System.out.println("PriorityQueue (String Natural Order): " + pq5);

        // 6. PriorityQueue for Custom Objects
        PriorityQueue<Person> pq6 = new PriorityQueue<>(Comparator.comparingInt(p -> p.age));
        pq6.add(new Person("Alice", 30));
        pq6.add(new Person("Bob", 25));
        pq6.add(new Person("Charlie", 35));
        System.out.println("PriorityQueue (Custom Objects by Age): " + pq6);
    }

    public static void priorityQueueOperations() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 1. Adding elements
        pq.offer(40);
        pq.offer(20);
        pq.offer(10);
        pq.offer(30);
        System.out.println("\nPriorityQueue after adding elements: " + pq);

        // 2. Removing elements
        pq.poll(); // Removes the smallest element (10)
        System.out.println("PriorityQueue after poll(): " + pq);

        // 3. Peek (Retrieve the head without removing)
        System.out.println("Peek (Front element): " + pq.peek());

        // 4. Checking size
        System.out.println("PriorityQueue Size: " + pq.size());

        // 5. Checking if the queue is empty
        System.out.println("Is PriorityQueue Empty?: " + pq.isEmpty());

        // 6. Iterating over the queue
        System.out.println("Iterating over PriorityQueue using for-each loop:");
        for (Integer num : pq) {
            System.out.println(num);
        }

        // 7. Iterating using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<Integer> iterator = pq.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 8. Converting PriorityQueue to Array
        Integer[] array = pq.toArray(new Integer[0]);
        System.out.println("PriorityQueue converted to Array: " + Arrays.toString(array));

        // 9. Clearing all elements
        pq.clear();
        System.out.println("PriorityQueue after clear(): " + pq);
    }

    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }

    public static void main(String[] args) {
        waysToInitialize();
        priorityQueueOperations();
    }
}
