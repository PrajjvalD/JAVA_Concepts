package com.collection.lists;

import java.util.*;

public class ArrayListBasics {

	public void waysToInitialize() {
		// 1. Using the Default Constructor
		ArrayList<String> arrList = new ArrayList<>();

		// 2. Using the Constructor with Initial Capacity
		ArrayList<String> arrListTwo = new ArrayList<>(15);

		// 3. Using Arrays.asList()
		ArrayList<String> arrListThree = new ArrayList<>(Arrays.asList("yza", "abc", "xyz"));

		// 4. Using Double Brace Initialization
		ArrayList<String> arrListForth = new ArrayList<>() {
			{
				add("abc");
				add("xyz");
				add("yza");
			}
		};

		// 5. Using Java 9+ List.of()
		List<String> arrListFive = List.of("abc", "hgf");

		// 6. Using a for loop to add elements
		ArrayList<Integer> arrListSix = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			arrListSix.add(i);
		}

		// 7. Using Collections.addAll()
		ArrayList<String> arrListSeven = new ArrayList<>();
		Collections.addAll(arrListSeven, "Apple", "Banana", "Cherry");

		 // Output the lists
        System.out.println("List 1: " + arrList);
        System.out.println("List 2: " + arrListTwo);
        System.out.println("List 3: " + arrListThree);
        System.out.println("List 4: " + arrListForth);
        System.out.println("List 5: " + arrListFive);
        System.out.println("List 6: " + arrListSix);
        System.out.println("List 7: " + arrListSeven);
	}

	public void arrayListOperations() {
		// 1. Creating and initializing an ArrayList
		ArrayList<String> arrList = new ArrayList<>();
		System.out.println("1. Creating and initializing an ArrayList: " + arrList);

		// 2. Add elements using add()
		arrList.add("ram");
		arrList.add("shyam");
		System.out.println("2. Add elements using add(): " + arrList);

		// 3. Add an element at a specific index
		arrList.add(1, "hanuman");
		System.out.println("3. Add an element at a specific index: " + arrList);

		// 4. Get elements using get()
		String firstIndexData = arrList.get(0); // First element
		System.out.println("4. Get an element at a specific index: " + firstIndexData);

		// 5. Set/replace an element at a specific index
		arrList.set(2, "Krishna");
		System.out.println("5. Set/replace an element at a specific index: " + arrList);

		// 6. Remove elements using remove()
		arrList.remove("Hanuman"); // Remove by object return- false
		arrList.remove("hanuman"); // Remove by object return- true
		System.out.println("6. Remove elements using remove() by object: " + arrList);
		arrList.remove(0); // Remove by index
		System.out.println("6. Remove elements using remove() by index: " + arrList);

		// 7. Check if an element exists using contains()
		boolean isContains = arrList.contains("Krishna");
		System.out.println("7. Check if an element exists using contains(): " + isContains);

		// 8. Find the index of an element using indexOf()
		System.out.println("8. Find the index of an element using indexOf(): " + arrList.indexOf("Krishna"));
		// if value not present returns -1

		// 9. Get the size of the ArrayList using size()
		System.out.println("9. Get the size of the ArrayList using size(): " + arrList.size());

		// 10. Check if the list is empty using isEmpty()
		boolean isEmpty = arrList.isEmpty();
		System.out.println("10. Check if the list is empty using isEmpty(): " + isEmpty);

		// 11. Clear all elements using clear()
		arrList.clear();
		System.out.println("11. Clear all elements using clear(): " + arrList);

		// 12. Add all elements from another collection using addAll()
		ArrayList<Integer> arrNumList = new ArrayList<>(Arrays.asList(1, 3, 2, 4, 6, 5, 7, 9, 8));
		ArrayList<Integer> arrNumListTwo = new ArrayList<>();
		arrNumListTwo.addAll(arrNumList); // should be same dataType
		System.out.println("12. Add all elements from another collection using addAll(): " + arrNumListTwo);

		// 13. Retain only the elements that are common with another collection using
		ArrayList<Integer> arrNumListThree = new ArrayList<>(Arrays.asList(6, 5, 7));
		arrNumList.retainAll(arrNumListThree); // retainAll()
		System.out.println("13. Retain only the elements that are common with another collection using: " + arrNumList);

		// 14. Remove all elements that are in another collection using removeAll()
		arrNumListThree.removeAll(arrNumListThree);
		System.out.println(
				"14. Remove all elements that are in another collection using removeAll(): " + arrNumListThree);

		// 15. Sort the list using sort()
		Collections.sort(arrNumList);
		System.out.println("15. Sort the list using sort(): " + arrNumList);

		// 16. Convert ArrayList to Array using toArray()
		ArrayList<Integer> arrNumListFour = new ArrayList<>(Arrays.asList(1, 3, 2, 4, 6, 5, 7, 9, 8));
		Integer[] array = new Integer[arrNumListFour.size()];
		arrNumListFour.toArray(array);
		System.out.println("16. Convert ArrayList to Array using toArray()" + Arrays.toString(array));

	}

	public static void main(String[] args) {
		ArrayListBasics arrayListBasics = new ArrayListBasics();
		System.out.println("ArrayList Operations"+"\n-----------------------");
		arrayListBasics.arrayListOperations();
		System.out.println("\nArrayList Initialize"+"\n-----------------------");
		arrayListBasics.waysToInitialize();
	}

}
