package com.java.practice.basicMath;

public class Question5 {

    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        System.out.println(power(12, 12));
    }

    // Modular exponentiation (recursive)
    public static long power(long base, long exp) {
        if (exp == 0) return 1;

        long half = power(base, exp / 2) % MOD;
        long result = (half * half) % MOD;

        if (exp % 2 == 1) {
            result = (result * base) % MOD;
        }
        return result;
    }
    
}
