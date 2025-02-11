package com.java.practice.array;

import java.util.Arrays;

public class Q6ArraySorting {

    public static void main(String[] args) {
        int[] arr = {0,3,1,5,6,2,3,4,7,9,8};
        sorting(arr);
    }

    static void sorting(int[] arr) {

        // Using Bubble Sort for demonstration
        for (int i = 0; i < arr.length; i++) {
        	
            for (int j = 0; j < arr.length-1-i; j++) {
                // Check if the current element is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                	int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
                
            }
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));

    }
}
