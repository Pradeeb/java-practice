package com.java.practice.recursion;

/*
 Given a number n, find the value of n raised to the power of its own reverse.

Note: The result will always fit into a 32-bit signed integer.

Examples:

Input: n = 2
Output: 4
Explanation: The reverse of 2 is 2, and 22 = 4.

Input: n = 10
Output: 10
Explanation: The reverse of 10 is 1 (leading zero is discarded), and 101 = 10.

Input: n = 3
Output: 27
Explanation: The reverse of 3 is 3, and 33 = 27.
 
 */
public class Q41PowerReverse {

	public static void main(String[] args) {

		// Test cases
		System.out.println(powerReverse(2)); // Output: 4
		System.out.println(powerReverse(10)); // Output: 10
		System.out.println(powerReverse(3)); // Output: 27
	}

	private static int powerReverse(int i) {

		int reverse = FindReverse(i, 0);

		return powerRecursive(i, reverse);
	}

	// reverse
	private static int FindReverse(int n, int rev) {

		if (n == 0) {
			return rev;
		}

		return FindReverse(n / 10, rev * 10 + n % 10);
	}

	// Function to calculate the power recursively
	public static int powerRecursive(int base, int exponent) {
		if (exponent == 0) {
			return 1; // Base case: any number raised to the power of 0 is 1
		}
		// Recur: base^exponent = base * base^(exponent - 1)
		return base * powerRecursive(base, exponent - 1);
	}

}
