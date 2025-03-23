package com.collection.cursors;

import java.util.*;

public class EnumerationBasics {

    public static void main(String[] args) {
        // Initializing a Vector (Legacy class)
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        vector.add("Mango");

        // Using Enumeration to traverse the Vector
        System.out.println("Traversing Vector using Enumeration:");
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        // Initializing a Hashtable (Legacy class)
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "John");
        hashtable.put(2, "Emma");
        hashtable.put(3, "Michael");

        // Using Enumeration to traverse keys of Hashtable
        System.out.println("\nTraversing Hashtable keys using Enumeration:");
        Enumeration<Integer> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            System.out.println(keys.nextElement());
        }

        // Using Enumeration to traverse values of Hashtable
        System.out.println("\nTraversing Hashtable values using Enumeration:");
        Enumeration<String> values = hashtable.elements();
        while (values.hasMoreElements()) {
            System.out.println(values.nextElement());
        }
    }
}
