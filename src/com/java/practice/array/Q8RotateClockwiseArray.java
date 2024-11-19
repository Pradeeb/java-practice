package com.java.practice.array;

import java.util.Arrays;

public class Q8RotateClockwiseArray {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};// out put [5, 1, 2, 3, 4]
		clockwise(arr); 
	}
	
	static void clockwise(int[] arr) {
		
		int n=arr.length-1;
		int lastElement = arr[n];
		for(int i=n; i > 0 ; i--) {
			  arr[i] = arr[i - 1];
		}
		arr[0] = lastElement;
		
		System.out.println(Arrays.toString(arr));
	}
}
