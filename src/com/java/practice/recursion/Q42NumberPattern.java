package com.java.practice.recursion;

import java.util.ArrayList;
import java.util.List;

/*
 
 Print a sequence of numbers starting with n, without using a loop. Replace n with n - 5, n−5... until n≤0. Then, replace n with n+5, n + 5, n+5 until n regains its initial value. Complete the function pattern(n) which takes n as input and returns a list containing the pattern.

Examples

Input: n = 16
Output: 16 11 6 1 -4 1 6 11 16
Explanation: The value decreases until it is greater than 0. After that it increases and stops when it becomes 16 again.

Input: n = 10
Output: 10 5 0 5 10
Explanation: It follows the same logic as per the above example.

 */
public class Q42NumberPattern {
	public static void main(String[] args) {
        int n1 = 16;
        pattern(n1);
       System.out.println("\n");
        int n2 = 10;
        pattern(n2);
    }

    public static void pattern(int n) {
        patternHelper(n, n, true);
    }

    private static void patternHelper(int n, int original, boolean decreasing) {
        System.out.print(n+" ");

        // Base condition: Stop when n returns to original in increasing phase
        if (!decreasing && n == original) {
            return;
        }

        // Decide the next number
        int nextN = decreasing ? n - 5 : n + 5;

        // If n is <= 0, switch to increasing mode
        if (n - 5 <= 0) {
            decreasing = false;
        }

        patternHelper(nextN, original, decreasing);
    }
}
