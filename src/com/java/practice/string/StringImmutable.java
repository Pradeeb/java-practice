package com.java.practice.string;

public class StringImmutable {
	
	public static void main(String[] args) {
		
		String s="valan";
		s.concat("pradeeb");
		
	    System.out.println(s); //will print valan because strings are immutable objects  
	    
	    s=s.concat(" pradeeb");
	    System.out.println(s); //will print valan pradeeb s point the objects  
	}

}
