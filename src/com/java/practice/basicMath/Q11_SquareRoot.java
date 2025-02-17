package com.java.practice.basicMath;

/*Given an integer n, find the square root of n. If n is not a perfect square, then return the floor value.

	    Floor value of any number is the greatest Integer which is less than or equal to that number

	Examples:

	Input: n = 5
	Output: 2
	Explanation: Since, 5 is not a perfect square, floor of square_root of 5 is 2.

	Input: n = 4
	Output: 2
	Explanation: Since, 4 is a perfect square, so its square root is 2.
*/	
public class Q11_SquareRoot {

	public static void main(String[] args) {
   System.out.println(floorSqrt(16));
   }

	public static long floorSqrt(long n) {

		if (n == 0 || n == 1) {
			return n;
		}

		long start = 1, end = n, result = 0;

		while (start <= end) {
			
			long mid = (start + end) / 2;
			// If mid*mid equals n, mid is the square root
			if (mid * mid == n) {
				return mid;
			}
			
			// If mid*mid is less than n, discard the left search space
			if (mid * mid < n) {
				start = mid + 1;
				result = mid;
			} else {
				// Discard the right search space
				end = mid - 1;
			}
		}

		return result;

	}
}
