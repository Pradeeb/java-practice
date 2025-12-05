package com.java.test;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,5,5,3,3,3,4};
		
	     int candidate = 0;
	        int count = 0;

	        for (int num : arr) {
	            if (count == 0) candidate = num;
	            count += (num == candidate) ? 1 : -1;
	        }
		
	 System.out.println(candidate);
	
	}

}
