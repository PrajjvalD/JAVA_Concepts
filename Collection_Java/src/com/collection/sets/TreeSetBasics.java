package com.collection.sets;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TreeSetBasics {

    public static void waysToInitialize() {
        // 1. Using Default Constructor (Natural Sorting Order)
        Set<String> set1 = new TreeSet<>();
        set1.add("Banana");
        set1.add("Apple");
        set1.add("Orange");
        System.out.println("Default Constructor (Natural Order): " + set1);

        // 2. Using Constructor with Comparator (Custom Sorting Order - Reverse Order)
        Set<String> set2 = new TreeSet<>(Comparator.reverseOrder());
        set2.add("Banana");
        set2.add("Apple");
        set2.add("Orange");
        System.out.println("TreeSet with Custom Comparator (Reverse Order): " + set2);

        // 3. Using Arrays.asList() (Converting List to TreeSet)
        Set<String> set3 = new TreeSet<>(Arrays.asList("Apple", "Banana", "Orange"));
        System.out.println("Using Arrays.asList(): " + set3);

        // 4. Using Collections.addAll()
        Set<String> set4 = new TreeSet<>();
        Collections.addAll(set4, "Apple", "Banana", "Orange");
        System.out.println("Using Collections.addAll(): " + set4);

        // 5. Using Java 8 Stream API
        Set<String> set5 = Stream.of("Apple", "Banana", "Orange").collect(Collectors.toCollection(TreeSet::new));
        System.out.println("Using Stream API: " + set5);

        // 6. Using another TreeSet (Copy Constructor)
        Set<String> set6 = new TreeSet<>(set5);
        System.out.println("Using Copy Constructor: " + set6);

        // 7. Using Set.of() (Immutable TreeSet - Java 9+)
        Set<String> set7 = new TreeSet<>(Set.of("Apple", "Banana", "Orange"));
        System.out.println("Using Set.of(): " + set7);

        // 8. Using TreeSet with a Custom Comparator (Sorting Integers in Descending Order)
        Set<Integer> set8 = new TreeSet<>((a, b) -> b - a); // Custom Comparator for Descending Order
        set8.addAll(Arrays.asList(5, 1, 3, 2, 4));
        System.out.println("TreeSet with Custom Sorting (Descending Order): " + set8);
    }

    public static void treeSetOperation() {
        TreeSet<String> treeSet = new TreeSet<>();

        // 1. Adding Elements
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("Grapes");
        System.out.println("TreeSet after adding elements: " + treeSet); // Sorted order

        // 2. Removing an Element
        treeSet.remove("Banana");
        System.out.println("TreeSet after removing 'Banana': " + treeSet);

        // 3. Checking if an Element Exists
        System.out.println("Contains 'Apple': " + treeSet.contains("Apple"));
        System.out.println("Contains 'Mango': " + treeSet.contains("Mango"));

        // 4. Checking First and Last Element
        System.out.println("First Element: " + treeSet.first());
        System.out.println("Last Element: " + treeSet.last());

        // 5. Fetching Elements Lower, Higher, Floor, Ceiling
        System.out.println("Lower than 'Orange': " + treeSet.lower("Orange")); // Just before Orange
        System.out.println("Higher than 'Apple': " + treeSet.higher("Apple")); // Just after Apple
        System.out.println("Floor of 'Orange': " + treeSet.floor("Orange")); // Equal or Lower
        System.out.println("Ceiling of 'Banana': " + treeSet.ceiling("Banana")); // Equal or Higher

        // 6. Iterating Using Enhanced For Loop
        System.out.println("Iterating using enhanced for-loop:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }

        // 7. Iterating Using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 8. Iterating in Descending Order
        System.out.println("Descending order iteration:");
        Iterator<String> descIterator = treeSet.descendingIterator();
        while (descIterator.hasNext()) {
            System.out.println(descIterator.next());
        }

        // 9. SubSet, HeadSet, and TailSet Operations
        System.out.println("Subset (from 'Apple' to 'Orange'): " + treeSet.subSet("Apple", "Orange"));
        System.out.println("HeadSet (Elements before 'Orange'): " + treeSet.headSet("Orange"));
        System.out.println("TailSet (Elements from 'Apple' onwards): " + treeSet.tailSet("Apple"));

        // 10. Checking Size
        System.out.println("Size of TreeSet: " + treeSet.size());

        // 11. Checking if the TreeSet is Empty
        System.out.println("Is TreeSet empty?: " + treeSet.isEmpty());

        // 12. Converting TreeSet to Array
        String[] array = treeSet.toArray(new String[0]);
        System.out.println("TreeSet converted to Array: " + Arrays.toString(array));

        // 13. Removing All Elements from Another Collection
        TreeSet<String> removeSet = new TreeSet<>(Arrays.asList("Apple", "Grapes"));
        treeSet.removeAll(removeSet);
        System.out.println("TreeSet after removeAll(): " + treeSet);

        // 14. Retaining Only Elements from Another Collection
        TreeSet<String> retainSet = new TreeSet<>(Arrays.asList("Orange"));
        treeSet.retainAll(retainSet);
        System.out.println("TreeSet after retainAll(): " + treeSet);

        // 15. Poll First and Last Elements
        System.out.println("Polling First Element: " + treeSet.pollFirst());
        System.out.println("Polling Last Element: " + treeSet.pollLast());

        // 16. Clearing the TreeSet
        treeSet.clear();
        System.out.println("TreeSet after clear(): " + treeSet);
        
        // 17. Custom sorting using comparator interface
        TreeSet<Integer> numTreeSet = new TreeSet<>();
        // 1. Adding Elements
        numTreeSet.add(12);
        numTreeSet.add(2);
        numTreeSet.add(1);
        numTreeSet.add(12);
        numTreeSet.add(16);
        TreeSet<Integer> numCompTreeSet = new TreeSet<>(new mySorting());
        numCompTreeSet.add(12);
        numCompTreeSet.add(2);
        numCompTreeSet.add(1);
        numCompTreeSet.add(12);
        numCompTreeSet.add(16);
        System.out.println("TreeSet after adding elements with natural sorting order: " + numTreeSet);
        System.out.println("TreeSet after adding elements with custom sorting order: " + numCompTreeSet);

    }

    public static void main(String[] args) {
        waysToInitialize();
        System.out.println("\n-----------------------------------------\n");
        treeSetOperation();
    }
}

class mySorting implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		Integer d1 = (Integer) o1;
		Integer d2 = (Integer) o2;
		if (d1<d2) return +1;
		if (d1>d2) return -1;
		else return 0;			
	}
	
}
