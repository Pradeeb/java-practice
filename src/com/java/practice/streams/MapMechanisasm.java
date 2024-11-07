package com.java.practice.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class MapMechanisasm {

	public static void main(String[] args) {

		List<String> vehicles=Arrays.asList("bus","car","bike","by cycle","flight","train");
		
		vehicles=vehicles.stream().map(x->x.toUpperCase()).collect(Collectors.toList());

		vehicles.stream().forEach(System.out::println);
	}

}
