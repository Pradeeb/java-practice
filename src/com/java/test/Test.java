package com.java.test;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		
		sortArray(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void sortArray(int[] arr) {
		
	  		for(int i=0 ; i< arr.length ;i++) {
		  		for(int j=i+1 ; j< arr.length ;j++) {
		  			if(arr[i]<arr[j]) {
		  				int temp=arr[j];
		  				arr[j]=arr[i];
		  				arr[i]=temp;
		  			}
		  		}
	  		}
	}
}
