package com.java.test;

import java.util.Arrays;
import java.util.List;

// binary search 

public class Test{
	

	
	 public static void main(String[] args) {
		 
		 List<Integer> list = Arrays.asList(10, 20, 0, 30);

		 list.stream()
		     .map(n -> 100 / n)   // ❌ Exception when n = 0
		     .forEach(System.out::println);

	 }
	 
	 
	 
}
