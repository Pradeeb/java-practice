package com.java.practice.campuslogic;

/*

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true

 */
import java.util.HashSet;
import java.util.Set;

public class Q3_ContainsDuplicate {

    public static void main(String[] args) {
        int[]  arr= {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println( Q3_ContainsDuplicate.find(arr));
        System.out.println( Q3_ContainsDuplicate.find1(arr));
    }

    public static boolean find(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                return true;
            }
        }

        return false;
    }

    public static boolean find1(int[] num) {
        boolean ans = false;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
