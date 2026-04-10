
package com.java.practice.array.basicarray;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaxAndMin {

    public static void main(String[] args) {
        int[] res = findMaxMin(new int[]{3,1,9,2,0});

        // method 1: Manual iteration
        System.out.println(Arrays.toString(res));

        // method 2: Sorting
        int[] arr = new int[]{3,1,9,2,0};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1] + " " + arr[0]);

        // method 3: Streams
        int[] arr1 = new int[]{3,1,9,2,0};
        System.out.println(Arrays.stream(arr1).min().getAsInt());
        System.out.println(Arrays.stream(arr1).max().getAsInt());

        // method 4: Collections
        findMinAndMax();
    }

    private static void findMinAndMax() {
        Integer[] arr = {3, 1, 9, 2, 0};
        List<Integer> list = Arrays.asList(arr);

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("Max: " + max + ", Min: " + min);
    }

    private static int[] findMaxMin(int[] is) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (int i = 0; i < is.length; i++) {
            if (max <= is[i]) max = is[i];
            if (min >= is[i]) min = is[i];
        }
        return new int[]{max, min};
    }
}



/*
 * 

🥇 Best: Method 1 (Manual Iteration)
Time complexity: O(n)

Space complexity: O(1)

Direct, efficient, and doesn’t do unnecessary work.

Best choice when you only need min and max.




🥈 Second: Method 3 (Streams)
Time complexity: O(n)

Space complexity: O(1) (though streams add a tiny overhead internally).

Very concise and expressive, but slightly less efficient than raw iteration because of stream abstraction.

Great for readability and modern Java style.




🥉 Worst (for just min/max): Method 2 (Sorting)
Time complexity: O(n log n)

Space complexity: O(1) or O(n) depending on sorting algorithm.

Overkill if you only need min and max.

Useful only if you also need the array sorted for other operations.

 * 
 * */
