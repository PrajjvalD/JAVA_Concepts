package com.collection.sets;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashSetBasics {

	public static void waysToInitialize() {
		// 1. Using Default Constructor
		Set<String> set1 = new HashSet<>();
		set1.add("Apple");
		set1.add("Banana");
		set1.add("Orange");
		System.out.println("Default Constructor: " + set1);

		// 2. Using Constructor with Initial Capacity
		Set<String> set2 = new HashSet<>(10);
		set2.add("Apple");
		set2.add("Banana");
		set2.add("Orange");
		System.out.println("Constructor with Initial Capacity: " + set2);

		// 3. Using Constructor with Initial Capacity & Load Factor
		Set<String> set3 = new HashSet<>(10, 0.75f);
		set3.add("Apple");
		set3.add("Banana");
		set3.add("Orange");
		System.out.println("Constructor with Capacity & Load Factor: " + set3);

		// 4. Using Arrays.asList()
		Set<String> set4 = new HashSet<>(Arrays.asList("Apple", "Banana", "Orange"));
		System.out.println("Using Arrays.asList(): " + set4);

		// 5. Using Double Brace Initialization (Not Recommended for Production)
		Set<String> set5 = new HashSet<String>() {
			{
				add("Apple");
				add("Banana");
				add("Orange");
			}
		};
		System.out.println("Double Brace Initialization: " + set5);

		// 6. Using Collections.addAll()
		Set<String> set6 = new HashSet<>();
		Collections.addAll(set6, "Apple", "Banana", "Orange");
		System.out.println("Using Collections.addAll(): " + set6);

		// 7. Using Java 8 Stream API
		Set<String> set7 = Stream.of("Apple", "Banana", "Orange").collect(Collectors.toSet());
		System.out.println("Using Stream API: " + set7);

		// 8. Using Set.of() (Immutable Set - Java 9+)
		Set<String> set8 = Set.of("Apple", "Banana", "Orange");
		System.out.println("Using Set.of(): " + set8);
	}

	public static void hashSetOperation() {
		Set<String> set = new HashSet<>();

		// Adding elements
		set.add("Apple");
		set.add("Banana");
		set.add("Orange");
		set.add("Grapes");
		System.out.println("HashSet after adding elements: " + set);

		// Removing an element
		set.remove("Banana");
		System.out.println("HashSet after removing 'Banana': " + set);

		// Checking if an element exists
		System.out.println("Contains 'Apple': " + set.contains("Apple"));
		System.out.println("Contains 'Mango': " + set.contains("Mango"));

		// Iterating through the set
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
		System.out.println("Size of HashSet: " + set.size());

		// Checking if set is empty
		System.out.println("Is HashSet empty?: " + set.isEmpty());

		// Cloning the HashSet
		Set<String> clonedSet = new HashSet<>(set);
		System.out.println("Cloned HashSet: " + clonedSet);

		// Converting HashSet to an Array
		String[] array = set.toArray(new String[0]);
		System.out.println("HashSet converted to Array: " + Arrays.toString(array));

		// Removing all elements from another collection
		Set<String> removeSet = new HashSet<>(Arrays.asList("Apple", "Grapes"));
		set.removeAll(removeSet);
		System.out.println("HashSet after removeAll(): " + set);

		// Retaining only elements from another collection
		Set<String> retainSet = new HashSet<>(Arrays.asList("Orange"));
		set.retainAll(retainSet);
		System.out.println("HashSet after retainAll(): " + set);

		// Clearing all elements
		set.clear();
		System.out.println("HashSet after clear(): " + set);
	}

	public static void main(String[] args) {
		waysToInitialize();
		System.out.println("\n-----------------------------------------------\n");
		hashSetOperation();
	}
}
