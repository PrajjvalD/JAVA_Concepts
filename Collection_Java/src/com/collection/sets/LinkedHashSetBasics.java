package com.collection.sets;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class LinkedHashSetBasics {
    public static void waysToInitialize() {
        // 1. Using Default Constructor
        Set<String> set1 = new LinkedHashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Orange");
        System.out.println("Default Constructor: " + set1);

        // 2. Using Constructor with Initial Capacity
        Set<String> set2 = new LinkedHashSet<>(10);
        set2.add("Apple");
        set2.add("Banana");
        set2.add("Orange");
        System.out.println("Constructor with Initial Capacity: " + set2);

        // 3. Using Constructor with Initial Capacity & Load Factor
        Set<String> set3 = new LinkedHashSet<>(10, 0.75f);
        set3.add("Apple");
        set3.add("Banana");
        set3.add("Orange");
        System.out.println("Constructor with Capacity & Load Factor: " + set3);

        // 4. Using Arrays.asList()
        Set<String> set4 = new LinkedHashSet<>(Arrays.asList("Apple", "Banana", "Orange"));
        System.out.println("Using Arrays.asList(): " + set4);

        // 5. Using Collections.addAll()
        Set<String> set5 = new LinkedHashSet<>();
        Collections.addAll(set5, "Apple", "Banana", "Orange");
        System.out.println("Using Collections.addAll(): " + set5);

        // 6. Using Java 8 Stream API
        Set<String> set6 = Stream.of("Apple", "Banana", "Orange").collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println("Using Stream API: " + set6);
    }
    
    public static void linkedHashSetOperation() {
        Set<String> set = new LinkedHashSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");
        System.out.println("LinkedHashSet after adding elements: " + set);

        // Removing an element
        set.remove("Banana");
        System.out.println("LinkedHashSet after removing 'Banana': " + set);

        // Checking if an element exists
        System.out.println("Contains 'Apple': " + set.contains("Apple"));
        System.out.println("Contains 'Mango': " + set.contains("Mango"));

        // Iterating through the set using enhanced for-loop
        System.out.println("Iterating using enhanced for-loop:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Iterating using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Checking size of the set
        System.out.println("Size of LinkedHashSet: " + set.size());

        // Checking if the set is empty
        System.out.println("Is LinkedHashSet empty?: " + set.isEmpty());

        // Cloning the LinkedHashSet
        Set<String> clonedSet = new LinkedHashSet<>(set);
        System.out.println("Cloned LinkedHashSet: " + clonedSet);

        // Converting LinkedHashSet to an Array
        String[] array = set.toArray(new String[0]);
        System.out.println("LinkedHashSet converted to Array: " + Arrays.toString(array));

        // Removing all elements from another collection
        Set<String> removeSet = new LinkedHashSet<>(Arrays.asList("Apple", "Grapes"));
        set.removeAll(removeSet);
        System.out.println("LinkedHashSet after removeAll(): " + set);

        // Retaining only elements from another collection
        Set<String> retainSet = new LinkedHashSet<>(Arrays.asList("Orange"));
        set.retainAll(retainSet);
        System.out.println("LinkedHashSet after retainAll(): " + set);

        // Clearing all elements
        set.clear();
        System.out.println("LinkedHashSet after clear(): " + set);
    }

    
    public static void main(String[] args) {
        waysToInitialize();
        System.out.println("\n----------------------------------------\n");
        linkedHashSetOperation();
    }
}