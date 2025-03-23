package com.collection.sets;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NavigableSetBasics {

    public static void waysToInitialize() {
        // 1. Using Default Constructor (TreeSet - Natural Sorting Order)
        NavigableSet<String> set1 = new TreeSet<>();
        set1.add("Banana");
        set1.add("Apple");
        set1.add("Orange");
        System.out.println("Default Constructor (Natural Order): " + set1);

        // 2. Using Constructor with Comparator (Custom Sorting Order - Reverse Order)
        NavigableSet<String> set2 = new TreeSet<>(Comparator.reverseOrder());
        set2.add("Banana");
        set2.add("Apple");
        set2.add("Orange");
        System.out.println("NavigableSet with Custom Comparator (Reverse Order): " + set2);

        // 3. Using Arrays.asList() (Converting List to NavigableSet)
        NavigableSet<String> set3 = new TreeSet<>(Arrays.asList("Apple", "Banana", "Orange"));
        System.out.println("Using Arrays.asList(): " + set3);

        // 4. Using Collections.addAll()
        NavigableSet<String> set4 = new TreeSet<>();
        Collections.addAll(set4, "Apple", "Banana", "Orange");
        System.out.println("Using Collections.addAll(): " + set4);

        // 5. Using Java 8 Stream API
        NavigableSet<String> set5 = Stream.of("Apple", "Banana", "Orange")
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("Using Stream API: " + set5);

        // 6. Using Copy Constructor
        NavigableSet<String> set6 = new TreeSet<>(set5);
        System.out.println("Using Copy Constructor: " + set6);
    }

    public static void navigableSetOperation() {
        NavigableSet<Integer> set = new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("\nInitial NavigableSet: " + set);

        // 1. Adding elements
        set.add(25);
        set.add(5);
        System.out.println("After Adding Elements: " + set);

        // 2. Removing elements
        set.remove(20);
        System.out.println("After Removing '20': " + set);

        // 3. Checking if an element exists
        System.out.println("Contains 30: " + set.contains(30));
        System.out.println("Contains 100: " + set.contains(100));

        // 4. Getting First and Last elements
        System.out.println("First Element: " + set.first());
        System.out.println("Last Element: " + set.last());

        // 5. Getting Subsets
        System.out.println("HeadSet (Elements before 30): " + set.headSet(30));
        System.out.println("TailSet (Elements from 30 onwards): " + set.tailSet(30));
        System.out.println("SubSet (10 to 40 excluding 40): " + set.subSet(10, 40));

        // 6. NavigableSet Specific Methods
        System.out.println("Lower (Just less than 30): " + set.lower(30));
        System.out.println("Floor (Less than or equal to 30): " + set.floor(30));
        System.out.println("Ceiling (Greater than or equal to 30): " + set.ceiling(30));
        System.out.println("Higher (Just greater than 30): " + set.higher(30));

        // 7. Polling First and Last Elements
        System.out.println("Polling First Element: " + set.pollFirst());
        System.out.println("Polling Last Element: " + set.pollLast());
        System.out.println("After Polling First and Last: " + set);

        // 8. Reverse Order View
        NavigableSet<Integer> reversedSet = set.descendingSet();
        System.out.println("Reverse Order NavigableSet: " + reversedSet);

        // 9. Checking size
        System.out.println("Size of NavigableSet: " + set.size());

        // 10. Iterating through the NavigableSet using forEach
        System.out.println("Iterating over NavigableSet:");
        for (Integer num : set) {
            System.out.println(num);
        }

        // 11. Iterating using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 12. Cloning a NavigableSet
        NavigableSet<Integer> clonedSet = new TreeSet<>(set);
        System.out.println("Cloned NavigableSet: " + clonedSet);

        // 13. Clearing the NavigableSet
        set.clear();
        System.out.println("After Clearing NavigableSet: " + set);

        // 14. Checking if NavigableSet is empty
        System.out.println("Is NavigableSet Empty?: " + set.isEmpty());
    }

    public static void main(String[] args) {
        waysToInitialize();
        System.out.println("\n-------------------------------------\n");
        navigableSetOperation();
    }
}
