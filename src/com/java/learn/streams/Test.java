package com.java.learn.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class Test {

	public static void main(String[] args) {
		
		List<String> numbers = Arrays.asList("10","21","a","20");
		
		numbers.stream()
	    .map(s -> {
	        try {
	            return Integer.parseInt(s);
	        } catch (Exception e) {
	            return null;   // or any fallback value
	        }
	    })
	    .filter(Objects::nonNull)
	    .filter(x-> x >=20)
	    .forEach(System.out::println);
		System.out.println("completed");
	}

}
