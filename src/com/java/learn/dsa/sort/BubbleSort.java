package com.java.learn.dsa.sort;

import java.util.Arrays;

/*
 
🔹 What is Bubble Sort?

Bubble Sort is a simple sorting algorithm that repeatedly compares adjacent elements and swaps them if they are in the wrong order.
After each pass, the largest element "bubbles" to the end of the array.

🔹 Step-by-Step Example

Suppose the array is:
[5, 1, 4, 2, 8]

Pass 1

Compare adjacent elements:

(5,1) → swap → [1,5,4,2,8]

(5,4) → swap → [1,4,5,2,8]

(5,2) → swap → [1,4,2,5,8]

(5,8) → no swap → [1,4,2,5,8]

✅ Largest element (8) moves to the end.

Pass 2

(1,4) → ok

(4,2) → swap → [1,2,4,5,8]

(4,5) → ok

(5,8) → ok

✅ Now 5 and 8 are in correct positions.

Pass 3

(1,2) → ok

(2,4) → ok
No swaps → array is sorted → [1,2,4,5,8]

Bubble Sort can stop early when no swaps occur in a pass.
 
 * */

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr []= {42, 7, 89, 13 ,65 ,22 ,99 ,5 ,31 ,76};
       
		for(int i=0; i < arr.length-1 ; i++) {
			for(int j=0; j < arr.length-1-i ; j++) {
				  // Check if the current element is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                	int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
