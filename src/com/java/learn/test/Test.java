package com.java.learn.test;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		
		printAllNumber(8,16);
	}

	private static void printAllNumber(int a,int b) {
		if(b==0) {
			System.out.println(a);
			return;
		}
		printAllNumber(b,a%b);
		System.out.println(++a);
	}



}