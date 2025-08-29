package com.java.learn.dsa.sort;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String [] args) {
		
		int arr []= {42, 7, 89, 13 ,65 ,22 ,99 ,5 ,31 ,76};
		
		for(int i=0 ; i < arr.length ;i++) {
			for(int j=i+1; j < arr.length ;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
