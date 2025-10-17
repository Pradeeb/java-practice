package com.java.practice.dsa.binarysearch;
/*
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

 

Example 1:

Input: nums = [3,0,1]

Output: 2

Explanation:

n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:

Input: nums = [0,1]

Output: 2

Explanation:

n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]

Output: 8

Explanation:


Correct Approach:

    The sum of numbers from 0 to n is n*(n+1)/2.
    Subtract the sum of the array from this value to find the missing number.

 */

public class Q48FindmissingnumFrom1toN {
	
	public static void main(String[] args) {
		
		int[] num= {0,1,3};
		
		System.out.println(missingNumber(num));
	}
	
	public static int missingNumber(int[] nums) {
		int n = nums.length;
		int expectedSum = n * (n + 1) / 2;
		int actualSum = 0;
		for (int num : nums) {
			actualSum += num;
		}
		return expectedSum - actualSum;
	}

}
