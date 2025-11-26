package com.java.practice.youtube;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//java use find all duplicate elements in given string
public class Q2 {

	public static void main(String[] args) {

		String text="Thejavatechie";
		
		 List<String> ans = Arrays.stream(text.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				     .entrySet().stream()
				     .filter(x -> x.getValue() == 1) // you want duplicate count use > instead ==
				     .map(Map.Entry::getKey)
				     .collect(Collectors.toList());

		 System.out.println(ans);
	}

}
