package com.java.practice.array;

public class Q3FindIndex {

	public static void main(String[] args) {
		int[] arr= {10, 8, 30, 4, 5};
		int x=5;
		System.out.println(search(arr,x));
	}
	
	static int search(int arr[],int x) {
		
		for(int i=0; i<=arr.length-1 ;i++) {
			if(x == arr[i]) {
				return i;
			}
		}
		
		return -1;
	}

}
