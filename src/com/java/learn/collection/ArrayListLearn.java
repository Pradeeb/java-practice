package com.java.learn.collection;

import java.util.List;
import java.util.ArrayList;


//add
//add use index
//get
//replace
//remove use index and element
//clear


public class ArrayListLearn {
	
	public static void main(String arg[]) {
		
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
		System.out.println("get  retrun Element"+num);
		System.out.println("");
		
		//set return old element
		int old=num.set(1, 2);
		System.out.println("set return old element"+num);
		System.out.println("");
		
		//remove use index
		int removedElement=num.remove(0);
		System.out.println("remove use index"+num);
		System.out.println("");
		
		//remove use Element
		boolean ifRemove=num.remove((Integer) 4);
		System.out.println("remove use Element"+num);
		System.out.println("");
		
		//clear() remove all element
		num.clear();
		System.out.println("clear() remove all element"+num);
 		
		
	}
}
