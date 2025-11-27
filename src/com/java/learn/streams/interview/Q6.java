package com.java.learn.streams.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Find the first character match the element
public class Q6 {

	public static void main(String[] args) {
		
		int[] num= {1,2,3,5,10,11,21,13};
		
		List<Integer> ans=Arrays.stream(num).mapToObj(String::valueOf)
				                .filter(x-> x.startsWith("1"))
				                .map(Integer::valueOf)
				                .collect(Collectors.toList());
		
		System.out.println(ans);

	}

}
