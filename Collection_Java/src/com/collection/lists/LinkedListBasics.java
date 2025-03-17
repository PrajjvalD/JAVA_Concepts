package com.collection.lists;


import java.util.*;

public class LinkedListBasics {
	
	public void waysToInitialize(){
		
		  // 1. Default constructor
        LinkedList<String> list1 = new LinkedList<>();
        
        // 2. Using constructor with another collection
        List<String> arrayList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        LinkedList<String> list2 = new LinkedList<>(arrayList);
        
        // 3. Using Arrays.asList
        LinkedList<String> list3 = new LinkedList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        
        // 4. Double Brace Initialization
        LinkedList<String> list4 = new LinkedList<String>() {{
            add("Apple");
            add("Banana");
            add("Cherry");
        }};
        
        // 5. Using Java 9+ List.of()
        LinkedList<String> list5 = new LinkedList<>(List.of("Apple", "Banana", "Cherry"));
        
        // 6. Using a for loop
        LinkedList<Integer> list6 = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list6.add(i);
        }
        
        // 7. Using Collections.addAll()
        LinkedList<String> list7 = new LinkedList<>();
        Collections.addAll(list7, "Apple", "Banana", "Cherry");
        
        // 8. Using a single element
        LinkedList<String> list8 = new LinkedList<>();
        list8.add("Apple");
        
        // Output the lists
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("List 3: " + list3);
        System.out.println("List 4: " + list4);
        System.out.println("List 5: " + list5);
        System.out.println("List 6: " + list6);
        System.out.println("List 7: " + list7);
        System.out.println("List 8: " + list8);
	}

	public void linkedListOperations() {
		// Create a LinkedList of Strings
        LinkedList<String> list = new LinkedList<>();

        // 1. add(E e) - Adds an element at the end of the list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("After add: " + list);

        // 2. addFirst(E e) - Adds an element at the beginning of the list
        list.addFirst("Mango");
        System.out.println("After addFirst: " + list);

        // 3. addLast(E e) - Adds an element at the end of the list (same as add)
        list.addLast("Peach");
        System.out.println("After addLast: " + list);

        // 4. offer(E e) - Adds an element at the end of the list (for queues)
        list.offer("Pineapple");
        System.out.println("After offer: " + list);

        // 5. add(index, E element) - Inserts the element at the specified index
        list.add(2, "Grapes");
        System.out.println("After add(index, element): " + list);

        // 6. get(int index) - Retrieves the element at the specified index
        String firstElement = list.get(0);
        System.out.println("First element: " + firstElement);

        // 7. getFirst() - Retrieves the first element in the list
        String first = list.getFirst();
        System.out.println("First element (getFirst): " + first);

        // 8. getLast() - Retrieves the last element in the list
        String last = list.getLast();
        System.out.println("Last element (getLast): " + last);

        // 9. set(int index, E element) - Replaces the element at the specified index
        list.set(1, "Strawberry");
        System.out.println("After set(index, element): " + list);

        // 10. remove() - Removes and returns the first element of the list
        String removed = list.remove();
        System.out.println("Removed (remove): " + removed);
        System.out.println("After remove: " + list);

        // 11. removeFirst() - Removes and returns the first element
        String removedFirst = list.removeFirst();
        System.out.println("Removed first (removeFirst): " + removedFirst);
        System.out.println("After removeFirst: " + list);

        // 12. removeLast() - Removes and returns the last element
        String removedLast = list.removeLast();
        System.out.println("Removed last (removeLast): " + removedLast);
        System.out.println("After removeLast: " + list);

        // 13. remove(Object o) - Removes the first occurrence of the specified element
        list.remove("Banana");
        System.out.println("After remove(Object o): " + list);

        // 14. remove(int index) - Removes the element at the specified index
        list.remove(2);
        System.out.println("After remove(index): " + list);

        // 15. poll() - Removes and returns the first element, or returns null if the list is empty
        String pollResult = list.poll();
        System.out.println("Poll result (poll): " + pollResult);
        System.out.println("After poll: " + list);

        // 16. contains(Object o) - Checks if the list contains the specified element
        boolean containsApple = list.contains("Apple");
        System.out.println("Contains 'Apple': " + containsApple);

        // 17. indexOf(Object o) - Returns the index of the first occurrence of the specified element
        int index = list.indexOf("Peach");
        System.out.println("Index of 'Peach': " + index);

        // 18. lastIndexOf(Object o) - Returns the index of the last occurrence of the specified element
        list.add("Peach");
        int lastIndex = list.lastIndexOf("Peach");
        System.out.println("Last index of 'Peach': " + lastIndex);

        // 19. isEmpty() - Checks if the list is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);

        // 20. size() - Returns the number of elements in the list
        int size = list.size();
        System.out.println("Size of the list: " + size);

        // 21. clear() - Removes all elements from the list
        list.clear();
        System.out.println("After clear: " + list);

        // 22. offerFirst(E e) - Adds an element at the beginning (for queues)
        list.offerFirst("Apple");
        list.offerFirst("Banana");
        System.out.println("After offerFirst: " + list);

        // 23. offerLast(E e) - Adds an element at the end (for queues)
        list.offerLast("Cherry");
        System.out.println("After offerLast: " + list);

        // 24. peek() - Retrieves, but does not remove, the first element of the list
        String peekResult = list.peek();
        System.out.println("Peek result (peek): " + peekResult);

        // 25. peekFirst() - Retrieves, but does not remove, the first element
        String peekFirstResult = list.peekFirst();
        System.out.println("Peek First result (peekFirst): " + peekFirstResult);

        // 26. peekLast() - Retrieves, but does not remove, the last element
        String peekLastResult = list.peekLast();
        System.out.println("Peek Last result (peekLast): " + peekLastResult);

	}

    public static void main(String[] args) {
    	LinkedListBasics linkedListBasics = new LinkedListBasics();
    	linkedListBasics.waysToInitialize();
    	linkedListBasics.linkedListOperations();
    }
}
