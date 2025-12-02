package com.java.practice.array;

import java.util.Arrays;

public class Q2FindThirstLargeElement {

	public static void main(String[] args) {
		
		//Arrays use 
		int[] number= {2, 4, 1, 3, 5};
		
		findThirdLargeNumber(number);
	}
	
	public static void findThirdLargeNumber(int[] arr) {
		
	 if(arr.length<3 || arr==null) {
		 System.out.println("Array must have 3 more element");
		 return;
	 }
		int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE,third=Integer.MIN_VALUE;
		
		for(int num:arr) {
			
			if(num>first) {
				third=second;
				second=first;
				first=num;
			}else if(num>second && num<first) {
				third=second;
				second=num;
			}
			else if(num>third && num<second) {
				third=num;
			}
			
		}
		
		  System.out.println("Third Largest Element: " + third);
		  //stream use
		  System.out.println("Third Largest Element: " + Arrays.stream(arr).sorted().limit(arr.length -2).max().getAsInt());
		  
	}

}
