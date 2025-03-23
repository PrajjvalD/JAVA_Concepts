package com.collection.maps;

import java.util.*;

public class SortedMapBasics {

    public static void waysToInitialize() {
        // 1. Default Initialization (Natural Order)
        SortedMap<Integer, String> sortedMap1 = new TreeMap<>();
        sortedMap1.put(3, "Apple");
        sortedMap1.put(1, "Banana");
        sortedMap1.put(2, "Orange");
        System.out.println("SortedMap (Natural Order): " + sortedMap1);

        // 2. Initialization with Custom Comparator (Descending Order)
        SortedMap<Integer, String> sortedMap2 = new TreeMap<>(Collections.reverseOrder());
        sortedMap2.put(3, "Apple");
        sortedMap2.put(1, "Banana");
        sortedMap2.put(2, "Orange");
        System.out.println("SortedMap (Descending Order): " + sortedMap2);

        // 3. Using Another SortedMap
        SortedMap<Integer, String> sortedMap3 = new TreeMap<>(sortedMap1);
        System.out.println("SortedMap (From Another SortedMap): " + sortedMap3);
    }

    public static void sortedMapOperations() {
        SortedMap<Integer, String> sortedMap = new TreeMap<>();

        // 1. Adding Key-Value Pairs
        sortedMap.put(100, "John");
        sortedMap.put(102, "Emma");
        sortedMap.put(101, "Michael");
        sortedMap.put(104, "Alice");
        sortedMap.put(103, "David");
        System.out.println("\nSortedMap after adding elements: " + sortedMap);

        // 2. Accessing First and Last Keys
        System.out.println("First Key: " + sortedMap.firstKey());
        System.out.println("Last Key: " + sortedMap.lastKey());

        // 3. Getting a SubMap (Range View)
        System.out.println("SubMap (101 to 103): " + sortedMap.subMap(101, 104));

        // 4. HeadMap (Elements before a key)
        System.out.println("HeadMap (Before 103): " + sortedMap.headMap(103));

        // 5. TailMap (Elements from a key onwards)
        System.out.println("TailMap (From 102 onwards): " + sortedMap.tailMap(102));

        // 6. Checking Key Existence
        System.out.println("Contains Key 102? " + sortedMap.containsKey(102));

        // 7. Removing a Key
        sortedMap.remove(103);
        System.out.println("SortedMap after removing key 103: " + sortedMap);

        // 8. Iterating Over the Entries
        System.out.println("\nIterating through SortedMap:");
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 9. Clearing the SortedMap
        sortedMap.clear();
        System.out.println("SortedMap after clear(): " + sortedMap);
    }

    public static void main(String[] args) {
        waysToInitialize();
        sortedMapOperations();
    }
}
