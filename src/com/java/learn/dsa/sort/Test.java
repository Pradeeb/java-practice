package com.java.learn.dsa.sort;

import java.util.Arrays;

/*https://www.interviewcake.com/sorting-algorithm-cheat-sheet*/ //this page have clear explain

public class Test {

	public static void main(String[] args) {
		int arr []= {42, 7, 89, 13 ,65 ,22 ,99 ,5 ,31 ,76};
		
	   for( int i=1; i<arr.length ; i++) {
		   for( int j=i; j>0 ; j--) {
			   
			   if(arr[j] < arr[j+1]) {
				   int temp=arr[j];
				   arr[j]=arr[j+1];
				   arr[j+1]=temp;
			   }else {
				   break;
			   }
		   }
	   }
		
		System.out.println(Arrays.toString(arr));

	}
}
