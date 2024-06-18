package com.java.practice;

public class Qustion2 {

	/*
	 * Find last digit in a number
	 * 
	 * You are given two integer numbers, the base a and the index b. You have to
	 * find the last digit of a^b.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: a = "3", b = "10" Output: 9 Explanation: 3^10 = 59049. Last digit is
	 * 9.
	 * 
	 * Your Task: You don't need to read input or print anything. Your task is to
	 * complete the function getLastDigit() which takes two strings a,b as
	 * parameters and returns an integer denoting the last digit of ab.
	 * 
	 * 
	 * 
	 * Expected Time Complexity: O(|b|) Expected Auxiliary Space: O(1)
	 * 
	 * 
	 * 
	 * Constraints: 1 <= |a|,|b| <= 1000
	 * 
	 * Note:|a| = length of a and |b| = length of b. There will not be any test
	 * cases such that ab is undefined.
	 */

	public static void main(String[] args) {
     
		Qustion2Solution ob=new Qustion2Solution();
		System.out.println(ob.getLastDigit("5", "5"));
	}

}

//Modular Arithmetic Approach

// YOUTUBE URL : https://www.youtube.com/watch?v=8fEAjdE1DyA&t=8s
class Qustion2Solution {
	static int getLastDigit(String a, String b) {
		return 0;
	}
}