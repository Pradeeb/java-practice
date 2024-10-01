package com.java.practice.basicMath;


/*You are given an integer N, reverse the digits of given number N, ensuring that the reversed number has no leading zeroes. Return the resulting reversed number.

Example 1:

Input: 200
Output: 2
Explanation: By reversing the digits of 
number, number will change into 2.

Example 2:

Input : 122
Output: 221
Explanation: By reversing the digits of 
number, number will change into 221.*/

public class Question4 {

	public static void main(String[] args) {
				
		System.out.println(reverse_digit(23251));

	}
	
	public static int reverse_digit(int n) {
		 
		int og=n;
		int reverse=0;
		
		while(og>0) {
			reverse=reverse*10+og%10;
			
			og /= 10;
		}
		
		return reverse;
	}

}