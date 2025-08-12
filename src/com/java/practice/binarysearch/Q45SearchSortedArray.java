package com.java.practice.binarysearch;

/*
 
 Given an array, arr[] sorted in ascending order and an integer k. Return true if k is present in the array, otherwise, false.

Examples:

Input: arr[] = [1, 2, 3, 4, 6], k = 6
Output: true
Exlpanation: Since, 6 is present in the array at index 4 (0-based indexing), output is true.

Input: arr[] = [1, 2, 4, 5, 6], k = 3
Output: false
Exlpanation: Since, 3 is not present in the array, output is false.

Input: arr[] = [2, 3, 5, 6], k = 1
Output: false
 
 */

public class Q45SearchSortedArray {
	
	public static void main(String [] args) {
		
		int a []= {1, 2, 3, 4, 6};
		int find=6;
		
		boolean ans=findIndex(a,find,0,a.length-1);
		System.out.println(ans);
	}

	 private static boolean findIndex(int[] a, int find, int start, int end) {
	        while (start <= end) {
	            int mid = (start + end) / 2;

	            if (a[mid] == find) {
	                return true; // found
	            } else if (a[mid] > find) {
	                end = mid - 1; // search left half
	            } else {
	                start = mid + 1; // search right half
	            }
	        }
	        return false; // not found
	    }


}
