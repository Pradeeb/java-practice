package com.java.practice.dsa.binarysearch;

import java.util.ArrayList;
/*

Given a sorted array arr with possibly some duplicates, the task is to find the first and last occurrences of an element x in the given array.
Note: If the number x is not found in the array then return both the indices as -1.

Examples:

Input: arr[] = [1, 3, 5, 5, 5, 5, 67, 123, 125], x = 5
Output: [2, 5]
Explanation: First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5

Input: arr[] = [1, 3, 5, 5, 5, 5, 7, 123, 125], x = 7
Output: [6, 6]
Explanation: First and last occurrence of 7 is at index 6

Input: arr[] = [1, 2, 3], x = 4
Output: [-1, -1]
Explanation: No occurrence of 4 in the array, so, output is [-1, -1]


 */
public class Q47FindFirstAndLast {
	 public static void main(String[] args) {

	        int arr1[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
	        System.out.println(find(arr1, 5)); // [2, 5]

	        int arr2[] = {1, 3, 5, 5, 5, 5, 7, 123, 125};
	        System.out.println(find(arr2, 7)); // [6, 6]

	        int arr3[] = {1, 2, 3};
	        System.out.println(find(arr3, 4)); // [-1, -1]
	    }
	 


		public static ArrayList<Integer> find(int[] arr, int x) {
			
			ArrayList<Integer> ans =new ArrayList<>();
			int first=-1,second=-1;
			
			for(int i=0; i< arr.length ; i++) {
				if(x == arr[i]) {
					if(first == -1) {
						first=i;
					}
					second=i;
				}
			}
			ans.add(first);
			ans.add(second);

			return ans;
		 
	 }
}
