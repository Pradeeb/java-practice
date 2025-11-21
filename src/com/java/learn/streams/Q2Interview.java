package com.java.learn.streams;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

// Find highest salary
public class Q2Interview {

	public static void main(String[] args) {

		Map<String, Integer> map1 = new HashMap<>();

		map1.put("anil", 1000);
		map1.put("valan", 3000);
		map1.put("pradeeb", 2000);
		map1.put("arul", 5000);
		map1.put("karthi", 8000);
		map1.put("nazeem", 8000);

		Map.Entry<String, Integer> result = map1.entrySet()
				                                .stream()
				                                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				                                .collect(Collectors.toList())
				                                .get(1);

		System.out.println(result);
		
		// if same salary have 2 more person
		Entry<Integer, List<String>> res = map1.entrySet()
		    .stream()
		    .collect(Collectors.groupingBy(Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
		    .entrySet()
		    .stream()
		    .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
		    .collect(Collectors.toList())
		    .get(0);

		System.out.println(res);

	}

}
