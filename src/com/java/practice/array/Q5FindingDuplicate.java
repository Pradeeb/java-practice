package com.java.practice.array;

import java.util.HashSet;
import java.util.Set;

public class Q5FindingDuplicate {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,5,6,7,8,9};
		findDuplicate(arr);
	}
	
	public static void findDuplicate(int[] arr) {
		
		Set<Integer> seen =new HashSet<Integer>();	
		
		for(int num:arr) {
		
		if(!seen.add(num)) {
			System.out.print(num+" ");
		}
		
		}
    
	}
}
