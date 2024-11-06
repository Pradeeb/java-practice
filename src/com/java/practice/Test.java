package com.java.practice;

public class Test {
	public static void main(String[] args) {
		System.out.println(findAmstrongNumber(5557));
	}
	
	static String findAmstrongNumber(int a) {
		
		int og=a;
		int ans=0;
		
		while(a>0) {
			int last=a % 10;
			
			ans=ans*10+last;
			a /= 10;
		}
		
		if(ans == og) {
			return "true";
		}
		else {
			return "false";
		}
		
		
		
	}
}


