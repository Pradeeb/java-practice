package pattern.copy;

public class PalindromeTriangle {

	public static void main(String[] args) {
		
		
//	        1 
//	      2 1 2 
//	    3 2 1 2 3 
//	  4 3 2 1 2 3 4 
//	5 4 3 2 1 2 3 4 5 

		
		 for(int i=0;i<=5;i++) {   //row
			
			for(int j=1;j<=5-i;j++) {  // Column
				
				System.out.print("  ");
			}
			
			//Print Decreasing Number
			
			for(int j=i;j>=1;j--) {
				
				System.out.print(j+ " ");
			}
			
			//Print Increasing Number
			
			for(int j=2;j<=i;j++) {
				
				System.out.print(j+ " ");
			}
			
			System.out.println();
		}

	}

}
