package com.java.learn.starpatterns;

public class StarPatterns {

	public static void main(String[] args) {
		
		int n=5;

		/*
		  
		  Pattern 1
		 *
		 **
		 ***
		 ****
		 *****
		 ******
		 
		 */
		System.out.println("Pattern 1");
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		/*
		 
		 Pattern 2
		 ******
		 *****
		 ****
		 ***
		 **
		 *
		 
		 */
		System.out.println("");
		System.out.println("Pattern 2");
		for (int i = n; i >= 0; i--) {
			for (int j = i; j >= 0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}

		/*
		 
		 Pattern 2
******
*    *
*    *
*    *
*    *
******
		 
		 */
		System.out.println("");
		System.out.println("Pattern 3");
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || i == n || j == 0 || j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

		/* Pattern 4 */
		
//	     *
//	    ***
//	   *****
//	  *******
//	 *********
		
		System.out.println("");
		System.out.println("Pattern 4");
		
		for(int i=1 ; i<=n ;i++)  {
			for(int j=i; j<n ;j++ ) {
				System.out.print(" ");
			}
			
			for(int j=1; j<= (2 * i -1) ;j++ ) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		System.out.println("");
		System.out.println("Pattern 5 dimand");
		
		 for (int i = 1; i <= n; i++) {
		        for (int j = i; j < n; j++) {
		            System.out.print(" ");
		        }
		        for (int j = 1; j <= (2 * i - 1); j++) {
		            System.out.print("*");
		        }
		        System.out.println();
		    }

		    // Lower half
		    for (int i = n - 1; i >= 1; i--) {
		        for (int j = n; j > i; j--) {
		            System.out.print(" ");
		        }
		        for (int j = 1; j <= (2 * i - 1); j++) {
		            System.out.print("*");
		        }
		        System.out.println();
		    }
	}

}
