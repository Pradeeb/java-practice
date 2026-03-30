package com.java.practice.campuslogic;


public class Test {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, 5,7, 5,1};
        
        int min=Integer.MAX_VALUE;
        int profit=0,index=0,buy=0,sell=0;
        
        for(int i=0; i<nums.length ;i++) {
        	if(nums[i]<min) {
        		min=nums[i];
        		index=i;
        	}else {
        		int temp=nums[i]-min;
        		
        		if(temp>profit) {
        			profit=temp;
        			buy=index;
        			sell=i;
        		}
     //   		profit=Math.max(temp, profit);
        	}
        }
        System.out.println(buy);
        System.out.println(sell);
        System.out.println(profit);


    }
    
}
