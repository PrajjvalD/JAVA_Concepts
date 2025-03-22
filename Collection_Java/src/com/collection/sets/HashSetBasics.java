package com.collection.sets;

import java.util.HashSet;

public class HashSetBasics {

	public static void main(String[] args) {
		// Creating an empty HashSet of string entities
        HashSet<String> hs = new HashSet<String>();

        // Adding elements using add() method
        hs.add("Geek");
        hs.add("For");
        hs.add("Geeks");
        hs.add("Geek");
        hs.add("For");

        // Printing all string entries inside the Set
        System.out.println("HashSet : " + hs);

	}

}
