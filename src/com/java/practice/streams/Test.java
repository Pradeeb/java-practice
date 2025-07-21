package com.java.practice.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,9,99,99);
		
		List<Integer> ans=numbers.stream().limit(6).distinct().collect(Collectors.toList());
   	   
		ans.stream().forEach(System.out::println);;
	}

}
