package com.java.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		List<String> str=Arrays.asList("One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten");
		
		String out=str.stream().collect(Collectors.joining(", "));
		
		System.out.println(out);
		
	}
}


