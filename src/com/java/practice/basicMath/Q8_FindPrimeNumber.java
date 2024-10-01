package com.java.practice.basicMath;

public class Q8_FindPrimeNumber {

	public static void main(String[] args) {
		
        System.out.println(isPrime(11));
	}
	
	static int isPrime(int N){
		
		 // Check for edge cases
        if (N <= 1) return 0; // 0 and 1 are not prime numbers
        if (N == 2) return 1; // 2 is the only even prime number
        if (N % 2 == 0) return 0; // Any other even number is not prime

        // Check divisibility from 3 up to the square root of N
        for (int i = 3; i <= Math.sqrt(N); i += 2) {
            if (N % i == 0) {
                return 0; // Not a prime number
            }
        }
        return 1; // Prime number
	}

}