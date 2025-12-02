package com.java.learn.collection.list;

import java.util.Stack;

/*

LIFO behavior

Allows null elements

Thread-safe (since it's based on Vector), but not very fast

Better Alternative Use ArrayDeque for faster performance (not thread-safe):

*/

/*
Method	      Description
push(E e)	    Adds an item to the top of the stack
pop()	        Removes and returns the top item
peek()	        Returns the top item without removing it
search(Object o)	Returns position (1-based) from top


Behavior:

1.All ArrayList method using
2.LIFO
3.Thread-Safe(all methods are synchronized)
4.Dynamic size
5.duplicate allow
6.null can accept

*/
public class StockListLearn {

	public static void main(String[] args) {
		// Example 1
		Stack<String> stack = new Stack<>();

		// Push elements onto the stack (last in)
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Cherry");
		stack.add("Lemon");
		System.out.println("Stack: " + stack); // [Apple, Banana, Cherry, Lemon]

		// Pop elements from the stack (first out: Cherry)
		System.out.println("Popped: " + stack.pop()); // Cherry
		System.out.println("Popped: " + stack.pop()); // Banana
		System.out.println("Popped: " + stack.pop()); // Apple

		System.out.println("Is stack empty? " + stack.isEmpty()); // true

		// Example 2
		Stack<Integer> num = new Stack<>();

		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);

		for (int i = 0; i < num.size(); i++) {
			System.out.println(num.peek());
		}

//	   System.out.println(num.pop()+" "+num.peek()+" "+num.search(3));

	}

}
