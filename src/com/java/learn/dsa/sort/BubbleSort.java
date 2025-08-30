package com.java.learn.dsa.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr []= {42, 7, 89, 13 ,65 ,22 ,99 ,5 ,31 ,76};
       
		for(int i=0; i < arr.length-i ; i++) {
			for(int j=0; j < arr.length-1-i ; j++) {
				  // Check if the current element is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                	int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
