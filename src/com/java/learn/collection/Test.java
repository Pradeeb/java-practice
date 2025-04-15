package com.java.learn.collection;
import java.util.List;
import java.util.ArrayList;

public class Test {
	
	public static void main(String [] args) {
		
		List<Integer> num=new ArrayList<Integer>();
		
		num.add(1);
		num.add(2);
		num.add(2);
		num.add(4);
		
		System.out.println(num.add(5));
		
		
		num.add(2,3);
		num.set(3,4);
		System.out.println(num);

		num.remove(4);
		System.out.println(num.get(0));
		
		num.clear();
		System.out.println("Clear all number"+num);


	}

}
