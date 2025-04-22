package com.java.learn.collection.set;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 🌲 What is TreeSet?

TreeSet is a part of the Java Collections Framework that implements the NavigableSet interface (which extends SortedSet). 
It stores elements in sorted (ascending) order, based on natural ordering or a custom comparator.

✅ Key Features of TreeSet:
Feature	                     Description
Sorted Order	             Maintains elements in natural ascending order (e.g., 1, 2, 3 or A, B, C).
No duplicates	             Does not allow duplicate elements.
Does not allow null          Adding null throws NullPointerException if the set is not empty.
Not synchronized	         Must be synchronized externally if needed in multithreading.
Based on Red-Black Tree	     Internally uses a self-balancing binary search tree (Red-Black Tree).
Slower than HashSet	         Operations like add, remove, contains take O(log n) time.
 * */

public class TreeSetExample {
	public static void main(String[] args) {
		SortedSet<Integer> numbers = new TreeSet<>();

		numbers.add(10);
		numbers.add(5);
		numbers.add(20);
		numbers.add(1);
		numbers.add(10); // Duplicate, ignored

		System.out.println("TreeSet in ascending order:");
		numbers.forEach(System.out::println);

		// Output:
		// 1
		// 5
		// 10
		// 20

		// Example with Custom Comparator (Descending Order):
		SortedSet<String> names = new TreeSet<>(Comparator.reverseOrder());

		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");

		System.out.println("TreeSet in descending order:");
		names.stream().forEach(x -> System.out.println(x));
	}
}
