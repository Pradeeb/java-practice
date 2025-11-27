package com.java.learn.streams.interview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

//Fine first non repeat element from given string
public class Q3 {

	public static void main(String[] args) {
		
		String text="Thejavatechie";

		// Wrong answer given 
		
		/*
		 * Collectors.groupingBy(Function.identity(), Collectors.counting() 
		 * It creates a HashMap, so access is effectively random — we cannot rely on the insertionorder.
		 */
		String ans1 = Arrays.stream(text.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(x-> x.getValue() == 1)
				.findFirst().get().getKey();
		
		System.out.println(ans1);
		
		// Right one we need add this LinkedHashMap::new
		String ans = Arrays.stream(text.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(x-> x.getValue() == 1) // you want get first duplicate element use > instead ==
				.findFirst().get().getKey();
		
		System.out.println(ans);

	}

}
