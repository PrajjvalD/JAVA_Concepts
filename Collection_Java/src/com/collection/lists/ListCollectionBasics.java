package com.collection.lists;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListCollectionBasics {

    public static void waysToInitialize() {
        // 1. Using Default Constructor (ArrayList)
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");
        System.out.println("Default Constructor (ArrayList): " + list1);

        // 2. Using Constructor with Initial Capacity
        List<String> list2 = new ArrayList<>(10);
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Orange");
        System.out.println("Constructor with Initial Capacity: " + list2);

        // 3. Using Arrays.asList() (Fixed-Size List)
        List<String> list3 = Arrays.asList("Apple", "Banana", "Orange");
        System.out.println("Using Arrays.asList(): " + list3);

        // 4. Using Collections.addAll()
        List<String> list4 = new ArrayList<>();
        Collections.addAll(list4, "Apple", "Banana", "Orange");
        System.out.println("Using Collections.addAll(): " + list4);

        // 5. Using Java 8 Stream API
        List<String> list5 = Stream.of("Apple", "Banana", "Orange").collect(Collectors.toList());
        System.out.println("Using Stream API: " + list5);

        // 6. Using List.of() (Immutable List - Java 9+)
        List<String> list6 = List.of("Apple", "Banana", "Orange");
        System.out.println("Using List.of(): " + list6);

        // 7. Using Copy Constructor
        List<String> list7 = new ArrayList<>(list1);
        System.out.println("Using Copy Constructor: " + list7);

        // 8. Using LinkedList
        List<String> list8 = new LinkedList<>(list1);
        System.out.println("Using LinkedList: " + list8);

        // 9. Using Vector
        List<String> list9 = new Vector<>(list1);
        System.out.println("Using Vector: " + list9);
    }

    public static void listOperations() {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("\nInitial List: " + list);

        // 1. Adding elements
        list.add(60);
        list.add(1, 15);  // Adding at a specific index
        System.out.println("After Adding Elements: " + list);

        // 2. Removing elements
        list.remove(Integer.valueOf(20)); // Remove by value
        list.remove(2); // Remove by index
        System.out.println("After Removing Elements: " + list);

        // 3. Getting elements
        System.out.println("Element at index 2: " + list.get(2));

        // 4. Updating elements
        list.set(1, 25);
        System.out.println("After Updating index 1: " + list);

        // 5. Checking if an element exists
        System.out.println("Contains 30: " + list.contains(30));
        System.out.println("Contains 100: " + list.contains(100));

        // 6. Getting size of the list
        System.out.println("Size of List: " + list.size());

        // 7. Checking if the list is empty
        System.out.println("Is List Empty?: " + list.isEmpty());

        // 8. Iterating over the list
        System.out.println("Iterating using for-each loop:");
        for (Integer num : list) {
            System.out.println(num);
        }

        // 9. Iterating using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 10. Sorting the List
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        // 11. Reversing the List
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);

        // 12. Converting List to Array
        Integer[] array = list.toArray(new Integer[0]);
        System.out.println("List converted to Array: " + Arrays.toString(array));

        // 13. Cloning a List
        List<Integer> clonedList = new ArrayList<>(list);
        System.out.println("Cloned List: " + clonedList);

        // 14. Removing all elements
        list.clear();
        System.out.println("After Clearing List: " + list);

        // 15. Checking if list is empty after clearing
        System.out.println("Is List Empty after clear?: " + list.isEmpty());
    }

    public static void main(String[] args) {
        waysToInitialize();
        listOperations();
    }
}
