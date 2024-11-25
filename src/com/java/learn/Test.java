package com.java.learn;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<String>();
		
		names.add("valan");
		names.add("J");
		names.add(1,"pradeeb");
		
		names.stream().map(x->x+" ").forEach(System.out::print);
	}
}


