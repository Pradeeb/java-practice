package com.java.practice.digitalocean;

import java.util.Arrays;
import java.util.List;

public class Q6_FindEvenNumber {

	public static void main(String[] args) {
		
		List<Integer> listNum=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,23,5);
		
		System.out.println(onlyOddNumbers(listNum));
		System.out.println(onlyEvenNumbers(listNum));
	}
	
	public static boolean onlyOddNumbers(List<Integer> list) {
		for (int i : list) {
			if (i % 2 != 0)
				return false;
		}
		return true;
	}
	public static boolean onlyEvenNumbers(List<Integer> list) {
		return list.parallelStream().anyMatch(x -> x%2 == 0);
	}
}
