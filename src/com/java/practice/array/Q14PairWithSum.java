package com.java.practice.array;

import java.util.Arrays;

/*
 Given an array arr[] and an integer target, determine if there exists a triplet in the array whose sum equals the given target.

Return true if such a triplet exists, otherwise, return false.

Examples

Input: arr[] = [1, 4, 45, 6, 10, 8], target = 13 
Output: true 
Explanation: The triplet {1, 4, 8} sums up to 13
 */

public class Q14PairWithSum {

	public static void main(String[] args) {
		int[] arr = {1, 4, 45, 6, 10, 8};
        int target = 13;
        
        System.out.println(findTriplet(arr, target)); // Output: true

	}
	
	 public static boolean findTriplet(int[] arr, int target) {
	    //    Arrays.sort(arr); // Step 1: Sort the array
	        
	        for (int i = 0; i < arr.length - 2; i++) { // Fix one element
	            int left = i + 1, right = arr.length - 1;
	            
	            while (left < right) { // Two-pointer search
	                int sum = arr[i] + arr[left] + arr[right];
	                
	                if (sum == target) {
	                    return true;
	                } else if (sum < target) {
	                    left++; // Move left pointer to increase sum
	                } else {
	                    right--; // Move right pointer to decrease sum
	                }
	            }
	        }
	        
	        return false; // No triplet found
	    }

}
