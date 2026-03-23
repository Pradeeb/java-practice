package com.java.practice.campuslogic;

import java.util.Arrays;

public class Q5_MoveZeroes {

	public static void main(String[] args) {

		int[] nums = { 0, 1, 0, 3, 12 };
		
		int z=0;

		for (int i = 0; i < nums.length; i++) {
			
			if(nums[i] != 0) {
				nums[z]=nums[i];
				z++;
			}
		}
		
		for(int i=z ; i<nums.length ;i++) nums[i]=0;
		
		System.out.println(Arrays.toString(nums));

	}

}
