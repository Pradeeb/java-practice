package com.java.practice.basicMath;

public class Qustion1 {

	//Find even or odd
	
	public static void main(String[] args) {
			
		System.out.println(oddEven(0));

	}

	  static String oddEven(int N){
	      
	      String out=null;
	      
	      out= N%2 == 0? "Even":"Odd";
	      
//	      if(N%2 != 0){
//	        out="odd";
//	      }else{
//	        out="even";
//	      }
	      return out;
	  }
}
