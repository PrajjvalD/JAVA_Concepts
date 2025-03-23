package com.collection.sets;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SetCollectionBasics {

    public static void waysToInitialize() {
        // 1. Using Default Constructor (HashSet)
        Set<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Orange");
        System.out.println("Default Constructor (HashSet): " + set1);

        // 2. Using Constructor with Initial Capacity
        Set<String> set2 = new HashSet<>(10);
        set2.add("Apple");
        set2.add("Banana");
        set2.add("Orange");
        System.out.println("Constructor with Initial Capacity: " + set2);

        // 3. Using Constructor with Capacity & Load Factor
        Set<String> set3 = new HashSet<>(10, 0.75f);
        set3.add("Apple");
        set3.add("Banana");
        set3.add("Orange");
        System.out.println("Constructor with Capacity & Load Factor: " + set3);

        // 4. Using Arrays.asList() (Creates a HashSet from a List)
        Set<String> set4 = new HashSet<>(Arrays.asList("Apple", "Banana", "Orange"));
        System.out.println("Using Arrays.asList(): " + set4);

        // 5. Using Collections.addAll()
        Set<String> set5 = new HashSet<>();
        Collections.addAll(set5, "Apple", "Banana", "Orange");
        System.out.println("Using Collections.addAll(): " + set5);

        // 6. Using Java 8 Stream API
        Set<String> set6 = Stream.of("Apple", "Banana", "Orange").collect(Collectors.toSet());
        System.out.println("Using Stream API: " + set6);

        // 7. Using Set.of() (Immutable Set - Java 9+)
        Set<String> set7 = Set.of("Apple", "Banana", "Orange");
        System.out.println("Using Set.of(): " + set7);

        // 8. Using LinkedHashSet (Maintains Insertion Order)
        Set<String> set8 = new LinkedHashSet<>(Arrays.asList("Apple", "Banana", "Orange"));
        System.out.println("Using LinkedHashSet: " + set8);

        // 9. Using TreeSet (Sorted Order)
        Set<String> set9 = new TreeSet<>(Arrays.asList("Apple", "Banana", "Orange"));
        System.out.println("Using TreeSet (Sorted Set): " + set9);
    }

    public static void setOperations() {
        Set<Integer> set = new HashSet<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("\nInitial Set: " + set);

        // 1. Adding elements
        set.add(60);
        set.add(30); // Duplicates are ignored in Set
        System.out.println("After Adding Elements: " + set);

        // 2. Removing elements
        set.remove(20);
        System.out.println("After Removing 20: " + set);

        // 3. Checking if an element exists
        System.out.println("Contains 30: " + set.contains(30));
        System.out.println("Contains 100: " + set.contains(100));

        // 4. Checking size of the set
        System.out.println("Size of Set: " + set.size());

        // 5. Checking if the set is empty
        System.out.println("Is Set Empty?: " + set.isEmpty());

        // 6. Iterating over the set (Using enhanced for-loop)
        System.out.println("Iterating using for-each loop:");
        for (Integer num : set) {
            System.out.println(num);
        }

        // 7. Iterating using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 8. Cloning the Set
        Set<Integer> clonedSet = new HashSet<>(set);
        System.out.println("Cloned Set: " + clonedSet);

        // 9. Converting Set to an Array
        Integer[] array = set.toArray(new Integer[0]);
        System.out.println("Set converted to Array: " + Arrays.toString(array));

        // 10. Removing all elements from another collection
        Set<Integer> removeSet = new HashSet<>(Arrays.asList(10, 30));
        set.removeAll(removeSet);
        System.out.println("After removeAll(): " + set);

        // 11. Retaining only elements from another collection
        Set<Integer> retainSet = new HashSet<>(Arrays.asList(50, 60));
        set.retainAll(retainSet);
        System.out.println("After retainAll(): " + set);

        // 12. Clearing all elements
        set.clear();
        System.out.println("After Clearing Set: " + set);
    }

    public static void main(String[] args) {
        waysToInitialize();
        setOperations();
    }
}
