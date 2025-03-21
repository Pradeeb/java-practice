package com.java.learn.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {
	
	public static void main(String[] args) {
		
		Integer[] numbers= {1,2,3,4,5};
		
		List<Integer>num=Arrays.asList(numbers);
		
		Optional<Integer> re=num.stream().min((x,y)->{return x.compareTo(y);});
		
		System.out.println(re.get());
		
		List<Integer> reverse=num.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(reverse);
		
		num.stream().sorted().collect(Collectors.toList());
		
		System.out.println(num);
	}

}