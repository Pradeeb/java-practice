package com.java.learn.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test{
	public static void main(String [] args) {
		
		int[] arr= {,};
		
		List<Integer> num=new ArrayList<Integer>();
		
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		
		ListIterator<Integer> it=num.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}
}