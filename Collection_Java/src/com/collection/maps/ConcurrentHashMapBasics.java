package com.collection.maps;

import java.util.concurrent.*;

public class ConcurrentHashMapBasics {

    public static void waysToInitialize() {
        // 1. Default Initialization
        ConcurrentHashMap<Integer, String> map1 = new ConcurrentHashMap<>();
        map1.put(1, "Apple");
        map1.put(2, "Banana");
        map1.put(3, "Orange");
        System.out.println("ConcurrentHashMap (Default): " + map1);

        // 2. Initialization with Initial Capacity
        ConcurrentHashMap<Integer, String> map2 = new ConcurrentHashMap<>(10);
        map2.put(4, "Mango");
        map2.put(5, "Grapes");
        System.out.println("ConcurrentHashMap (With Initial Capacity): " + map2);

        // 3. Initialization with Initial Capacity & Load Factor
        ConcurrentHashMap<Integer, String> map3 = new ConcurrentHashMap<>(10, 0.75f);
        map3.put(6, "Pineapple");
        map3.put(7, "Strawberry");
        System.out.println("ConcurrentHashMap (With Capacity & Load Factor): " + map3);

        // 4. Using another Map
        ConcurrentHashMap<Integer, String> map4 = new ConcurrentHashMap<>(map1);
        System.out.println("ConcurrentHashMap (From Another Map): " + map4);
    }

    public static void concurrentHashMapOperations() {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        // 1. Adding Elements
        map.put(101, "John");
        map.put(102, "Emma");
        map.put(103, "Michael");
        map.put(104, "Alice");
        System.out.println("\nConcurrentHashMap after adding elements: " + map);

        // 2. Getting a Value
        System.out.println("Value for key 102: " + map.get(102));

        // 3. Removing an Entry
        map.remove(103);
        System.out.println("ConcurrentHashMap after removing key 103: " + map);

        // 4. Checking if Key Exists
        System.out.println("Contains Key 101? " + map.containsKey(101));

        // 5. Checking if Value Exists
        System.out.println("Contains Value 'Emma'? " + map.containsValue("Emma"));

        // 6. Iterating Using forEach()
        System.out.println("\nIterating using forEach():");
        map.forEach((key, value) -> System.out.println(key + " -> " + value));

        // 7. Using compute() to Update Value
        map.compute(102, (key, val) -> val + " Updated");
        System.out.println("ConcurrentHashMap after compute(): " + map);

        // 8. Using putIfAbsent()
        map.putIfAbsent(105, "David");
        System.out.println("ConcurrentHashMap after putIfAbsent(): " + map);

        // 9. Using replace() to Update an Existing Entry
        map.replace(101, "John Updated");
        System.out.println("ConcurrentHashMap after replace(): " + map);

        // 10. Using computeIfAbsent()
        map.computeIfAbsent(106, k -> "New Entry");
        System.out.println("ConcurrentHashMap after computeIfAbsent(): " + map);

        // 11. Using computeIfPresent()
        map.computeIfPresent(102, (key, val) -> val + " Again");
        System.out.println("ConcurrentHashMap after computeIfPresent(): " + map);

        // 12. Using keySet() and entrySet()
        System.out.println("\nKeys: " + map.keySet());
        System.out.println("Entries: " + map.entrySet());

        // 13. Clearing the Map
        map.clear();
        System.out.println("ConcurrentHashMap after clear(): " + map);
    }

    public static void main(String[] args) {
        waysToInitialize();
        concurrentHashMapOperations();
    }
}
