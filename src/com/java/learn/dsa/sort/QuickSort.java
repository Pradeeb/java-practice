package com.java.learn.dsa.sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] arr= {1,5,7,6,2};
		quickSort(arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(arr));
	
	}
	
	public static void quickSort(int[] arr, int low, int heig) {
		
		if(low >= heig) {
			return;
		}
		int start=low,end=heig;
		
		int mid=(low+heig)/2;
		int pivot=arr[mid];
		
		while(start<=end) {
			while(arr[start]<pivot) {
				start++;
			}
			while(arr[end]>pivot) {
				end--;
			}
			if(start<=end) {
				int temp =arr[start];
				arr[start]=arr[end];
				arr[end] =temp;
				start++;
				end--;
			}
		}
		
		quickSort(arr,low,end);
		quickSort(arr,start,heig);
	}

}
