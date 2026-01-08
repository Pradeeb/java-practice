package com.java.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

// binary search 

public class Test{
	

	 public static void main(String[] args) {
		 
		 int[] num= {1,2,3,4,5,6,7,8,9,5,2,6};
		
		Set<Integer> set = Arrays.stream(num).boxed().collect(Collectors.toSet());
		
		set.add(10);
		 

		 
	 }
}
