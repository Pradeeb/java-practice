package com.java.learn.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MechanisamFlatMap {

	//flatMap()
	public static void main(String[] args) {
		
		//Learn FlatMap here
		
		List<Integer> num1=Arrays.asList(1,2,3);
		List<Integer> num2=Arrays.asList(4,5,6);
		List<Integer> num3=Arrays.asList(7,8,9);
		
		
	   List<List<Integer>> numList=Arrays.asList(num1,num2,num3);
	   
	   List<Integer> evenNumbers = numList.stream()
	            .flatMap(list -> list.stream().filter(x -> x % 2 == 0))
	            .collect(Collectors.toList());
	        
	        System.out.println(evenNumbers);

	}

}
