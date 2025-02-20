package com.java.learn.test;


public class Test {
	public static void main(String[] args) {
		
		int n=16;
		
		find(n,n,true);
		
		
	}
	
	public static void find(int n,int og,boolean decreasing) {
		
		System.out.print(n+" ");
		
		//base case
		if(!decreasing && n==og) {
			return ;
		}
		int valueOfn=decreasing? n-5 :n+5;
		
		if(n - 5 <= 0) {
			decreasing=false;
		}
		find(valueOfn,og,decreasing);
	}
}