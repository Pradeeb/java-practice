package com.java.practice.array;

import java.util.Arrays;

public class Q2FindThirstLargeElement {

	public static void main(String[] args) {
		
		//Arrays use 
		int[] number= {2, 4, 1, 3, 5};
		Arrays.sort(number);
		System.out.println(number[number.length-3]);
			}

}
