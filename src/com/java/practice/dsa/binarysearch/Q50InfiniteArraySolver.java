package com.java.practice.dsa.binarysearch;

public class Q50InfiniteArraySolver {

    // --- Simulation of the get(i) Method ---
    // IMPORTANT: In a real test, this function would be provided externally.
    // We simulate it here using a large target (e.g., 500,000,000) 
    // to demonstrate the need for 'long' and the speed of the algorithm.
    private static final long TARGET_INDEX_OF_FIRST_ONE = 500000000L; 

    /**
     * Simulates the external 'get(i)' function to access the array element.
     * @param i The index to check. Must be a long (64-bit) due to problem constraints.
     * @return 0 if the element is before the first '1', 1 otherwise.
     */
    public static int get(long i) {
        if (i < TARGET_INDEX_OF_FIRST_ONE) {
            return 0; 
        } else {
            return 1;
        }
    }

    // --- Phase 2: Binary Search Function ---
    /**
     * Finds the index of the first '1' within the finite range [low, high].
     * @param low The guaranteed index of a '0' or 0.
     * @param high The guaranteed index of a '1'.
     * @return The index of the first '1'.
     */
    private static long findFirstOneInRange(long low, long high) {
        // We use a long for the indices because the answer is 64-bit.
        long result = -1; 
        
        while (low <= high) {
            // Safe way to calculate mid to avoid overflow with large 'long' values
            long mid = low + (high - low) / 2;
            
            if (get(mid) == 1) {
                // We found a '1'. This is a potential answer.
                result = mid;
                // Move left (high = mid - 1) to find an EARLIER '1' (the first occurrence).
                high = mid - 1;
            } else { // get(mid) == 0
                // We found a '0'. The first '1' must be to the right.
                low = mid + 1;
            }
        }
        
        return result;
    }

    // --- Main Solution Function ---
    /**
     * Solves the problem using Exponential Search followed by Binary Search.
     * @return The 64-bit index of the first '1'.
     */
    public static long findFirstOne() {
        // 1. Edge Case: If the first '1' is at index 0.
        if (get(0) == 1) {
            return 0;
        }

        // 2. Phase 1: Exponential Search to find the bounds [low, high]
        long low = 0;
        long high = 1;

        // Keep doubling the high index as long as the value is 0
        while (get(high) == 0) {
            low = high;          // The previous high becomes the new low (guaranteed 0)
            
            // Safety check for maximum long value before doubling (avoids overflow)
            if (high > Long.MAX_VALUE / 2) {
                 high = Long.MAX_VALUE; 
                 break;
            }
            
            high = high * 2;     // Double the high index (The "Exponential Jump")
        }
        // 
        
        // 3. Phase 2: Binary Search on the now finite range [low, high]
        return findFirstOneInRange(low, high);
    }
    
    // --- Main Method for Testing ---
    public static void main(String[] args) {
        long answer = findFirstOne();
        System.out.println("Target index set in simulation: " + TARGET_INDEX_OF_FIRST_ONE);
        System.out.println("The index of the first '1' is: " + answer);
    }
}