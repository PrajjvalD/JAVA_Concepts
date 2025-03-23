package com.collection.cursors;

import java.util.*;

public class ListIteratorBasics {

    public static void main(String[] args) {
        // Initializing an ArrayList
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Mango");

        // Using ListIterator to traverse the List in Forward Direction
        System.out.println("Traversing List in Forward Direction:");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Using ListIterator to traverse the List in Backward Direction
        System.out.println("\nTraversing List in Backward Direction:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // Modifying elements while iterating
        listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            if (fruit.equals("Banana")) {
                listIterator.set("Blueberry");  // Updating "Banana" to "Blueberry"
            }
        }
        System.out.println("\nList after modification: " + list);

        // Adding elements while iterating
        listIterator = list.listIterator(2); // Start from index 2
        listIterator.add("Orange");
        System.out.println("\nList after adding 'Orange': " + list);

        // Removing an element while iterating
        listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().equals("Apple")) {
                listIterator.remove(); // Removing "Apple"
            }
        }
        System.out.println("\nList after removing 'Apple': " + list);
    }
}
