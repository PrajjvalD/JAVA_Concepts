package com.collection.maps;

import java.util.*;

public class IdentityHashMapBasics {

    // Different ways to initialize IdentityHashMap
    public static void waysToInitialize() {
        // 1. Default Constructor
        IdentityHashMap<Integer, String> map1 = new IdentityHashMap<>();
        map1.put(1, "Apple");
        map1.put(2, "Banana");
        map1.put(3, "Cherry");
        System.out.println("Default Constructor: " + map1);

        // 2. Using Initial Capacity
        IdentityHashMap<Integer, String> map2 = new IdentityHashMap<>(10);
        map2.put(100, "Java");
        map2.put(200, "Python");
        System.out.println("Constructor with Initial Capacity: " + map2);

        // 3. Initializing with another Map
        IdentityHashMap<Integer, String> map3 = new IdentityHashMap<>(map1);
        System.out.println("Initialized with another IdentityHashMap: " + map3);

        // 4. Using Static Initialization (Double Brace Initialization) [Not Recommended]
        IdentityHashMap<Integer, String> map4 = new IdentityHashMap<>() {{
            put(5, "Dog");
            put(6, "Cat");
        }};
        System.out.println("Double Brace Initialization: " + map4);
    }

    // IdentityHashMap Operations
    public static void identityHashMapOperations() {
        IdentityHashMap<Integer, String> map = new IdentityHashMap<>();

        // 1. Adding Elements
        Integer key1 = new Integer(10);
        Integer key2 = new Integer(10); // Different object with same value
        map.put(key1, "First");
        map.put(key2, "Second");
        System.out.println("\nIdentityHashMap after adding elements: " + map);
        // Unlike HashMap, key1 and key2 are treated as different keys

        // 2. Getting a Value
        System.out.println("Get value for key1: " + map.get(key1));
        System.out.println("Get value for key2: " + map.get(key2));

        // 3. Removing an Entry
        map.remove(key1);
        System.out.println("After removing key1: " + map);

        // 4. Checking if a Key Exists
        System.out.println("Contains key2? " + map.containsKey(key2));

        // 5. Checking if a Value Exists
        System.out.println("Contains value 'Second'? " + map.containsValue("Second"));

        // 6. Iterating through Keys
        System.out.println("Iterating through keys:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // 7. Iterating through Entries
        System.out.println("Iterating through key-value pairs:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 8. Size of IdentityHashMap
        System.out.println("Size of IdentityHashMap: " + map.size());

        // 9. Checking if IdentityHashMap is Empty
        System.out.println("Is IdentityHashMap empty? " + map.isEmpty());

        // 10. Cloning the IdentityHashMap
        IdentityHashMap<Integer, String> clonedMap = (IdentityHashMap<Integer, String>) map.clone();
        System.out.println("Cloned IdentityHashMap: " + clonedMap);

        // 11. Clearing the IdentityHashMap
        map.clear();
        System.out.println("IdentityHashMap after clear(): " + map);
    }

    public static void main(String[] args) {
        waysToInitialize();
        identityHashMapOperations();
    }
}
