package com.java.practice.basicMath;


/*Given a number N, check if a number is perfect or not. A number is said to be perfect if sum of all its factors excluding the number itself is equal to the number. Return 1 if the number is Perfect otherwise return 0.

Example 1:

Input:
N = 6
Output:
1 
Explanation:
Factors of 6 are 1, 2, 3 and 6.
Excluding 6 their sum is 6 which
is equal to N itself. So, it's a
Perfect Number.

Example 2:

Input:
N = 10
Output:
0
Explanation:
Factors of 10 are 1, 2, 5 and 10.
Excluding 10 their sum is 8 which
is not equal to N itself. So, it's
not a Perfect Number.*/

public class Q12_PerfectNumber {

	public static void main(String[] args) {
	
		System.out.println(isPerfectNumber(6));
	}

	static int isPerfectNumber(long n) {
        if (n <= 1) {
            return 0; // No perfect number less than or equal to 1
        }

        long sum = 1; // Start with 1 because 1 is a divisor of every number

        // Check divisors up to sqrt(n)
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }

        // After the loop, compare sum with n
        if (sum == n) {
            return 1;
        } else {
            return 0;
        }
    }
}
