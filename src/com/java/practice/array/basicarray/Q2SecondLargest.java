package com.java.practice.array.basicarray;

import java.util.Arrays;

public class Q2SecondLargest {

	public static void main(String[] args) {
		
		//method 1
		int res = findSecondLargest(new int[]{7,1,9,2,0}); // -5, -2, -9
		System.out.println(res);
		
		//method 2
		int[] arr=new int[]{7,1,9,2,0};
		int ans=Arrays.stream(arr).sorted().limit(arr.length).max().getAsInt();
		
		System.out.println(ans);
		
	}

	private static int findSecondLargest(int[] arr) {
	    int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
	    for (int num : arr) {
	        if (num > max) {
	            secondMax = max;
	            max = num;
	        } else if (num > secondMax && num < max) {
	            secondMax = num;
	        }
	    }
	    return secondMax;
	}

}

/*
 * 
 Method 1 => Manual Iteration (fixed) → O(n), most efficient.

 Method 2 => Streams (skip approach) → O(n log n), concise and modern.
             Sorting with Arrays.sort → O(n log n), simple but less efficient if you only need second largest.


 * 
 * */
