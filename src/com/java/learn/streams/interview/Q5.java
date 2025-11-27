package com.java.learn.streams.interview;

import java.util.Arrays;

// Find the longest String in given array
public class Q5 {

	public static void main(String[] args) {
		
		String[] words= {"valan","pradeeb","arul","selva","nazeem","karthi"};
		
		String ans=Arrays.stream(words).reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get();
		System.out.println(ans);

	}

}

/*
 ******************Use reduce() when:***********************
 * 
 * You want one final result, not a collection
 * 
 * You combine each element step-by-step
 * 
 * You want to apply an associative operation
 * 
 * The operation can be done pairwise safely
 */