package com.java.practice.string;

public class CharAndString {

	public static void main(String[] args) {
		
		//char iteration 
		char[] letters= {'V','A','L','A','N'};
		for(int i=0 ; i <= letters.length-1; i++){
			System.out.println(letters[i]);
		}
		
		//char to String 
		String value=String.valueOf(letters);
		System.out.println(value);
		
		//String to char 
		String name="valan";
		char ch1=name.charAt(0);
		System.out.println(ch1);
		
		char[] ch=name.toCharArray();
		for(int i =0 ; i <= ch.length-1; i++) {
			System.out.print(ch[i]);
		}
		
		
		//String reverse print
		for(int i =ch.length-1 ; i >= 0; i--) {
			System.out.print(ch[i]);
		}
		
		

	}

}
