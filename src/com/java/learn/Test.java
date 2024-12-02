package com.java.learn;

import java.util.ArrayList;

//add
//replace
//get 
//get all
//remove particular element

public class Test {
	public static void main(String[] args) {
		
		ArrayList<Integer> num=new ArrayList<Integer>();
		
		num.add(1);
		num.add(2);
		num.add(2,3);
		
		num.stream().forEach(System.out::print);
		
		System.out.println(num.get(2));
		System.out.println(num);
		
		System.out.println(num.remove(1));
		System.out.println(num.remove((Integer)3));

		
		num.stream().forEach(System.out::print);
		
		
	}
}


