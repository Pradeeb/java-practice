package com.java.learn.collection;

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

*/
public class StockListLearn {

	public static void main(String[] args) {
		
		Stack<Integer> num=new Stack<>();
		
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		
		System.out.println(num.pop()+" "+num.peek()+" "+num.search(3));
	}

}
