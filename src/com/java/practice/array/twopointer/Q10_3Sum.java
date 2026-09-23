package com.java.practice.array.twopointer;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Q10_3Sum {

	public static void main(String[] args) {
		int[] arr = { -1, 0, 1, 2, -1, -4 };

		System.out.println(threeSum(arr));
	}

	public static List<List<Integer>> threeSum(int[] nums) {

		// for return type
		List<List<Integer>> ans = new ArrayList<>();

		// sort the Arrays
		Arrays.sort(nums);

		// Loop
		for (int i = 0; i < nums.length - 2; i++) {

			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				int low = i + 1;
				int high = nums.length - 1;
				int sum = 0 - nums[i];

				while (low < high) {
					if (nums[low] + nums[high] == sum) {
						ans.add(Arrays.asList(nums[i], nums[low], nums[high]));

						while (low < high && nums[low] == nums[low + 1]) {
							low++;
						}
						while (low < high && nums[high] == nums[high - 1]) {
							high--;
						}

						low++;
						high--;
					} else if (nums[low] + nums[high] < sum) {
						low++;
					} else {
						high--;
					}
				}

			}
		}

		return ans;
	}

}
