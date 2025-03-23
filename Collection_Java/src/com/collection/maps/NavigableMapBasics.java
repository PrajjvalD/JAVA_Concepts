package com.collection.maps;

import java.util.*;

public class NavigableMapBasics {

    public static void waysToInitialize() {
        // 1. Default Initialization (Natural Order)
        NavigableMap<Integer, String> navigableMap1 = new TreeMap<>();
        navigableMap1.put(3, "Apple");
        navigableMap1.put(1, "Banana");
        navigableMap1.put(2, "Orange");
        System.out.println("NavigableMap (Natural Order): " + navigableMap1);

        // 2. Initialization with Custom Comparator (Descending Order)
        NavigableMap<Integer, String> navigableMap2 = new TreeMap<>(Collections.reverseOrder());
        navigableMap2.put(3, "Apple");
        navigableMap2.put(1, "Banana");
        navigableMap2.put(2, "Orange");
        System.out.println("NavigableMap (Descending Order): " + navigableMap2);

        // 3. Using Another NavigableMap
        NavigableMap<Integer, String> navigableMap3 = new TreeMap<>(navigableMap1);
        System.out.println("NavigableMap (From Another NavigableMap): " + navigableMap3);
    }

    public static void navigableMapOperations() {
        NavigableMap<Integer, String> navigableMap = new TreeMap<>();

        // 1. Adding Key-Value Pairs
        navigableMap.put(100, "John");
        navigableMap.put(102, "Emma");
        navigableMap.put(101, "Michael");
        navigableMap.put(104, "Alice");
        navigableMap.put(103, "David");
        System.out.println("\nNavigableMap after adding elements: " + navigableMap);

        // 2. Accessing First and Last Entries
        System.out.println("First Entry: " + navigableMap.firstEntry());
        System.out.println("Last Entry: " + navigableMap.lastEntry());

        // 3. Navigating Lower/Higher/Floor/Ceiling Keys
        System.out.println("Lower Key (Before 102): " + navigableMap.lowerKey(102)); // < 102
        System.out.println("Higher Key (After 102): " + navigableMap.higherKey(102)); // > 102
        System.out.println("Floor Key (≤ 102): " + navigableMap.floorKey(102)); // <= 102
        System.out.println("Ceiling Key (≥ 102): " + navigableMap.ceilingKey(102)); // >= 102

        // 4. SubMap, HeadMap, TailMap
        System.out.println("SubMap (101 to 103): " + navigableMap.subMap(101, true, 103, true));
        System.out.println("HeadMap (Before 103): " + navigableMap.headMap(103, true));
        System.out.println("TailMap (From 102 onwards): " + navigableMap.tailMap(102, true));

        // 5. Removing Entries
        System.out.println("Poll First Entry: " + navigableMap.pollFirstEntry()); // Removes first
        System.out.println("Poll Last Entry: " + navigableMap.pollLastEntry()); // Removes last
        System.out.println("NavigableMap after polling: " + navigableMap);

        // 6. Descending Order View
        System.out.println("NavigableMap in Descending Order: " + navigableMap.descendingMap());

        // 7. Iterating Over the Entries
        System.out.println("\nIterating through NavigableMap:");
        for (Map.Entry<Integer, String> entry : navigableMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 8. Clearing the NavigableMap
        navigableMap.clear();
        System.out.println("NavigableMap after clear(): " + navigableMap);
    }

    public static void main(String[] args) {
        waysToInitialize();
        navigableMapOperations();
    }
}
