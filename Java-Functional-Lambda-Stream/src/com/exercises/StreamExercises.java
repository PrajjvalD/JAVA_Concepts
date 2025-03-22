package com.exercises;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExercises {

	public static void main(String[] args) {
		List<Integer> numList = List.of(12, 4, 13, 76, 89, 6, 78, 87, 6, 12, 4);
		List<String> strList = List.of("Science", "Mathmatics", "Hindi", "English", "Chymistry", "Biology", "Physics",
				"Math");

		printOddNumberFromList(numList);
		System.out.println("\n-----------------------------------------\n");
		printAllCoursesIndividually(strList);
		System.out.println("\n-----------------------------------------\n");
		printCoursesContaingWords(strList);
		System.out.println("\n-----------------------------------------\n");
		printCoursesContainsMoreThanFourChar(strList);
		System.out.println("\n-----------------------------------------\n");
		printCubesOfOddNumbers(numList);
		System.out.println("\n-----------------------------------------\n");
		printNumuberCharEachCourses(strList);
		System.out.println("\n-----------------------------------------\n");
		printSumOfSquareAfterSquareEachNum(numList);
		System.out.println("\n-----------------------------------------\n");
		createListWithEvenNumberFiltered(numList);
		System.out.println("\n-----------------------------------------\n");
		createListWithoutDuplicateAndOddNum(numList);
	}

	// print odd number from list
	private static void printOddNumberFromList(List<Integer> numList) {
		System.out.println("1. print odd number from list");
		numList.stream().filter(x -> x % 2 != 0).forEach(System.out::println);
	}

	// print all courses individually
	private static void printAllCoursesIndividually(List<String> strList) {
		System.out.println("2. print all courses individually");
		strList.stream().forEach(System.out::println);
	}

	// print courses containing math
	private static void printCoursesContaingWords(List<String> strList) {
		System.out.println("3. print courses containing math");
		strList.stream().filter(x -> x.contains("Math")).forEach(System.out::println);
	}

	// print courses containing more than 4 characters
	private static void printCoursesContainsMoreThanFourChar(List<String> strList) {
		System.out.println("4. print courses containing more than 4 characters");
		strList.stream().filter(x -> x.length() >= 4).forEach(System.out::println);
	}

	// Print the cubes of odd numbers
	private static void printCubesOfOddNumbers(List<Integer> numList) {
		System.out.println("5. Print the cubes of odd numbers");
		numList.stream().filter(x -> x % 2 != 0).map(x -> x * x * x).forEach(System.out::println);
	}

	// Print the number of characters in each course name
	private static void printNumuberCharEachCourses(List<String> strList) {
		System.out.println("6. Print the number of characters in each course name");
		strList.stream().map(x -> x.length()).forEach(System.out::println);
	}

	// Square every number in a list and find the sum of squares
	private static void printSumOfSquareAfterSquareEachNum(List<Integer> numList) {
		System.out.println("7. Square every number in a list and find the sum of squares");
		Integer sqrSumList = numList.stream().map(x -> x * x).reduce(0, Integer::sum);
		System.out.println(sqrSumList);
	}

	// Create a List with Even Numbers Filtered from the Numbers List
	private static void createListWithEvenNumberFiltered(List<Integer> numList) {
		System.out.println("8. Create a List with Even Numbers Filtered from the Numbers List");
		List<Integer> newNumList = numList.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println("new list with filtered even number");
		newNumList.stream().forEach(System.out::println);
	}

	// Create a List without duplicates and odd numbers
	private static void createListWithoutDuplicateAndOddNum(List<Integer> numList) {
		System.out.println("9. Create a List without duplicates and odd numbers");
		List<Integer> newNumList = numList.stream().filter(x -> x % 2 == 0).distinct().collect(Collectors.toList());
		System.out.println("new list with filtered even number and without duplicates");
		newNumList.stream().forEach(System.out::println);
	}

}
