package com.java.practice.campuslogic;

public class Q2_BuyAndSell {
	
	public static void main(String[] args) {
		
		int[] prices = {7,1,5,6,4,2};
		
		Q2_BuyAndSell.findProfit(prices);
		
 	}
	
	public static void findProfit(int[] arr) {
		
		//worst case 
		if(arr.length == 0 || arr.length == 1) throw new NullPointerException();
		
		int min=Integer.MAX_VALUE;
		int MaxProfit=0;
		//Logic
		for(int price:arr) {
			
			if(min>price) min=price;
			else {
				int profit = price - min;
				MaxProfit=Math.max(profit, MaxProfit);
			}
		}
		
		System.out.println(MaxProfit);
	}

}
