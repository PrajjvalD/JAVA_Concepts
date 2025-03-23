package com.collection.maps;

import java.util.*;

public class HashMapBasics {

    // Different ways to initialize HashMap
    public static void waysToInitialize() {
        // 1. Default Constructor
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Apple");
        map1.put(2, "Banana");
        map1.put(3, "Orange");
        System.out.println("Default Constructor: " + map1);

        // 2. Using Constructor with Initial Capacity
        HashMap<Integer, String> map2 = new HashMap<>(10);
        map2.put(1, "Car");
        map2.put(2, "Bike");
        System.out.println("Constructor with Initial Capacity: " + map2);

        // 3. Using Constructor with Load Factor
        HashMap<Integer, String> map3 = new HashMap<>(10, 0.75f);
        map3.put(100, "Java");
        map3.put(200, "Python");
        System.out.println("Constructor with Load Factor: " + map3);

        // 4. Initializing with another Map
        HashMap<Integer, String> map4 = new HashMap<>(map1);
        System.out.println("Initialized with another HashMap: " + map4);

        // 5. Using Static Initialization (Double Brace Initialization) [Not Recommended]
        HashMap<Integer, String> map5 = new HashMap<>() {{
            put(10, "A");
            put(20, "B");
            put(30, "C");
        }};
        System.out.println("Double Brace Initialization: " + map5);

        // 6. Using Map.of() (Immutable Map - Java 9+)
        Map<Integer, String> map6 = Map.of(1, "Red", 2, "Blue", 3, "Green");
        System.out.println("Using Map.of(): " + map6);
    }

    // HashMap Operations
    public static void hashMapOperations() {
        HashMap<Integer, String> map = new HashMap<>();

        // 1. Adding Elements
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        System.out.println("\nHashMap after adding elements: " + map);

        // 2. Getting a Value
        System.out.println("Get value for key 2: " + map.get(2));

        // 3. Removing an Entry
        map.remove(1);
        System.out.println("After removing key 1: " + map);

        // 4. Checking if a Key Exists
        System.out.println("Contains key 3? " + map.containsKey(3));

        // 5. Checking if a Value Exists
        System.out.println("Contains value 'Banana'? " + map.containsValue("Banana"));

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

        // 8. Size of HashMap
        System.out.println("Size of HashMap: " + map.size());

        // 9. Checking if HashMap is Empty
        System.out.println("Is HashMap empty? " + map.isEmpty());

        // 10. Cloning the HashMap
        HashMap<Integer, String> clonedMap = (HashMap<Integer, String>) map.clone();
        System.out.println("Cloned HashMap: " + clonedMap);

        // 11. Replacing a Value
        map.replace(2, "Mango");
        System.out.println("After replacing key 2: " + map);

        // 12. Merging Maps
        HashMap<Integer, String> newMap = new HashMap<>();
        newMap.put(4, "Grapes");
        newMap.putAll(map);
        System.out.println("Merged HashMap: " + newMap);

        // 13. Clearing the HashMap
        map.clear();
        System.out.println("HashMap after clear(): " + map);
    }

    public static void main(String[] args) {
        waysToInitialize();
        hashMapOperations();
    }
}

