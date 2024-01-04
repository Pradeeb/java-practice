package com.java.practice;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class practice {
	
	  public static void main(String[] args) {
		  
	   
		  
	   System.out.println(printDivisors(10));
		   

	  }

	    public static List< Integer > printDivisors(int n) {
	    	
	    	List<Integer> ans=new ArrayList<>();
	    	
	    	for (int a=1 ; a <= n ; a++) {
	    		
	    		if(n % a == 0) {
		    		ans.add(a);
	    		}
	    	}
	    	Collections.sort(ans);
			return ans;
	    }
}
