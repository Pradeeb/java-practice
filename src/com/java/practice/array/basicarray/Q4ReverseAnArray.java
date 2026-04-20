package com.java.practice.array.basicarray;

import java.util.Arrays;

/*
 * 
O(n) time complexity
O(1) space complexity
Clean and efficient

🔁 Reverse Array (Steps)
Initialize start = 0
Initialize end = arr.length - 1
Check condition start < end
Swap arr[start] and arr[end]
Increment start++
Decrement end--
Repeat steps 3–6
Stop when start >= end

✅ Array is reversed in-place

🔑 Other related names:
Two-pointer approach
In-place reversal algorithm
💡 Why it's called Two Pointer?

Because you use:

one pointer at the start
one pointer at the end

and move them toward each other while swapping.

This technique is widely used in:

Array reversal
Palindrome checking
Pair sum problems
 * 
 * */

public class Q4ReverseAnArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		int start = 0, end = arr.length - 1;

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}

		System.out.println(Arrays.toString(arr));

	}

}
