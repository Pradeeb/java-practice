package com.java.learn.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

/*
A PriorityQueue is a special queue where elements are ordered by priority rather than insertion order.

Default: natural ordering (e.g., numbers in ascending order).

Not thread-safe (use external synchronization if needed).

Uses a min-heap by default.

The smallest element is given the highest priority.


🧠 Use Cases

    Task scheduling (e.g., OS job queue)

    Dijkstra’s algorithm (shortest path)

    Huffman encoding

    Event-driven simulators

    Merge k sorted lists

*/
/*
Important Methods
Method	                 Description
add(E e) / offer(E e)	  Add element with priority
poll()	                  Retrieves and removes the head (min by default)
peek()	                  Retrieves but does not remove the head
remove(Object o)	      Removes specific element

*/
public class PriorityQueueLearn {

	public static void main(String[] args) {
		
		Queue<Integer> num=new PriorityQueue<>();

		num.add(2);
		num.add(5);
		num.add(3);
		num.add(4);
		num.add(1);
		
		System.out.println(num);
		
		Queue<String> name=new PriorityQueue<>();
		
		name.add("pradeeb valan");
		name.add("pradeeb");
		
		
		System.out.println(name);
	}

}
