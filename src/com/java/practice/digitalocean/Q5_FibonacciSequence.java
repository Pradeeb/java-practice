package com.java.practice.digitalocean;

public class Q5_FibonacciSequence {

	public static void main(String[] args) {
		//direct
		   fibonicciSequence(10);
		
	}
	
	private static void fibonicciSequence(int count) {
		int a=0;
		int b=1;
		int c=1;
		
		for(int i=0 ; count >= i ; i++) {
			 
			System.out.print(a+",");
			
			a=b;
			b=c;
			c=a+b;
			
		}
		
	}
}
