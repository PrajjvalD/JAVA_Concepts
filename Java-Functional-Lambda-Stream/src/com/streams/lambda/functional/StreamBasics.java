package com.streams.lambda.functional;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBasics {

    // Method to demonstrate various ways to initialize a Stream
    public static void waysToInitializeStream() {
        // 1. Creating a Stream from a Collection (List)
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry", "Mango", "Orange");
        Stream<String> streamFromList = list.stream();
        System.out.println("Stream from List: " + streamFromList.collect(Collectors.toList()));

        // 2. Creating a Stream from an Array
        String[] array = {"Red", "Green", "Blue"};
        Stream<String> streamFromArray = Arrays.stream(array);
        System.out.println("Stream from Array: " + streamFromArray.collect(Collectors.toList()));

        // 3. Using Stream.of()
        Stream<String> streamOfElements = Stream.of("One", "Two", "Three");
        System.out.println("Stream.of() Example: " + streamOfElements.collect(Collectors.toList()));

        // 4. Using Stream.iterate() (Generates an infinite stream)
        List<Integer> evenNumbers = Stream.iterate(0, n -> n + 2)
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("First 5 Even Numbers using Stream.iterate(): " + evenNumbers);

        // 5. Using Stream.generate() (Generates random numbers)
        List<Double> randomNumbers = Stream.generate(Math::random)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Random Numbers using Stream.generate(): " + randomNumbers);

        // 6. Creating a Numeric Stream using IntStream.range()
        List<Integer> rangeList = IntStream.range(1, 6)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Stream from IntStream.range(1,6): " + rangeList);

        // 7. Creating a Parallel Stream
        Stream<String> parallelStream = list.parallelStream();
        System.out.println("Parallel Stream Example: " + parallelStream.collect(Collectors.toList()));
        
        // 8. Creating a stream from Array for primitive dataType
        int[] strArray = {1,5,87,90,7,5};
		IntStream arrStream =  Arrays.stream(strArray);
        System.out.print("Stream from Array for Primitive DataType: \n");
        arrStream.forEach(System.out::println);
        
        // 9. Creating a stream from 2D Array
        int[][] twoDArray = {{1,5,87,90,7,5},{11,5,87,90,17,15}};
		IntStream twoDStream =  Arrays.stream(twoDArray).flatMapToInt(Arrays::stream);
        System.out.print("Stream from 2D Array: \n");
        twoDStream.forEach(System.out::println);
        
    }

    // Method to demonstrate various operations on a Stream
    public static void operationStream() {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Mango", "Orange");

        // Filtering elements (Keeps only elements starting with 'A')
        List<String> filteredList = fruits.stream()
                .filter(fruit -> fruit.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Filtered List (Fruits starting with 'A'): " + filteredList);

        // Mapping elements (Convert to uppercase)
        List<String> upperCaseList = fruits.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Mapped List (Uppercase): " + upperCaseList);

        // Sorting elements
        List<String> sortedList = fruits.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted List: " + sortedList);

        // Counting elements
        long count = fruits.stream().count();
        System.out.println("Count of elements: " + count);

        // Reducing elements (Concatenating all)
        String reducedString = fruits.stream()
                .reduce((fruit1, fruit2) -> fruit1 + ", " + fruit2)
                .orElse("No fruits");
        System.out.println("Reduced String: " + reducedString);

        // Collecting elements into a Set (removes duplicates)
        Set<String> uniqueFruits = fruits.stream().collect(Collectors.toSet());
        System.out.println("Collected Set (Unique Fruits): " + uniqueFruits);

        // Finding the first element
        Optional<String> firstElement = fruits.stream().findFirst();
        System.out.println("First Element: " + firstElement.orElse("No elements"));

        // Checking if any element matches a condition
        boolean anyMatch = fruits.stream().anyMatch(fruit -> fruit.length() > 5);
        System.out.println("Any element with length > 5: " + anyMatch);

        // Checking if all elements match a condition
        boolean allMatch = fruits.stream().allMatch(fruit -> fruit.length() > 2);
        System.out.println("All elements have length > 2: " + allMatch);

        // Checking if none of the elements match a condition
        boolean noneMatch = fruits.stream().noneMatch(fruit -> fruit.startsWith("Z"));
        System.out.println("None of the elements start with 'Z': " + noneMatch);

        // Using distinct() to remove duplicates
        List<String> duplicateFruits = Arrays.asList("Apple", "Banana", "Apple", "Cherry", "Mango");
        List<String> distinctList = duplicateFruits.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct List: " + distinctList);

        // Using limit() to get the first 3 elements
        List<String> limitedList = fruits.stream()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Limited List (First 3 elements): " + limitedList);

        // Using skip() to skip first 2 elements
        List<String> skippedList = fruits.stream()
                .skip(2)
                .collect(Collectors.toList());
        System.out.println("Skipped List (After skipping 2 elements): " + skippedList);

        // Using forEach() to print elements
        System.out.println("Using forEach to print elements:");
        fruits.stream().forEach(System.out::println);

        // Parallel Stream for performance improvement
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int parallelSum = Arrays.stream(numbers)
                .parallel()
                .sum();
        System.out.println("Sum using Parallel Stream: " + parallelSum);
    }

    public static void main(String[] args) {
        System.out.println("=== Ways to Initialize Streams ===");
        waysToInitializeStream();
        
        System.out.println("\n=== Operations on Streams ===");
        operationStream();
    }
}
