package com.java.learn.test;

public class Test {
	
	public static void main(String[] args) {
		int n=5;
		
		for(int i=1 ; i<=n ;i++)  {
			for(int j=i; j<n ;j++ ) {
				System.out.print(" ");
			}
			
			for(int j=1; j<= (3 * i -1) ;j++ ) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}