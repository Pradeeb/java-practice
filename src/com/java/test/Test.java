package com.java.test;

import java.util.ArrayList;
import java.util.List;

public class Test{
	public static void main(String[] args) {
		
		List<Integer> nums=new ArrayList<>();

		//create
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		
		//insert
		nums.add(4, 10);;
		System.out.println(nums);
		
		//update
		nums.set(4, 11);;
		System.out.println(nums);
		
		nums.remove(11);
		System.out.println(nums);

		
		
	}
}
