package com.java.learn.java8.funcationinterface;

import java.util.function.Supplier;

public class LearnSupplier {
	// create object or integer 
	public static void main(String[] args) {
		
		 Supplier<String> s = () -> "Hello Pradeeb";
	        System.out.println(s.get());
	       
	     Supplier<Integer> s1 = () -> 10 + 20;
	        System.out.println(s1.get()); // 30
	        
	     Supplier<Double> randomValue = () -> Math.random();
	        System.out.println(randomValue.get());
	        
          //Object creation
	     Supplier<StringBuilder> sb = () -> new StringBuilder();
	}

}
