package com.java.practice.basicMath;

public class Test {

	public static void main(String[] args) {
		 
		System.out.println(findSqure(10));

	}
	
	public static int findSqure(int n) {
		
		int start=0,end=n;
		int result=0;
		
		while(start<end) {
			int mid=(start+end)/2;

			if(mid*mid == n) {
				return mid;		
			}
			
			if(mid*mid <= n) {
				start=mid+1;
				result=mid;
			}else {
				end=mid-1;
			}
			
			
		}
		
		return result;
	}

}
