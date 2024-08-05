package com.java.practice.digitalocean;

public class Q7_Palindreome {

	public static void main(String[] args) {
				
		System.out.println(checkPalindromeString("vabbav"));

	}
	
	public static boolean checkPalindromeString(String input) {
		
		if(input == null || input.isEmpty()) {
			System.out.println("Null value not accepted");
			return false;
		}
		
		boolean result = true;
		int length = input.length();

		for (int i = 0; i < length/2; i++) {
			if (input.charAt(i) != input.charAt(length - i - 1)) {
				result = false;
				break;
			}
		}
		return result;
	}

}
