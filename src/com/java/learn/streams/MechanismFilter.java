package com.java.learn.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MechanismFilter {
	
   //	its have a two mechanism MAP and FILTER, package Java.utill.stream
	 
	public static void main(String[] args) {
    	
		//***********************  filter demo *********************************
		ArrayList<Integer> numbers =new ArrayList<Integer>();
		numbers.add(18);
		numbers.add(14);
		numbers.add(91);
		
		List<Integer> number=Arrays.asList(10,11,29,30);
		
		List<Integer> evenNumbers =new ArrayList<Integer>();

		evenNumbers=numbers.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
		
		numbers.stream().filter(x -> x%2 == 0).forEach(x -> System.out.println(x));
		
		
		System.out.println(numbers.stream().count());
		
		
		//***********************  filter demo 2 multiple filter  ***************************
		
		List<String> names=Arrays.asList("valan","pradeeb","nazeem","arul","selva");
		
		//Multiple conditions add
		List<String>findName=names.stream().filter(x -> x.length() > 6 && x.length() < 8).collect(Collectors.toList());
		System.out.println(findName);
		
		//Multiple conditions add and print single line.
		names.stream().filter(x -> x.length() > 6 && x.length() < 8).forEach(System.out::println);
	}

}
