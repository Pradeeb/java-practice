package com.java.practice.basicMath;


/*Given a number n. Count the number of digits in n which evenly divide n. Return an integer, total number of digits of n which divides n evenly.

Note :- Evenly divides means whether n is divisible by a digit i.e. leaves a remainder 0 when divided.
 

Examples :

Input: n = 12
Output: 2
Explanation: 1, 2 when both divide 12 leaves remainder 0.

Input: n = 2446
Output: 1
Explanation: Here among 2, 4, 6 only 2 divides 2446 evenly while 4 and 6 do not.

Input: n = 23
Output: 0
Explanation: 2 and 3, none of them divide 23 evenly.

Expected Time Complexity: O(log n)
Expected Space Complexity: O(1)*/

public class Question3 {

	public static void main(String[] args) {
		
		    int n1 = 22;
	        int n2 = 2446;
	        int n3 = 23;

	        System.out.println("Input: " + n1 + " Output: " + countDividingDigits(n1));  // Output: 2
	        System.out.println("Input: " + n2 + " Output: " + countDividingDigits(n2));  // Output: 1
	        System.out.println("Input: " + n3 + " Output: " + countDividingDigits(n3));  // Output: 0

	}
	
	public static int countDividingDigits(int n) {
        int count = 0;
        int originalNumber = n;  // Store the original number to check divisibility
        
        // Loop through each digit in the number
        while (n > 0) {
            int digit = n % 10;  // Get the last digit
            if (digit != 0 && originalNumber % digit == 0) {
                count++;
            }
            n /= 10;  // Remove the last digit
        }
        
        return count;
    }

}
