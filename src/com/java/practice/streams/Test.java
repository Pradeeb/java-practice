package com.java.practice.streams;

import java.util.Arrays;
import java.util.List;


public class Test {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 0, 2);
		numbers.stream()
		       .map(x -> 10 / x)
		       .forEach(System.out::println);
	}

}
