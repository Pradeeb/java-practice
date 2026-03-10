package com.java.practice.campuslogic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 
 Given an array of integers nums and an integer target,
 return the indices of the two numbers such that they add up to target.
 
 nums = [2,7,11,15,4,5]
 target = 9
 
 * */

public class Q1_TwoSum {

	public static void main(String[] args) {
		 int [] nums = {2,7,11,15,4,5,5};
		 int target = 10; //9
		
		 System.out.println( Arrays.toString(twosum(nums,target)));
		 
		 //map using approach
		 System.out.println( Arrays.toString(twosum(nums,target)));

	}
	

	public static int[]  twosum(int[] arr,int target) {
		
		for(int i=0;i<arr.length ;i++) {
			for(int j=i+1;j<arr.length ;j++) {
				if(arr[i]+arr[j] == target) {
					 return new int[]{i, j};
				}
			}
		}
		return new int[]{};
	}

	public static int[] TwoSumUsingMap(int[] arr,int target) {
		
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=0 ; i < arr.length ;i++ ) {
			int complemet=target-arr[i];
			
			if(map.containsKey(complemet)) {
				return new int[] {map.get(map),i};
			}else {
				map.put(arr[i], i);
			}
		}
		
		throw new IllegalArgumentException();
	}
	
}
