package com.java.practice.array;

import java.util.Arrays;

public class Q6ArraySorting {

    public static void main(String[] args) {
        int[] arr = {9, 1, 8, 2, 3, 7, 4, 6, 5};
        sorting(arr);
    }

    static void sorting(int[] arr) {
        int temp = 0;

        // Using Bubble Sort for demonstration
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // Check if the current element is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
