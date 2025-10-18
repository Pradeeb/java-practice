package com.java.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 0, 2);
		numbers.stream()
		       .map(x -> 10 / x)
		       .forEach(System.out::println);
	}

}
