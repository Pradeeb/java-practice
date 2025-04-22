package com.java.learn.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
Feature               | Description
Key-value storage     | Stores entries in the form of key -> value.
No duplicate keys     | Keys must be unique; values can be duplicated.
Allows one null key   | You can have one null key and multiple null values.
Unordered             | Does not guarantee insertion order or sorted order.
Fast performance      | Average time complexity for get/put/remove is O(1).
Not synchronized      | Not thread-safe. Use Collections.synchronizedMap() or ConcurrentHashMap if needed in multi-threading.
Backed by Hash Table  | Internally uses a hash table + linked list / tree for collision handling.
*/

public class LearnHashMap {

	public static void main(String[] args) {
		 
		Map<Integer, String> map = new HashMap<>();

        // Adding key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");
        map.put(2, "Orange"); // Overwrites value at key 2

        // Printing entire map
        System.out.println("HashMap: " + map);

        // Accessing values
        System.out.println("Value for key 3: " + map.get(3));

        // Removing key-value pair
        map.remove(1);

        // Iterating over entries
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        
        
		/*
		 * Feature                                                         | Description 
		 * Maintains order                                                 | Maintains insertion order (by
		 * default) or access order (if enabled). Allows one null key      | Like HashMap, it
		 * allows one null key and multiple null values. No duplicate keys | Duplicate
		 * keys overwrite existing values. Faster iteration                | Because of maintained
		 * order, iteration is predictable and slightly faster than HashMap in some
		 * cases. Not synchronized                                         | Must be externally synchronized in multi-threaded
		 * use. Access Order mode                                          | Can be set to true to reorder entries when accessed
		 * (get() or put()).
		 */
        
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();

        map1.put(3, "Mango");
        map1.put(1, "Apple");
        map1.put(2, "Banana");

        System.out.println("Insertion order maintained:");
        for (Integer key : map1.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map1.get(key));
        }

	}

}
