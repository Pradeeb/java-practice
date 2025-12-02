package com.java.learn.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;


/*
  Key Features of LinkedHashSet:

    ✅ No duplicates allowed — same as HashSet.

    ✅ Maintains insertion order — unlike HashSet, which is unordered.

    ✅ Allows null — only one null element allowed.

    ✅ Not synchronized — must be synchronized externally for multithreading.

    ✅ Backed by a LinkedHashMap — maintains order via a doubly linked list.

    ✅ Performance — similar to HashSet, with O(1) average time complexity for add(), remove(), and contains().
 */
public class LearnLinkedHashSet {

	public static void main(String[] args) {
		
		Set<String> fruits=new LinkedHashSet<>();
		
		   fruits.add("Banana");
		   fruits.add("Apple");
		   fruits.add("Mango");
		   fruits.add("Banana");  // Duplicate, will be ignored

		   fruits.forEach(System.out::println);

	        // Output:
	        // Banana
	        // Apple
	        // Mango

	}

}
