package com.java.learn.collection.list;

import java.util.List;
import java.util.ArrayList;


//add
//add use index
//get
//replace
//remove use index and element
//clear

/*
 

Allows duplicates

Maintains insertion order 

Not synchronized ❌ (Use Collections.synchronizedList() for thread safety)

Supports null elements 

*/


/* below is common for all implemented class

Method                                | Description

add(E e)                              | Add element to the end
add(int index, E element)             | Add at specific index
get(int index)                        | Get element at index
set(int index, E element)             | Replace element at index
remove(int index)                     | Remove element by index
remove(Object o)                      | Remove first occurrence of object
size()                                | Number of elements
isEmpty()                             | Check if list is empty
clear()                               | Remove all elements
contains(Object o)                    | Check if element exists
indexOf(Object o)                     | Get index of first occurrence
lastIndexOf(Object o)                 | Get index of last occurrence
subList(int from, int to)             | Returns a view from from (inclusive) to to (exclusive)
toArray()                             | Convert to array
iterator()                            | Get iterator to loop

*/
public class ArrayListLearn {
	
	public static void main(String arg[]) {
		/*	
		List<Integer> num=new ArrayList<>();
		
		//add  return boolean
		num.add(1);  
		num.add(2);  
		num.add(3);  
		num.add(4);  
		num.add(5);  
		
		//add use index Retrun void
		num.add(1,3);
		System.out.println("add use index Retrun void"+num);
		System.out.println("");
		
		//get  retrun Element
		int numbet=num.get(0);
		System.out.println("get  retrun Element"+numbet);
		System.out.println("");
		
		//set replace old element
		int old=num.set(1, 2);
		System.out.println(old+" set replace & return old element "+num);
		System.out.println("");
		
		//remove use index
		int removedElement=num.remove(0);
		System.out.println(removedElement+ "remove use index"+num);
		System.out.println("");
		
		//remove use Element
		boolean ifRemove=num.remove((Integer) 4);
		System.out.println(ifRemove+ " remove use Element"+num);
		System.out.println("");
		
		//clear() remove all element
		num.clear();
		System.out.println("clear() remove all element"+num);
		
		
		*/
		
		// CRUD operation 
		List<String> student=new ArrayList<String>();
		
		//Create
		student.add("valan");
		System.out.println(student.add("pradeeb"));//true
		student.add(0,"Nazeem");
		System.out.println(student);
		
		//Read
		System.out.println(student.get(0));
		
		//Update
		student.set(1, "arul");
		System.out.println(student);
		
		//Delete
		student.remove("pradeeb");
		System.out.println(student);
		
	}
}
