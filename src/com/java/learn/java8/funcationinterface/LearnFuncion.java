package com.java.learn.java8.funcationinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class LearnFuncion {
   // Function<T, R> is used to transform input into output   ** list.stream().map(x -> x * 10)   // Function used here
	public static void main(String[] args) {
		  List<Integer> list = Arrays.asList(1, 2, 3);

	        list.stream()
	            .map(x -> x * 10)   // Function used here
	            .forEach(System.out::println);
	        
	        Function<Integer, Integer> f = x -> x * 2;
	        System.out.println(f.apply(5)); // 10
	}

}
