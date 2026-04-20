package com.java.practice.array.twopointer;

public class Q3ContainerWithMostWater {

	public static void main(String[] args) {
		
		int[] arr= {1,8,6,2,5,4,8,3,7};
		
		//create two pointers and answer
		int l=0,r=arr.length-1,ans=0;
		
		while(l<r) {
			
			//find width between right and left
			int width=r-l;
			System.out.println(width);
			
			//find minimum size 
			int min_h=Math.min(arr[l], arr[r]);
			System.out.println(min_h);
			
			//find total width*minimum_height
			int totalWater=width*min_h;
			System.out.println(totalWater);
			
			//compare old and new value
			ans=Math.max(ans, totalWater);
			System.out.println(ans);

			if(arr[l]<arr[r]) {
				l++;
			}else {
				r--;
			}
			System.out.println("************Loop end*************");
		}
		System.out.println(ans);
	}

}
