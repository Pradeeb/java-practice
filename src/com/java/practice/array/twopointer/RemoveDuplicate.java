package com.java.practice.array.twopointer;

import java.util.Arrays;

// https://youtu.be/EAKUIpT141Q?si=quIaiOZ3cbmn6OQI

/*
1. J is 0
2  i is 1
3. when J != i increase j++ and value change from i to j
4. i automatically iterator 
5. when j is there that length are not duplicate
*/

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		int[] num= {1,2,2,3,4,4,5};
		
		int j=0;
		
		for(int i=1 ; i<num.length ;i++) {
			
			if(num[j] != num[i]) {
				
				j++;
				num[j]=num[i];
				
			}
		}
		System.out.println(j+1);
		System.out.println(Arrays.toString(num));
		

	}

}
