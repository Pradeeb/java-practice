package com.java.learn.streams.interview;

import java.util.Arrays;
import java.util.Comparator;


// Fins the second maximum number
public class Q4 {

	public static void main(String[] args) {

		int[] num= {1,5,8,7,9,2,10,32,21};
		
		  Integer ans = Arrays.stream(num).boxed()  // its use to convert int to Integer 
				 .sorted(Comparator.reverseOrder()) // if you want ASCR remove => Comparator.reverseOrder()
				 .skip(1)
				 .findFirst()
				 .get();
		 System.out.println(ans);
	}
}
