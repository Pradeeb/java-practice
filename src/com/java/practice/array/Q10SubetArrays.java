package com.java.practice.array;

import java.util.HashSet;

/*
 Given two arrays: a[] and b[], where both arrays may contain duplicate elements. The task is to determine whether array b is a subset of array a. It's important to note that both arrays can be unsorted. Additionally, each occurrence of a duplicate element within an array is considered as a separate element of the set.

Examples:

Input: a[] = [11, 7, 1, 13, 21, 3, 7, 3], b[] = [11, 3, 7, 1, 7]
Output: Yes
Explanation: b[] is a subset of a[]

Input: a[] = [1, 2, 3, 4, 4, 5, 6], b[] = [1, 2, 4]
Output: Yes
Explanation: b[] is a subset of a[]

Input: a[] = [10, 5, 2, 23, 19], b[] = [19, 5, 3]
Output: No
Explanation: b[] is not a subset of a[]
 */

public class Q10SubetArrays {

	public static void main(String args[]) {
		
		int a[] = {84, 84849, 9592, 99, 848, 843, 959, 5484}, b[] = {5484, 959, 99, 84};
		
		System.out.println(isSubset(a,b));
	}

	
	// its take lot of time
	public static boolean isSubset(int a[], int b[]) {
        String ans="";
		
		for(int i=0; i<b.length ; i++) {
			
			if(ans.equalsIgnoreCase("No")) 
			{
				break;
			}
			
			for(int j=0; j<a.length ; j++) {
				
				if(b[i] == a[j]) {
					ans="Yes";
					break;
				}else {
					ans="No";
				}
				
			}
		}
		
		boolean out =ans.equals("Yes")?true:false;
		
	    return out;
    }
	
	//it's take less time
	public static boolean isSubset1(int a[], int b[]) {
        // Add all elements of array 'a' to a HashSet
        HashSet<Integer> set = new HashSet<>();
        for (int num : a) {
            set.add(num);
        }
        
        // Check if all elements of array 'b' are present in the HashSet
        for (int num : b) {
            if (!set.contains(num)) {
                return false; // If any element is not found, return false
            }
        }
        
        return true; // If all elements of 'b' are found in 'a', return true
    }
}
