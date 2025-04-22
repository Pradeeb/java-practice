package com.java.learn.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {

	public static void main(String[] args) {
		
		Set<String> fruits=new LinkedHashSet<>();
		
		   fruits.add("Banana");
		   fruits.add("Apple");
		   fruits.add("Mango");
		   fruits.add("Banana");  // Duplicate, will be ignored

		   fruits.stream().forEach(System.out::println);

	        // Output:
	        // Banana
	        // Apple
	        // Mango

	}

}
