package com.java.practice.campuslogic;

public class Q2_BuyAndSell {
	
	/*
	 * 
	 * 1. set variable minimum & profit
	 * 2. set minimum value use if condition
	 * 3. current value higher then minimum else side find profit
	 * 4. compare the maximum current profit with old profit
	 * 
	 * */
	
	public static void main(String[] args) {
		
		int[] prices = {7,1,5,6,4,2};
		
		Q2_BuyAndSell.findProfit(prices);
		
		//buy sell date
		Q2_BuyAndSell.findProfitWithIndex(prices);
		
 	}
	
	public static void findProfit(int[] arr) {

		// worst case
		if (arr.length == 0 || arr.length == 1)
			throw new NullPointerException();

		// 1. set variable minimum & profit
		int min = Integer.MAX_VALUE;
		int MaxProfit = 0;

		for (int price : arr) {

			// 2. set minimum value use if condition
			if (min > price) {
				min = price;
			}
			// 3. current value higher then minimum else side find profit
			else {
				int profit = price - min;

				// 4. compare the maximum, Current profit with old profit
				MaxProfit = Math.max(profit, MaxProfit);
			}
		}

		System.out.println(MaxProfit);
	}

	public static void findProfitWithIndex(int[] arr) {

		if (arr == null || arr.length < 2)
			throw new IllegalArgumentException("Invalid input");

		int min = arr[0];
		int minIndex = 0;

		int maxProfit = 0;
		int buyIndex = 0;
		int sellIndex = 0;

		for (int i = 1; i < arr.length; i++) {

			// If new minimum found → update buy day
			if (arr[i] < min) {
				min = arr[i];
				minIndex = i;
			} else {
				int profit = arr[i] - min;

				if (profit > maxProfit) {
					maxProfit = profit;
					buyIndex = minIndex;
					sellIndex = i;
				}
			}
		}

		System.out.println("Max Profit: " + maxProfit);
		System.out.println("Buy on day (index): " + buyIndex);
		System.out.println("Sell on day (index): " + sellIndex);
	}

}
