package com.java.practice.basicMath;

public class Question5 {

	public static void main(String[] args) {
		
		Solution5 obj = new Solution5();
		
		
		System.out.println(obj.power(12, 12));

	}
}


class Solution5
{
        
	static final int MOD = 1000000007;

    // Function to perform modular exponentiation
    long power(int N, int R) {
        return powerMod(N, R, MOD);
    }

    // Helper function to perform modular exponentiation
    long powerMod(long base, long exp, long mod) {
        if (exp == 0) {
            return 1;
        }
        long half = powerMod(base, exp / 2, mod);
        half = (half * half) % mod;
        if (exp % 2 != 0) {
            half = (half * base) % mod;
        }
        return half;
    }
}
