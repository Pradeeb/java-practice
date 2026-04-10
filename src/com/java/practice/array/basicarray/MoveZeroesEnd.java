package com.java.practice.array.basicarray;

import java.util.Arrays;

/*
 * 
 
🧩 Key Idea (in points)

One pointer (pos) tracks position to place non-zero
Traverse array using loop
Place all non-zero elements at front
Fill remaining positions with 0


⚡ Characteristics

✅ In-place algorithm
✅ Maintains order (stable)
✅ O(n) time complexity
✅ O(1) space complexity

*/
public class MoveZeroesEnd {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 3, 0, 5, 0 };
		int pos = 0;
		for (int num : arr) {
			if (num != 0) {
				arr[pos++] = num;
			}
		}
		while (pos < arr.length) {
			arr[pos++] = 0;
		}

		System.out.println(Arrays.toString(arr));
	}

}
