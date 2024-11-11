
package com.java.practice.basicMath;

public class Q9_ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println(armstrongNumber(375));
	}
	
	static String armstrongNumber(int n) {
	     int og=n;
	     int ans=0;
	     while(n>0){
	         int last=n%10;
	         last=last*last*last;
	         ans=last+ans;
	          n /=10;
	     }
	     if(og==ans){
	         return "true";
	     }
	      return "false";
	    }
}
