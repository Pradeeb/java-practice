package com.java.practice.array.twopointer;

import java.util.HashSet;
import java.util.Set;

// it is working only sorted arrays 
public class TwoPointer {

	public static void main(String[] args) {
		int[] num = {4, 1, 7, 3 };

		int target = 10;

		findSum(num, target);
		
		findSum1(num, target);

	}
	
	static void findSum(int[] arr, int t) {

        int left = 0, right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == t) {
                System.out.println(arr[left]  + " " + arr[right] );
                return; // better than break
            } else if (sum > t) {
                right--;   // decrease sum
            } else {
                left++;    // increase sum
            }
        }

        System.out.println("No pair found");
	}
	
	private static void findSum1(int[] num, int target) {
		Set<Integer> set=new HashSet<>();
		
		for(int n:num) {
			int complement=target-n;
			
			if(set.contains(complement)) {
				System.out.println(complement+" , "+n);
				return;
			}
			set.add(n);
			
		}
		System.out.println("No pair found");
		
	}


}
