package com.java.practice.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mechanism {
	
//	its have a two mechanism MAP and FILTER, package Java.utill.stream
	 
	public static void main(String[] args) {
    
		
		ArrayList<Integer> numbers =new ArrayList<Integer>();
		numbers.add(18);
		numbers.add(14);
		numbers.add(91);
		
		List<Integer> number=Arrays.asList(10,11,29,30);
		
		List<Integer> evenNumbers =new ArrayList<Integer>();

		evenNumbers=numbers.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
		
		numbers.stream().filter(x -> x%2 == 0).forEach(x -> System.out.println(x));
		
	}

}
