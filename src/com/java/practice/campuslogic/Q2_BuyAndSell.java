package com.java.practice.campuslogic;

public class Q2_BuyAndSell {
	
	public static void main(String[] args) {
		
		int[] prices = {7,1,5,6,4,2};
		
		Q2_BuyAndSell.findProfit(prices);
		
		//buy sell date
		Q2_BuyAndSell.findProfitWithIndex(prices);
		
 	}
	
	public static void findProfit(int[] arr) {
		
		//worst case 
		if(arr.length == 0 || arr.length == 1) throw new NullPointerException();
		
		int min=Integer.MAX_VALUE;
		int MaxProfit=0,buy=0,sell=0;
		//Logic
		for(int price:arr) {
			
			if(min>price) {
				min=price;
			}
			else {
				int profit = price - min;
				MaxProfit=Math.max(profit, MaxProfit);
			}
		}
		
		System.out.println(MaxProfit);
	}
	
	 public static void findProfitWithIndex(int[] arr) {
	        
	        if(arr == null || arr.length < 2) 
	            throw new IllegalArgumentException("Invalid input");
	        
	        int min = arr[0];
	        int minIndex = 0;
	        
	        int maxProfit = 0;
	        int buyIndex = 0;
	        int sellIndex = 0;

	        for(int i = 1; i < arr.length; i++) {
	            
	            // If new minimum found → update buy day
	            if(arr[i] < min) {
	                min = arr[i];
	                minIndex = i;
	            } 
	            else {
	                int profit = arr[i] - min;
	                
	                if(profit > maxProfit) {
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
