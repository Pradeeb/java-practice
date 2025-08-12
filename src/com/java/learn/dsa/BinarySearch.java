package com.java.learn.dsa;

public class BinarySearch {
	/*
	 * Key Points:
	 * 
	 * Sorted Array: Binary search only works on sorted arrays or lists. Unsorted
	 * inputs give undefined results.
	 * 
	 * Duplicate Values: If duplicates exist, the returned index depends on the
	 * implementation (e.g., it may return the first or any occurrence).
	 * 
	 * Efficient: Binary search is efficient for a large dataset if the given input
	 * is sorted. Always refer to binary search over sequential search.
	 * 
	 */
	public static void main(String[] args) {

//		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int a[] = { 2, 3, 4, 10, 40 };
		int n = a.length;
		int x = 40;

		int res = binarySearch(a, 0, n - 1, x);

		System.out.println("Element to be searched is : " + x);

		if (res == -1)
			System.out.println("Element is not present in array");
		else
			System.out.println("Element is present at index: " + res);

	}

	//Iterative Method

	private static int binarySearch(int a[], int start, int length, int findvalue) {
		while (start <= length) {
			
			int mid = (start + length) / 2;
			
			 // Index of Element Returned
            if (a[mid] == findvalue) {
                return mid;
                // If element is smaller than mid, then
                // it can only be present in left subarray
                // so we decrease our r pointer to mid - 1 
		      }
            else if (a[mid] > findvalue) {
            	length = mid - 1;

            // Else the element can only be present
            // in right subarray
            // so we increase our l pointer to mid + 1
            } else {
            	start = mid + 1;
            }  
	}
		return -1;
	}
	}
