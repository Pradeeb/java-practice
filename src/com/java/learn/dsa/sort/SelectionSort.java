package com.java.learn.dsa.sort;

import java.util.Arrays;

/*
 
What it does (short)

Selection Sort repeatedly selects the smallest (or largest) element from the unsorted portion and places it at the beginning of that portion. After each pass, the sorted portion grows by one.

Step-by-step (example)

Array: [4, 1, 3, 9, 7]

Pass 1 (i = 0) — find min in [4,1,3,9,7] → 1 at index 1 → swap with index 0
Result: [1, 4, 3, 9, 7]

Pass 2 (i = 1) — find min in [4,3,9,7] → 3 at index 2 → swap with index 1
Result: [1, 3, 4, 9, 7]

Pass 3 (i = 2) — find min in [4,9,7] → 4 at index 2 → swap with index 2 (no-op)
Result: [1, 3, 4, 9, 7]

Pass 4 (i = 3) — find min in [9,7] → 7 at index 4 → swap with index 3
Result: [1, 3, 4, 7, 9]
 
 ########################  Key properties (quick list) ###################

Time complexity:

Best / Average / Worst = O(n²) (regardless of input order)

Space complexity: O(1) (in-place)

Number of swaps: ≤ n − 1 (one swap per outer iteration) — fewer swaps than many other O(n²) sorts

Stable? No (standard implementation is not stable — equal elements may change relative order)

Adaptive? No (doesn't benefit from partially sorted data)

Use when: small arrays or when you want very few swaps (e.g., when swap cost is high)

########################  Practical notes / tips  #########################

Because it always scans the remaining elements to find the minimum, Selection Sort performs the same number of comparisons regardless of input.

If you need stability, you can implement a stable version by shifting elements instead of swapping, but that increases cost for moves.

For large arrays, use efficient sorts (QuickSort, MergeSort, TimSort). Selection Sort is mostly educational or for tiny arrays.
 */

public class SelectionSort {
	
	public static void main(String [] args) {
		
		int arr []= {42, 7, 89, 13 ,65 ,22 ,99 ,5 ,31 ,76};
		
		 for (int i = 0; i < arr.length - 1; i++) {
	            int minIndex = i;  // assume current index has the smallest element

	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;  // found a smaller element
	                }
	            }

	            // Swap the found minimum element with the first element
	            int temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;
	        }
		 System.out.println(Arrays.toString(arr));
		 
		
	}

}
