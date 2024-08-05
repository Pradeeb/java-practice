package com.java.practice;

public class Test {

	public static void main(String[] args) {
		String str = "123";

		System.out.println(reverse(str));
		
	}
	
	public static String reverse(String in) {
		
		if (in == null ) throw new NullPointerException("Null is not valid input");
		
		char[] ch=in.toCharArray(); 
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=ch.length-1; i>=0 ;i--) {
			sb.append(ch[i]);
		}
		   	String out=sb.toString();
        
		return out;
	}
}


