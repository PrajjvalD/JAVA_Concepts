package com.collection.maps;

import java.util.*;

public class TreeMapBasics {

    public static void waysToInitialize() {
        // 1. Default Initialization (Natural Order)
        TreeMap<Integer, String> treeMap1 = new TreeMap<>();
        treeMap1.put(3, "Apple");
        treeMap1.put(1, "Banana");
        treeMap1.put(2, "Orange");
        System.out.println("TreeMap (Natural Order): " + treeMap1);

        // 2. Initialization with Custom Comparator (Descending Order)
        TreeMap<Integer, String> treeMap2 = new TreeMap<>(Collections.reverseOrder());
        treeMap2.put(3, "Apple");
        treeMap2.put(1, "Banana");
        treeMap2.put(2, "Orange");
        System.out.println("TreeMap (Descending Order): " + treeMap2);

        // 3. Using Another Map
        TreeMap<Integer, String> treeMap3 = new TreeMap<>(treeMap1);
        System.out.println("TreeMap (From Another TreeMap): " + treeMap3);

        // 4. Using Java 8 Stream API (Immutable TreeMap)
        Map<Integer, String> treeMap4 = new TreeMap<>(
            Map.of(4, "Mango", 5, "Grapes", 6, "Papaya")
        );
        System.out.println("TreeMap (Immutable using Map.of()): " + treeMap4);
    }

    public static void treeMapOperations() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // 1. Adding Key-Value Pairs
        treeMap.put(100, "John");
        treeMap.put(102, "Emma");
        treeMap.put(101, "Michael");
        treeMap.put(104, "Alice");
        treeMap.put(103, "David");
        System.out.println("\nTreeMap after adding elements: " + treeMap);

        // 2. Accessing First and Last Entries
        System.out.println("First Entry: " + treeMap.firstEntry());
        System.out.println("Last Entry: " + treeMap.lastEntry());

        // 3. Navigating Lower/Higher/Floor/Ceiling Keys
        System.out.println("Lower Key (Before 102): " + treeMap.lowerKey(102)); // < 102
        System.out.println("Higher Key (After 102): " + treeMap.higherKey(102)); // > 102
        System.out.println("Floor Key (≤ 102): " + treeMap.floorKey(102)); // <= 102
        System.out.println("Ceiling Key (≥ 102): " + treeMap.ceilingKey(102)); // >= 102

        // 4. SubMap, HeadMap, TailMap
        System.out.println("SubMap (101 to 103): " + treeMap.subMap(101, true, 103, true));
        System.out.println("HeadMap (Before 103): " + treeMap.headMap(103, true));
        System.out.println("TailMap (From 102 onwards): " + treeMap.tailMap(102, true));

        // 5. Removing Entries
        treeMap.remove(101);
        System.out.println("TreeMap after removing key 101: " + treeMap);

        // 6. Checking If a Key or Value Exists
        System.out.println("Contains Key 102? " + treeMap.containsKey(102));
        System.out.println("Contains Value 'Alice'? " + treeMap.containsValue("Alice"));

        // 7. Iterating Over the Entries
        System.out.println("\nIterating through TreeMap:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 8. Clearing the TreeMap
        treeMap.clear();
        System.out.println("TreeMap after clear(): " + treeMap);
    }

    public static void main(String[] args) {
        waysToInitialize();
        treeMapOperations();
    }
}
