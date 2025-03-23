package com.collection.sets;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedSetBasics {

    public static void waysToInitialize() {
        // 1. Using Default Constructor (TreeSet - Natural Sorting Order)
        SortedSet<String> set1 = new TreeSet<>();
        set1.add("Banana");
        set1.add("Apple");
        set1.add("Orange");
        System.out.println("Default Constructor (Natural Order): " + set1);

        // 2. Using Constructor with Comparator (Custom Sorting Order - Reverse Order)
        SortedSet<String> set2 = new TreeSet<>(Comparator.reverseOrder());
        set2.add("Banana");
        set2.add("Apple");
        set2.add("Orange");
        System.out.println("SortedSet with Custom Comparator (Reverse Order): " + set2);

        // 3. Using Arrays.asList() (Converting List to SortedSet)
        SortedSet<String> set3 = new TreeSet<>(Arrays.asList("Apple", "Banana", "Orange"));
        System.out.println("Using Arrays.asList(): " + set3);

        // 4. Using Collections.addAll() (Adding multiple elements)
        SortedSet<String> set4 = new TreeSet<>();
        Collections.addAll(set4, "Apple", "Banana", "Orange");
        System.out.println("Using Collections.addAll(): " + set4);

        // 5. Using Java 8 Stream API
        SortedSet<String> set5 = Stream.of("Apple", "Banana", "Orange").collect(Collectors.toCollection(TreeSet::new));
        System.out.println("Using Stream API: " + set5);

        // 6. Using Copy Constructor (Copying from another SortedSet)
        SortedSet<String> set6 = new TreeSet<>(set5);
        System.out.println("Using Copy Constructor: " + set6);

        // 7. Using Set.of() (Immutable SortedSet - Java 9+)
        SortedSet<String> set7 = new TreeSet<>(Set.of("Apple", "Banana", "Orange"));
        System.out.println("Using Set.of(): " + set7);

        // 8. Using SortedSet with a Custom Comparator (Sorting Integers in Descending Order)
        SortedSet<Integer> set8 = new TreeSet<>((a, b) -> b - a); // Custom Comparator for Descending Order
        set8.addAll(Arrays.asList(5, 1, 3, 2, 4));
        System.out.println("SortedSet with Custom Sorting (Descending Order): " + set8);
    }

    public static void sortedSetOperation() {
        SortedSet<String> set = new TreeSet<>(Arrays.asList("Apple", "Banana", "Orange", "Grapes", "Mango"));
        System.out.println("\nInitial SortedSet: " + set);

        // 1. Adding elements
        set.add("Pineapple");
        set.add("Cherry");
        System.out.println("After Adding Elements: " + set);

        // 2. Removing elements
        set.remove("Banana");
        System.out.println("After Removing 'Banana': " + set);

        // 3. Checking if an element exists
        System.out.println("Contains 'Apple': " + set.contains("Apple"));
        System.out.println("Contains 'Papaya': " + set.contains("Papaya"));

        // 4. Getting First and Last elements
        System.out.println("First Element: " + set.first());
        System.out.println("Last Element: " + set.last());

        // 5. Getting a subset (headSet, tailSet, subSet)
        System.out.println("HeadSet (Elements before 'Mango'): " + set.headSet("Mango"));
        System.out.println("TailSet (Elements from 'Mango' onwards): " + set.tailSet("Mango"));
        System.out.println("SubSet ('Banana' to 'Orange' excluding 'Orange'): " + set.subSet("Apple", "Orange"));

        // 6. Checking size
        System.out.println("Size of SortedSet: " + set.size());

        // 7. Iterating through the SortedSet using forEach
        System.out.println("Iterating over SortedSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // 8. Iterating using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 9. Cloning a SortedSet
        SortedSet<String> clonedSet = new TreeSet<>(set);
        System.out.println("Cloned SortedSet: " + clonedSet);

        // 10. Converting SortedSet to an Array
        String[] array = set.toArray(new String[0]);
        System.out.println("SortedSet converted to Array: " + Arrays.toString(array));

        // 11. Clearing the SortedSet
        set.clear();
        System.out.println("After Clearing SortedSet: " + set);

        // 12. Checking if SortedSet is empty
        System.out.println("Is SortedSet Empty?: " + set.isEmpty());
    }

    public static void main(String[] args) {
        waysToInitialize();
        System.out.println("\n----------------------------------------------\n");
        sortedSetOperation();
    }
}
