package com.java.learn.collection.set;

import java.util.HashSet;
import java.util.Set;

/*
 In Java, a HashSet is part of the java.util package and implements the Set interface, backed by a HashMap. It stores unique elements and doesn't maintain any order.

There is no concept of a "key" in a HashSet like in a HashMap. However, internally, it uses the element itself as a key in a HashMap with a dummy value (like PRESENT = new Object()).
✅ Key Features of HashSet:

    No duplicates allowed.

    Unordered collection – insertion order is not preserved.

    Allows null – only one null element.

    Not synchronized – needs external synchronization if used in multithreaded context.

    Backed by HashMap.

    Fast operations – average time complexity for add, remove, and contains is O(1).

🔧 Internal working:

HashSet<String> set = new HashSet<>();
set.add("Apple");

Internally:

// Internally uses a HashMap
map.put("Apple", PRESENT);  // PRESENT is a dummy Object

*/

public class HashSetLearn {

	public static void main(String[] args) {
		
		Set<String> fruits=new HashSet<>();
		
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add(null);
		fruits.add("pinapple");
		fruits.add("Orange");
		fruits.add("Apple"); // Duplicate, won't be added
		
	    // Displaying elements
        System.out.println("Fruits set: " + fruits);

        // Check if element exists
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // Remove element
        fruits.remove("Banana");

        // Iterate over set
        System.out.println("After removing Banana:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

	}

}
