package com.java.practice.basicMath;

import java.util.ArrayList;
import java.util.Collections;

/*Problem statement

Given an integer ‘N’, your task is to write a program that returns all the divisors of ‘N’ in ascending order.


For example:

'N' = 5.
The divisors of 5 are 1, 5.

Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :

10

Sample Output 1 :

1 2 5 10

Explanation of Sample Input 1:

The divisors of 10 are 1,2,5,10.

Sample Input 2 :

6

Sample Output 2 :

1 2 3 6

Explanation of Sample Input 2:

The divisors of 6 are 1, 2, 3, and 6.

Constraints :

1 <= 'N' <= 10^5 
*/

public class Q7_PrintAllDivisors {

	public static void main(String[] args) {
		int a = 5;
		System.out.println(printAllDivisors(a));
	}

	public static ArrayList<Integer> printAllDivisors(int a) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 1; a >= i; i++) {

			if (a % i == 0) {
				list.add(i);
			}

		}

		Collections.sort(list);

		return list;
	}

}
