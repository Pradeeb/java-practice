package com.java.practice.array;

import java.util.Arrays;

public class Q1FindMaxMin {

	public static void main(String []arg) {
		
		int[] numbers = {1,2,3,4,5,6,7};
		
		findMaxMin(numbers);
		
	}
	
	static void findMaxMin(int[] numbers) {
		
		int min=0;
		int max=0;
		
		Arrays.sort(numbers);
		
		min=numbers[0];
		max=numbers[numbers.length-1];
		
		System.out.print(min+"  "+max);
		
//		for(int i=0; i <= numbers.length-1 ;i++) {
//			System.out.println(numbers[i]+" "+"index =>"+i);
//		}
		
	}
}
