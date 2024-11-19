package com.java.practice.array;

import java.util.Arrays;

/*Problem statement

Given an array 'arr' with 'n' elements, the task is to rotate the array to the left by 'k' steps, where 'k' is non-negative.


Example:

'arr '= [1,2,3,4,5]
'k' = 1  rotated array = [2,3,4,5,1]
'k' = 2  rotated array = [3,4,5,1,2]
'k' = 3  rotated array = [4,5,1,2,3] and so on.

*/



public class Q9RotateArray {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		int k=3;
		
		rotate(arr,k);

	}
	
	static void rotate(int[] arr,int k) {
		
		int n=arr.length-1;
		int round=0;
		while(k!=round) {
		
		int first=arr[0];
		for(int i=0 ; i < n ; i++) {
			arr[i]=arr[i+1];
		}
		arr[n]=	first;	
		round++;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
