package com.java.practice.array;

import java.util.Arrays;

public class Test {

	//*****************************Print the duplicates****************************
	//*****************************Reverse the array*******************************
	//*****************************print even the array****************************
	//*****************************Find the big number*****************************
	//*****************************Find the small number***************************
	//*****************************Array sort***************************
    //move zero to last
	
	public static void main(String[] args) {
		
		int[] num= {3,3,0,5,6,0,8,8};
		
		findTheDuplicate(num);
		System.out.println( );
		
		reverseArray(num);
		System.out.println( );
		
		printEvenArray(num);
		System.out.println( );
		
		printOddArray(num);
		System.out.println( );
		
		findBigNumber(num);
		System.out.println( );

		
		findSmallNumber(num);
		System.out.println( );
		
		sortArray(num);
		System.out.println( );
		
		 moveZeros(num);
		 System.out.println( );
		 System.out.println(Arrays.toString(num));
	}


	//move zero to last
	private static void moveZeros(int[] arr) {

		 int index=0;
		 for(int num:arr) {
			 if(num!=0) {
				 arr[index++]=num;
			 }
		 }
		 while(index<arr.length) {
			 arr[index++]=0;
		 }
	 
		
	}



	//Print the duplicates
	private static void findTheDuplicate(int[] num) {
		
		for(int i = 0 ; i < num.length ; i++) {
			for(int j = i+1 ; j < num.length ; j++) {
				
				if(num[i] == num[j]) {
					System.out.print(num[i]+" ");
				}
			}
		}
		
	}
	
    //Reverse the array
	private static void reverseArray(int[] num) {
	
		for(int i=num.length-1 ; i>0 ; i-- ) {
			System.out.print(num[i]+" ");
		}
		
	}
	

	//print even the array
	private static void printEvenArray(int[] num) {

		for(int i=0 ; i<num.length ; i++ ) {
			System.out.print(num[i]+" ");
			i++;
		}
				
	}
	
	//print Odd the array
	private static void printOddArray(int[] num) {

			for(int i=1 ; i<num.length ; i++ ) {
				System.out.print(num[i]+" ");
				i++;
			}
					
		}
	
    //Find the big number
	private static void findBigNumber(int[] num) {
		int big=num[0];
		for(int i = 0 ; i < num.length ; i++) {
			if(big<num[i]) {
				big=num[i];
			}
		}
		System.out.print("Big Number "+big);
		
	}
	
	//Find the small number
		private static void findSmallNumber(int[] num) {
			int small=num[0];
			for(int i = 0 ; i < num.length ; i++) {
				if(small>num[i]) {
					small=num[i];
				}
			}
			System.out.print("small Number "+small);
			
		}



		private static void sortArray(int[] num) {
		
			for(int i = 0 ; i < num.length ; i++) {
				for(int j = 0 ; j < num.length-1-i ; j++) {
					if(num[j] > num[j+1]) {
						int temp=num[j];
						num[j] = num[j+1];
						num[j+1]=temp;
					}
				}
			}
			
			for(int number:num) System.out.print(number);
			
		}

}
