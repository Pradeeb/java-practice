package com.java.practice.string;

public class StringMethods {

	public static void main(String[] args) {

	// Java String charAt()
		String name = "javatpoint";
		char ch = name.charAt(4);// returns the char value at the 4th index
		System.out.println(ch);
		
		
	//Java String concat ()
		System.out.println("Java String concat ()");
		String s1="java string";    
		// The string s1 does not get changed, even though it is invoking the method      
		// concat(), as it is immutable. Therefore, the explicit assignment is required here.  
		s1.concat("is immutable");    
		System.out.println(s1);    
		s1=s1.concat(" is immutable so assign it explicitly");    
		System.out.println(s1);    
		
   //Java String contains()
		System.out.println("Java String contains()");
		String name1="what do you know about me";  
		System.out.println(name1.contains("do you know"));  
		System.out.println(name1.contains("about"));  
		System.out.println(name1.contains("hello"));  
		
   //Java String endsWith()
		System.out.println("Java String endsWith()");
		String s11="java by javatpoint";  
		System.out.println(s11.endsWith("t"));  
		System.out.println(s11.endsWith("point"));  

	}

}
