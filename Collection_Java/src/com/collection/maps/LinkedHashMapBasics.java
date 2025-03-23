package com.collection.maps;

import java.util.*;

public class LinkedHashMapBasics {

    // Different ways to initialize LinkedHashMap
    public static void waysToInitialize() {
        // 1. Default Constructor (Maintains Insertion Order)
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(1, "Apple");
        map1.put(2, "Banana");
        map1.put(3, "Cherry");
        System.out.println("Default Constructor: " + map1);

        // 2. Using Constructor with Initial Capacity
        LinkedHashMap<Integer, String> map2 = new LinkedHashMap<>(10);
        map2.put(100, "Java");
        map2.put(200, "Python");
        System.out.println("Constructor with Initial Capacity: " + map2);

        // 3. Using Constructor with Load Factor
        LinkedHashMap<Integer, String> map3 = new LinkedHashMap<>(10, 0.75f);
        map3.put(10, "Car");
        map3.put(20, "Bike");
        System.out.println("Constructor with Load Factor: " + map3);

        // 4. Initializing with another Map
        LinkedHashMap<Integer, String> map4 = new LinkedHashMap<>(map1);
        System.out.println("Initialized with another LinkedHashMap: " + map4);

        // 5. Using Static Initialization (Double Brace Initialization) [Not Recommended]
        LinkedHashMap<Integer, String> map5 = new LinkedHashMap<>() {{
            put(5, "Dog");
            put(6, "Cat");
        }};
        System.out.println("Double Brace Initialization: " + map5);

        // 6. Using Access Order for LRU Cache (Least Recently Used)
        LinkedHashMap<Integer, String> lruMap = new LinkedHashMap<>(4, 0.75f, true);
        lruMap.put(1, "One");
        lruMap.put(2, "Two");
        lruMap.put(3, "Three");
        lruMap.get(1); // Access key 1, moving it to the end
        System.out.println("LinkedHashMap with Access Order (LRU Cache Behavior): " + lruMap);
    }

    // LinkedHashMap Operations
    public static void linkedHashMapOperations() {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // 1. Adding Elements
        map.put(1, "Red");
        map.put(2, "Blue");
        map.put(3, "Green");
        System.out.println("\nLinkedHashMap after adding elements: " + map);

        // 2. Getting a Value
        System.out.println("Get value for key 2: " + map.get(2));

        // 3. Removing an Entry
        map.remove(1);
        System.out.println("After removing key 1: " + map);

        // 4. Checking if a Key Exists
        System.out.println("Contains key 3? " + map.containsKey(3));

        // 5. Checking if a Value Exists
        System.out.println("Contains value 'Blue'? " + map.containsValue("Blue"));

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

        // 8. Size of LinkedHashMap
        System.out.println("Size of LinkedHashMap: " + map.size());

        // 9. Checking if LinkedHashMap is Empty
        System.out.println("Is LinkedHashMap empty? " + map.isEmpty());

        // 10. Cloning the LinkedHashMap
        LinkedHashMap<Integer, String> clonedMap = (LinkedHashMap<Integer, String>) map.clone();
        System.out.println("Cloned LinkedHashMap: " + clonedMap);

        // 11. Replacing a Value
        map.replace(2, "Yellow");
        System.out.println("After replacing key 2: " + map);

        // 12. Merging Maps
        LinkedHashMap<Integer, String> newMap = new LinkedHashMap<>();
        newMap.put(4, "Purple");
        newMap.putAll(map);
        System.out.println("Merged LinkedHashMap: " + newMap);

        // 13. Clearing the LinkedHashMap
        map.clear();
        System.out.println("LinkedHashMap after clear(): " + map);
    }

    public static void main(String[] args) {
        waysToInitialize();
        linkedHashMapOperations();
    }
}
