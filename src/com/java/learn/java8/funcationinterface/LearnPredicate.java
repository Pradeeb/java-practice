package com.java.learn.java8.funcationinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LearnPredicate {
 //Predicate<T> is used for conditions (true/false checks)
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 10, 15, 20);

        list.stream()
            .filter(x -> x > 10)   // Predicate used here
            .forEach(System.out::println);
        
        Predicate<Integer> p = x -> x > 10;

        System.out.println(p.test(15)); // true
        System.out.println(p.test(5));  // false

	}

}
