package com.collection.maps;

import java.util.*;

public class HashtableBasics {

    // Different ways to initialize Hashtable
    public static void waysToInitialize() {
        // 1. Default Constructor
        Hashtable<Integer, String> table1 = new Hashtable<>();
        table1.put(1, "Apple");
        table1.put(2, "Banana");
        table1.put(3, "Cherry");
        System.out.println("Default Constructor: " + table1);

        // 2. Using Initial Capacity
        Hashtable<Integer, String> table2 = new Hashtable<>(10);
        table2.put(100, "Java");
        table2.put(200, "Python");
        System.out.println("Constructor with Initial Capacity: " + table2);

        // 3. Initializing with another Map
        Hashtable<Integer, String> table3 = new Hashtable<>(table1);
        System.out.println("Initialized with another Hashtable: " + table3);

        // 4. Using Load Factor (Capacity & Load Factor)
        Hashtable<Integer, String> table4 = new Hashtable<>(10, 0.75f);
        table4.put(5, "Dog");
        table4.put(6, "Cat");
        System.out.println("Using Capacity & Load Factor: " + table4);
    }

    // Hashtable Operations
    public static void hashtableOperations() {
        Hashtable<Integer, String> table = new Hashtable<>();

        // 1. Adding Elements
        table.put(1, "Red");
        table.put(2, "Blue");
        table.put(3, "Green");
        table.put(4, "Yellow");
        System.out.println("\nHashtable after adding elements: " + table);

        // 2. Getting a Value
        System.out.println("Get value for key 2: " + table.get(2));

        // 3. Removing an Entry
        table.remove(3);
        System.out.println("After removing key 3: " + table);

        // 4. Checking if a Key Exists
        System.out.println("Contains key 4? " + table.containsKey(4));

        // 5. Checking if a Value Exists
        System.out.println("Contains value 'Blue'? " + table.containsValue("Blue"));

        // 6. Iterating through Keys
        System.out.println("Iterating through keys:");
        for (Integer key : table.keySet()) {
            System.out.println("Key: " + key + ", Value: " + table.get(key));
        }

        // 7. Iterating through Entries
        System.out.println("Iterating through key-value pairs:");
        for (Map.Entry<Integer, String> entry : table.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 8. Getting Size
        System.out.println("Size of Hashtable: " + table.size());

        // 9. Checking if Hashtable is Empty
        System.out.println("Is Hashtable empty? " + table.isEmpty());

        // 10. Cloning the Hashtable
        Hashtable<Integer, String> clonedTable = (Hashtable<Integer, String>) table.clone();
        System.out.println("Cloned Hashtable: " + clonedTable);

        // 11. Clearing the Hashtable
        table.clear();
        System.out.println("Hashtable after clear(): " + table);
    }

    public static void main(String[] args) {
        waysToInitialize();
        hashtableOperations();
    }
}
