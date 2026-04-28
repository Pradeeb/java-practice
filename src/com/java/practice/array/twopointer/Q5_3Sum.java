package com.java.practice.array.twopointer;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Q5_3Sum {

	public static void main(String[] args) {
		int[] arr= {-1,0,1,2,-1,-4};
		
		System.out.println(threeSum(arr));
	}
	
	public static List<List<Integer>> threeSum(int[] nums){
		
		// for return type
		List<List<Integer>> ans=new ArrayList<>();
		
		//sort the Arrays
		Arrays.sort(nums);
		
		//Loop
		for(int i=0; i<nums.length-2 ;i++) {
			
		}
		
		return null;
	}

}
