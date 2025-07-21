package com.java.learn.collection.queue;

import java.util.ArrayDeque;
import java.util.Queue;

/*
📦 What is ArrayDeque?

	    A resizable array-based implementation of Deque (double-ended queue).

	    Supports insertion/removal from both ends (front & rear).

	    Faster than Stack and LinkedList for stack/queue operations.

	    Not thread-safe.

	🚀 Key Features
	Feature	Detail
	Double-ended queue	✅ Add/remove from both head and tail
	Backed by array	✅ Resizes dynamically
	Nulls not allowed	❌ Throws NullPointerException
	Faster than Stack/LinkedList	✅ Yes (no synchronization, better cache locality)
	Thread safety	❌ No (use externally synchronized version if needed)
	
	
	🧠 Use Cases

    Stack (LIFO): use push(), pop()

    Queue (FIFO): use addLast(), removeFirst()

    Sliding window problems

    Undo/Redo features

    BFS (Graph Traversal)
	
	*/

/*
 🧰 Common Methods
Method	         Description
addFirst(E e)	Inserts at the front
addLast(E e)	Inserts at the rear
offerFirst(E e)	Offers at front, returns false if fails
offerLast(E e)	Offers at rear, returns false if fails
removeFirst()	Removes and returns front element
removeLast()	Removes and returns rear element
pollFirst()	    Removes front or returns null if empty
pollLast()	    Removes rear or returns null if empty
peekFirst()	    Retrieves front element
peekLast()	    Retrieves rear element
push(E e)	    Same as addFirst() — for stack use
pop()	        Same as removeFirst() — for stack use


Feature             	Description
Package	                  java.util
Implements                Deque<E>, Queue<E>, Collection<E>
Underlying structure	  Resizable array
Thread-safe	              ❌ No — use externally synchronized if needed
Null elements allowed	  ❌ No — inserting null throws NullPointerException
Faster than	              Stack (for LIFO), LinkedList (for Deque operations)
Allows duplicates	      ✅ Yes

 */
	

public class ArrayDeQueueLearn {

	public static void main(String[] args) {
		
		
		Queue<Integer> num=new ArrayDeque<>();
		
		num.add(2);
		num.add(5);
		num.add(3);
		num.add(4);
		num.add(1);
		
		System.out.println(num);
		
		 ArrayDeque<String> deque = new ArrayDeque<>();

	        deque.add("Java");
	        deque.addFirst("C++");
	        deque.addLast("Python");

	        System.out.println(deque); // [C++, Java, Python]

	        System.out.println(deque.removeFirst()); // C++
	        System.out.println(deque.removeLast());  // Python

	}

}
