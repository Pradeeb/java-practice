package com.java.learn.dsa.sort;

import java.util.Arrays;

/*https://www.interviewcake.com/sorting-algorithm-cheat-sheet*/ //this page have clear explain

public class Test {

	public static void main(String[] args) {
		
		int[] num= {1,5,2,3,4};
		
		quickSort(num,0,num.length-1);
		
		System.out.println(Arrays.toString(num));

	}

	private static void quickSort(int[] arr, int low, int high) {
		
		if(low >= high)	return;
		
		int start=low, end=high;
		
		int mid=(low+high)/2;
		int pivot = 0;

		while(start <= end) {
			

			while(arr[start]< pivot) {
				start++;
			}
			while(arr[start]> pivot) {
				end--;
			}
			
			if(start <= end) {
				
			}
			
		}
		
		
	}

}
