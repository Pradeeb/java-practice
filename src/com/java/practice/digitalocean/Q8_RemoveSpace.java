package com.java.practice.digitalocean;

public class Q8_RemoveSpace {

	public static void main(String[] args) {
		System.out.println(removeWhiteSpaces("THIS IS a test"));
	}
	
	public static String removeWhiteSpaces(String input) {
		StringBuilder output = new StringBuilder();
		
		char[] charArray = input.toCharArray();
		
		for (char c : charArray) {
			if (!Character.isWhitespace(c))
				output.append(c);
		}
		
		return output.toString();
	}
}
