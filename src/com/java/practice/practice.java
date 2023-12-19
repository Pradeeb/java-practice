package com.java.practice;

import java.util.Arrays;


public class practice {
	

	// Driver program to run the case
	public static void main(String args[])
	{
	    int N = 22074568;
	    System.out.println(evenlyDivides(N));
	}
	
	protected static int evenlyDivides(int N) {
		
		int tem=N,ans=0;
		
		while(tem !=0) {
			
			//get the last digit
			int d=tem%10;
			
			//remove last digit in tem
			tem /=10;
			
			if(d >0 && (N%d ==0)) {
				ans++;
			}
			
		}
		
		return ans;
	} 
		
}
