package com.java.learn.dsa;

public class LeanearSearch {
	/*
Time and Space Complexity of Linear Search Algorithm:
Time Complexity:


1.Best Case: In the best case, the key might be present at the first index. So the best case complexity is O(1)
2.Worst Case: In the worst case, the key might be present at the last index i.e., opposite to the end from which the search has started in the list. So the worst-case complexity is O(N) where N is the size of the list.
3.Average Case: O(N)
4.Auxiliary Space: O(1) as except for the variable to iterate through the list, no other variable is used. 


Advantages of Linear Search Algorithm:
1.Linear search can be used irrespective of whether the array is sorted or not. It can be used on arrays of any data type.
2.Does not require any additional memory.
3.It is a well-suited algorithm for small datasets.


Disadvantages of Linear Search Algorithm:
1.Linear search has a time complexity of O(N), which in turn makes it slow for large datasets.
2.Not suitable for large arrays.


When to use Linear Search Algorithm?
1.When we are dealing with a small dataset.
2.When you are searching for a dataset stored in contiguous memory.

	 */    		
	public static void main(String[] args) {
 
		int[] numbers = { 1, 8, 5, 46, 2, 76, 2, 7, 5, 2, 7, 1, 5 };
        int findIndexOf=17;
		int length = numbers.length;

		for (int i = 0; i <length; i++) {
            
			if(findIndexOf == numbers[i]) {
				System.out.println("the index of "+findIndexOf+" is ; "+i);
			}
		}

	}

}
