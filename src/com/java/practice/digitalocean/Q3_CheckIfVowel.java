package com.java.practice.digitalocean;

public class Q3_CheckIfVowel {

	public static void main(String[] args) {
		
		
		System.out.println(checkVowel("String"));

	}
	
	public static boolean checkVowel(String str) {
		
		return str.toLowerCase().matches(".*[aeiou].*");
	}

}
