package com.java.learn.dsa.sort;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String [] args) {
		
		int arr []= {42, 7, 89, 13 ,65 ,22 ,99 ,5 ,31 ,76};
		
		 for (int i = 0; i < arr.length - 1; i++) {
	            int minIndex = i;  // assume current index has the smallest element

	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;  // found a smaller element
	                }
	            }

	            // Swap the found minimum element with the first element
	            int temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;
	        }
		 System.out.println(Arrays.toString(arr));
		 
		
	}

}
