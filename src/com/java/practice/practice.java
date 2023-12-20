package com.java.practice;

import java.util.Arrays;


public class practice {
	

	// Driver program to run the case
	public static void main(String args[])
	{
	    long N = 11110;
	    System.out.println(evenlyDivides(N));
	}
	
	protected static long evenlyDivides(long N) {
		
		if(N==0) return 0;
		
		String numToString=String.valueOf(N);
		
		StringBuilder sb=new StringBuilder(numToString);
		sb.reverse();
		
		long ans=Long.valueOf(sb.toString());
		
		
	    
		return ans;
	}
		
}
