package com.java.practice.basicMath;

/* To improve the runtime performance of your GCD calculation, 
 * you can use the Euclidean algorithm, 
 * which is much more efficient than finding all divisors of both numbers. 
 * Here's how you can implement it:
*/
public class Q6_GCD {

	public static void main(String[] args) {

     int c=8;
     int d=16;
     System.out.println(findGCD(c,d));
	}
	
	public static int findGCD(int a, int b) {
		 if (b == 0) {
	            return a;
	        }
	        return findGCD(b, a % b);
	}

}
