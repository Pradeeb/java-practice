package com.java.practice;

public class practice {
	
	  public static void main(String[] args) {
		  int x=8;
		  int n=16;
		  System.out.println(pow(x,n));
	      System.out.println("GCD: " + gcd(x,n));
		  
	  }
	  
	  public static int pow(int A,int B) {
		  
		  int ans= A < B ? A : B;
		  
		  while(ans > 0) {
			  
			  if((A % ans ==0)&&(B % ans ==0) ) break;
			  
			  ans--;
		  }
		  
		  return ans;
	  }
	  
	  public static int gcd(int A, int B) {
	        if (B == 0) {
	            return A;
	        } else {
	            return gcd(B, A % B);
	        }
	    }
}
