package com.java.practice.campuslogic;

/*
 
Given an integer array nums, find the subarray with the largest sum, and return its sum.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 
 */
public class Q4_MaximumSubarray {

	public static void main(String[] args) {

		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		System.out.println(ans(nums));

	}

	static int ans(int[] nums) {

		int current = 0, max = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {

			int temp = current + nums[i];
			if (temp < nums[i]) {
				current = nums[i];
			} else {
				current = temp;
			}
			if (current > max)
				max = current;

		}

		return max;
	}

}
