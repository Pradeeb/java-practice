package com.java.practice.array;

import java.util.Arrays;

public class Q7ComparArrays {
	
	public static void main(String []args) {
		
		int arr1[] = {1,2,4,4,0}, arr2[] = {2,4,5,0,1};
		
		System.out.println(compareArrays(arr1,arr2));
		
	}
	
	static boolean compareArrays(int[] arr1,int[] arr2) {
		
		if(arr1.length != arr2.length) {
			return false;
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i=0 ; i <= arr1.length-1 ; i++ ) {
			
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		
		return true;
	}
}
