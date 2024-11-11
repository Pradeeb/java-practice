package com.java.practice;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		findDivisors(10);
	}
   public static void findDivisors(int a) {
	   ArrayList<Integer> numbers=new ArrayList<Integer>();
	   
	   for(int i=1; i<=10;i++) {
          
		   if(a%i==0) {
			   numbers.add(i);
		   }
	   }
	   
	   numbers.stream().forEach(x -> System.out.print(x+" "));
   }
}


