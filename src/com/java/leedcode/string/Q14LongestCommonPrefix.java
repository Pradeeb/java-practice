package com.java.leedcode.string;

public class Q14LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs={"flower","flow","flight"};

		System.out.println(solustion(strs));
	}
	
	private static String solustion(String[] strs) {

		//edge case
		if(strs == null || strs.length ==0) {
		return "";
		}
		
		//take a first string as a reference
		String first=strs[0];
		
		for(int i=0 ; first.length() > i ;i++) {
			char c=first.charAt(i);
			
			for(int j=1 ; j<strs.length ;j++) {
				 // If index out of bounds OR mismatch
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return first.substring(0, i);
                }
			}
			
		}

		 return first;
	}

}
