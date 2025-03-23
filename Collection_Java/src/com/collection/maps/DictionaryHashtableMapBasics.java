package com.collection.maps;

import java.util.*;

public class DictionaryHashtableMapBasics {

    public static void dictionaryHashtableMapOperations() {
        // Using Dictionary reference (Old style)
        Dictionary<Integer, String> dictionary = new Hashtable<>();
        dictionary.put(1, "Apple");
        dictionary.put(2, "Banana");
        dictionary.put(3, "Orange");

        System.out.println("Dictionary Elements:");
        for (Enumeration<Integer> keys = dictionary.keys(); keys.hasMoreElements(); ) {
            Integer key = keys.nextElement();
            System.out.println(key + " -> " + dictionary.get(key));
        }

        // Using Hashtable (Preferred in legacy code)
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(101, "John");
        hashtable.put(102, "Emma");
        hashtable.put(103, "Michael");

        System.out.println("\nHashtable Elements:");
        hashtable.forEach((key, value) -> System.out.println(key + " -> " + value));

        // Using Map (Modern Approach)
        Map<Integer, String> map = new Hashtable<>(); // Hashtable implements Map
        map.put(1001, "Alice");
        map.put(1002, "Bob");
        map.put(1003, "Charlie");

        System.out.println("\nMap Elements (Using Hashtable as Map):");
        map.forEach((key, value) -> System.out.println(key + " -> " + value));

        // Checking if a key exists
        System.out.println("\nHashtable contains key 102? " + hashtable.containsKey(102));
        
        // Removing a key
        hashtable.remove(103);
        System.out.println("Hashtable after removing key 103: " + hashtable);
        
        // Getting size
        System.out.println("Hashtable size: " + hashtable.size());
    }

    public static void main(String[] args) {
        dictionaryHashtableMapOperations();
    }
}
