package com.collection.cursors;

import java.util.*;

public class IteratorBasics {

    public static void main(String[] args) {
        // Initializing a List
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Mango");
        
        // Using Iterator to traverse the List
        System.out.println("Traversing List using Iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        // Using Iterator to remove an element
        iterator = list.iterator(); // Reset iterator
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruit.equals("Banana")) {
                iterator.remove(); // Removing "Banana"
            }
        }
        System.out.println("List after removing 'Banana': " + list);

        // Using Iterator with Set
        Set<Integer> set = new HashSet<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("\nTraversing Set using Iterator:");
        Iterator<Integer> setIterator = set.iterator();
        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());
        }

        // Using Iterator with Queue
        Queue<String> queue = new LinkedList<>();
        queue.add("John");
        queue.add("Emma");
        queue.add("Michael");

        System.out.println("\nTraversing Queue using Iterator:");
        Iterator<String> queueIterator = queue.iterator();
        while (queueIterator.hasNext()) {
            System.out.println(queueIterator.next());
        }
    }
}
