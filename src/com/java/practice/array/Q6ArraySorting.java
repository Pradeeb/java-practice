package com.java.practice.array;

import java.util.Arrays;

public class Q6ArraySorting {

    public static void main(String[] args) {
        int[] arr = {0 ,1 ,2 ,0 ,1 ,2};
        sorting(arr);
    }

    static void sorting(int[] arr) {

        // Using Bubble Sort for demonstration
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
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
        
        for(int num:arr) {
        	System.out.print(num+" ");
        }
    }
}
