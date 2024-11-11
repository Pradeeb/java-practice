package com.java.practice.array;

import java.util.Arrays;

public class Q4FindingMissingElement {

	public static void main(String[] args) {
		
		int[] numbers= {1};
		
		System.out.println(missingNumber(numbers));
		
	}
	
	static int missingNumber(int arr[]) {
		
		Arrays.sort(arr);
		
		int start=1;
		for(int i = 0; i <= arr.length -1 ;i++) {
			
			if(start != arr[i]) {
				return start;
			}
			start++;
		}
		
		return start;
	}

}
