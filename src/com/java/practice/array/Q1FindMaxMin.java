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
		
		//find maximum number method 1
		int big=0;
		for(int i=0; i < numbers.length ;i++) {
			if(big<numbers[i]) {  //change less then and grater then get min max value.
				big=numbers[i];
			}
		}
		System.out.println(big);
		
		//find maximum,minimum number method 1
		Arrays.sort(numbers);
		min=numbers[0];
		max=numbers[numbers.length-1];
		System.out.println(min+"  "+max);

		//find max value use stream
		System.out.println("find max value use stream => "+ Arrays.stream(numbers).max().getAsInt());
		
		//find min value use stream
		System.out.println("find min value use stream => "+Arrays.stream(numbers).min().getAsInt());
		
		//find second minimum value use stream
		System.out.println("find second minimum value use stream => "+Arrays.stream(numbers).sorted().skip(1).min().getAsInt());
		
		//find second max value use stream
		System.out.println("find second max value use stream => "+Arrays.stream(numbers).sorted().skip(1).max().getAsInt());
		

		
	}
}
