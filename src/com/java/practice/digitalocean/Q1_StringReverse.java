package com.java.practice.digitalocean;

public class Q1_StringReverse {

	public static void main(String[] args) {
		
		String str="valan";
		
		System.out.println(reverse(str));
	}
	
	public static String reverse(String str) {
		
		if(str == null || str.isEmpty()) {
			throw new NullPointerException("provide the  null or empty value");
		}
		
		StringBuilder sb=new StringBuilder();
		
		char[] chr=str.toCharArray();
		
		for(int i=chr.length-1 ; i>=0 ; i--) {
			sb.append(chr[i]);
		}
       
		return sb.toString();
	}
}
