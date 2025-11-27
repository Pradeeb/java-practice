package com.java.learn.streams.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

// java program to count the occurrence of the each character in a string
public class Q1 {
	
	public static void main(String[] args) {
		System.out.println("Enter the word :");
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		
		Map<String, List<String>> map = Arrays.stream(text.split("")).collect(Collectors.groupingBy(s->s));
		System.out.println(map);
		
		 Map<String, Long> ans = Arrays.stream(text.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(ans);
	}

}
