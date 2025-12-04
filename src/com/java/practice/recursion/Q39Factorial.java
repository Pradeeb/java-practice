package com.java.practice.recursion;
/*Given a positive integer, n. Find the factorial of n.

Examples :

Input: n = 5
Output: 120
Explanation: 1 x 2 x 3 x 4 x 5 = 120

Input: n = 4
Output: 24
Explanation: 1 x 2 x 3 x 4 = 24*/
public class Q39Factorial {

	public static void main(String[] args) {
	
      int n=5;
      System.out.println("Factorial of " + n + " is: " + findFactorial(n));
	}
   
	public static int findFactorial(int n) {
		if(n==1) {
			return 1;
		}
		return n*findFactorial(n-1);
		
	}
}
