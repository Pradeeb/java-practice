package com.java.practice.array;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
    	
    	
    	int[] num= {3,3,4,5,6,2,8,8};
    	
    	int[] num1= new int[10];
    	
    	//*****************************copy of array*******************************
    	
    	//copy of array method 1
    	for(int i=0 ; i<num.length ; i++) {
    		num1[i]=num[i];
    	}
    	for( int out :num1) System.out.print(out);
    	
    	 System.out.println();
    	//copy of array method 2
    	int[] num2=Arrays.copyOf(num, 8);
    	for( int out :num2) System.out.print(out);
    	
    	System.out.println();
    	//copy of array method 3
    	int[] num3= new int[10];
    	System.arraycopy(num2,2,num3,2,6);
    	
    	for( int out :num3) System.out.print(out);
    	System.out.println();
    	//*****************************Print the duplicates*******************************
    	
    	for(int i=0; i<num.length ;i++) {
    		for(int j=i+1; j<num.length ;j++) {
    			
    			if(num[i]==num[j]) {
    				System.out.print(num[i]+", ");
    			}
    			
    		}
    	}
    	
    	System.out.println();
    	//*****************************Reverse the array*******************************
    	for(int i=num.length-1; i>=0 ;i--) {
    		System.out.print(num[i]);
    	}
    	
    	System.out.println();
    	//*****************************print even the array*******************************
    	for(int i=1; i<num.length ;i++) {
    		System.out.print(num[i]);
    		i++;
    	}
    	System.out.println();
    	//*****************************print even the array*******************************
    	for(int i=0; i<num.length ;i++) {
    		System.out.print(num[i]);
    		i++;
    	}
    	
    	System.out.println();
    	//*****************************Find the big number*******************************
    	
    	int bignNumber=num[0];
    	
    	for(int i=0; i<num.length ;i++) {
    		
    		if(num[i]>bignNumber) {
    			bignNumber=num[i];
    		}

    	}
    	System.out.print("Find Bing Nyumber :"+bignNumber);
    	System.out.println();
    	//*****************************Find the small number*******************************
    	
    	int smallNumber=num[0];
    	
    	for(int i=0; i<num.length ;i++) {
    		
    		if(num[i]<bignNumber) {
    			bignNumber=num[i];
    		}

    	}
    	System.out.print("Find Bing Nyumber :"+bignNumber);
    	
    	
    }
}
