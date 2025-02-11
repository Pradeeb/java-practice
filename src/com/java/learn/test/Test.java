package com.java.learn.test;

public class Test {
	    public static void main(String[] args) {

			
			int[] arr= {1,2,3,4,5};// out put [5, 1, 2, 3, 4]
			clockwise(arr); 
		
	    }

		private static void clockwise(int[] arr) {
			
			int length=arr.length-1;
			int lastElement=arr[length];
            			
			for(int i=length; i>0 ;i--) {
				arr[i]=arr[i-1];
			}
			arr[0]=lastElement;
			for(int num:arr) {
				System.out.print(num+",");
			}
		}
}
