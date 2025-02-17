package com.java.practice.array;

public class Q13PairWithSum {

	public static void main(String[] args) {
		
		int arr[] = {1, 4, 45, 6, 10, 8};
		int target = 16;
 
		boolean value=findPairWithsum(arr,target);
		
		System.out.println(value);
	}
	
	private static boolean findPairWithsum(int arr[],int num) {
		
		for(int i=0 ; i<arr.length ;i++) {
			for(int j=i+1 ; j<arr.length ;j++) {
				if(arr[i]+arr[j] == num) {
					System.out.println(arr[i]+"+"+arr[j]+"="+num);
					return true;
				}
			}
		}
		return false;
	}

}
