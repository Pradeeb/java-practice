package com.java.practice.dsa.binarysearch;

public class Q46FindFloorAndCeil {

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x = 11;

        int floorIndex = findFloorIndex(arr, x);
        System.out.println("Floor index of " + x + " = " + floorIndex);
    }

    private static int findFloorIndex(int[] arr, int x) {
        int start = 0, end = arr.length - 1;
        int result = -1; // default: no floor found

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] <= x) {
                result = mid;      // store candidate index
                start = mid + 1;   // move right to find last occurrence
            } else {
                end = mid - 1;     // move left
            }
        }
        return result;
    }
}
