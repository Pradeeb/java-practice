package com.java.practice.basicMath;

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
		System.out.println(ob.getLastDigit("22", "2536"));
	}

}

//Modular Arithmetic Approach
// YOUTUBE URL : https://www.youtube.com/watch?v=8fEAjdE1DyA&t=8s
class Qustion2Solution {
	static int getLastDigit(String a, String b) {
	
		
		 // Get the last digit of a
        int lastDigitA = a.charAt(a.length() - 1) - '0';
        
        // If b is "0", then a^0 is 1 for any a
        if (b.equals("0")) {
            return 1;
        }
        
        // If a ends in 0, 1, 5, or 6, the last digit remains the same regardless of b
        if (lastDigitA == 0 || lastDigitA == 1 || lastDigitA == 5 || lastDigitA == 6) {
            return lastDigitA;
        }

        // Calculate the exponent b % 4
        int mod4 = 0;
        for (int i = 0; i < b.length(); i++) {
            mod4 = (mod4 * 10 + (b.charAt(i) - '0')) % 4;
        }

        // If mod4 is 0, it means b is a multiple of 4, which corresponds to the cycle's length
        if (mod4 == 0) {
            mod4 = 4;
        }

        // Calculate the last digit of a^mod4
        int result = (int) Math.pow(lastDigitA, mod4) % 10;
        
        return result;

	}
}