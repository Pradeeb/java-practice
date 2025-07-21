package com.java.learn.collection.map;

import java.util.TreeMap;

/*
Feature                  | Description
Sorted map               | Maintains keys in natural ascending order, or a custom order using a comparator.
No null keys             | Does not allow null keys, but allows multiple null values.
Not thread-safe          | Needs synchronization for multi-threaded access.
Backed by Red-Black Tree | Operations take O(log n) time.
NavigableMap             | Provides methods like higherKey(), lowerKey(), subMap() etc.

*/
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(3, "Three");
        map.put(2, "One");
        map.put(1, "Two");

        System.out.println("TreeMap (sorted):");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
