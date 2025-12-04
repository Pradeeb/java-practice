package com.java.learn.dsa.sort;

import java.util.Arrays;

/*

🔹 What is Insertion Sort?

Insertion Sort works the way you sort playing cards in your hand.
You pick one card at a time (from unsorted part) and insert it into the correct position in the sorted part (on the left).

So, the array is divided into two parts:

Sorted (on the left)

Unsorted (on the right)

🔹 Step-by-Step Example

Array: [5, 3, 4, 1, 2]

Step	Sortedpart	 Unsorted part	 Action
Start	[5]	         [3,4,1,2]	     First element considered sorted
Pass 1	[3,5]	     [4,1,2]	     Insert 3 before 5
Pass 2	[3,4,5]	     [1,2]	         Insert 4 between 3 and 5
Pass 3	[1,3,4,5]	 [2]	         Insert 1 at the beginning
Pass 4	[1,2,3,4,5]	 []	             Insert 2 between 1 and 3



🔹 Key Points
Property	        Description

Algorithm Type	    Comparison-based
Time Complexity	    O(n²) (worst & average), O(n) (best if already sorted)
Space Complexity	O(1) — in-place
Stable?	            ✅ Yes
Adaptive?	        ✅ Yes (fast for nearly sorted data)
Best for	        Small datasets or partially sorted data


*/

public class InsertionSort {
	
	public static void main(String [] args) {
		
		int arr []= {42, 7, 89, 13 ,65 ,22 ,99 ,5 ,31 ,76};
		
		for(int i=1 ; i < arr.length ;i++) {
			for(int j=i; j > 0 ;j--) {
				if(arr[j] < arr[j-1]) {
					int temp=arr[j] ;
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					System.out.println(Arrays.toString(arr));
				}else {
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}


	
	

}
