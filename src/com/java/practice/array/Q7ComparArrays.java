package com.java.practice.array;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Q7ComparArrays {
	
	public static void main(String []args) {
		
		int arr1[] = {1,2,4,4,0}, arr2[] = {2,4,5,0,1};
		
		System.out.println(compareArrays(arr1,arr2));
		
		// Stream method 1
		boolean ans=Arrays.equals(arr1, arr2);
		System.out.println(ans);
		
		// Stream method 2
		boolean same = Arrays.stream(arr1).sorted().toArray().length == 
	               Arrays.stream(arr2).sorted().toArray().length &&
	               Arrays.equals(
	                 Arrays.stream(arr1).sorted().toArray(),
	                 Arrays.stream(arr2).sorted().toArray()
	               );
		// Stream method 3
		boolean same1 = Arrays.equals(
		        Arrays.stream(arr1).sorted().toArray(),
		        Arrays.stream(arr2).sorted().toArray()
		);
		
		// Stream method 4
		Map<Integer, Long> freq1 = Arrays.stream(arr1)
		        .boxed()
		        .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

		Map<Integer, Long> freq2 = Arrays.stream(arr2)
		        .boxed()
		        .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

		boolean same2 = freq1.equals(freq2);


	}
	
	static boolean compareArrays(int[] arr1,int[] arr2) {
		
		if(arr1.length != arr2.length) {
			return false;
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i=0 ; i <= arr1.length-1 ; i++ ) {
			
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	
}
