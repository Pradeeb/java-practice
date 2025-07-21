package com.java.learn.collection.list;

import java.util.List;
import java.util.Vector;


//add
//add use index
//get
//replace
//remove use index and element
//clear


/*
Thread-Safe	(all methods are synchronized)
Maintains insertion order	
Allows duplicates	
Allows null values	
Random access by index	


Method	        Description

push(E e)	    Add item to top of stack
pop()	        Remove and return top item
peek()      	Just return top item without removing
isEmpty()	     Check if stack is empty

*/
public class VectroLearn {

	public static void main(String[] args) {
	
		List<Integer> num=new Vector<>();
		
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
				System.out.println("set replace & return old element"+old);
				System.out.println("");
				
				//remove use index
				int removedElement=num.remove(0);
				System.out.println("remove use index"+removedElement);
				System.out.println("");
				
				//remove use Element
				boolean ifRemove=num.remove((Integer) 4);
				System.out.println("remove use Element"+ifRemove);
				System.out.println("");
				
				//clear() remove all element
				num.clear();
				System.out.println("clear() remove all element"+num);

	}

}
