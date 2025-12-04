package com.java.practice.recursion;

public class Q40Fibonacci {

    public static void main(String[] args) {
        int n = 6; // Example input
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }
    
	public static int fibonacci(int n) {
		
        if (n == 0) {
            return 0; // Base case: F(0) = 0
        }
        if (n == 1) {
            return 1; // Base case: F(1) = 1
        }
        
        int first=fibonacci(n - 1);
        int second=fibonacci(n - 2);
        
        return first + second; // Recursive case
    }

}
