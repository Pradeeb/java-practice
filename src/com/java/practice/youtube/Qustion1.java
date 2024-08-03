package com.java.practice.youtube;

import java.util.Arrays;

// Count Words in a String Using Java 8 Stream API 
public class Qustion1 {
	public static void main(String[] args) {
		String str="You can take Loram 5 Tablet at any time of day, with or without food, but it is best to take it at the same time each day.";
		long count=Arrays.stream(str.split("\\s+")).count();
		System.out.println(count);
	}
}
