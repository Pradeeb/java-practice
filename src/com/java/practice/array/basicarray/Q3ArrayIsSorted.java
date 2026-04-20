package com.java.practice.array.basicarray;

/*
 * 
 Explanation:

1. Checks for null or arrays with 0 or 1 element and returns true.
2. Iterates from the second element, comparing each with the previous.
3. If any previous element is greater than the current, returns false.
4. If the loop completes, the array is sorted, so returns true.
 * 
 * */
public class Q3ArrayIsSorted {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 11 };
		System.out.println(isSorted(arr));
	}

	static boolean isSorted(int[] arr) {
	    if (arr == null || arr.length <= 1) return true;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}

}
