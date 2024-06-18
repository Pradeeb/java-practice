package com.java.practice;

public class Qustion1 {

	//Find even or odd
	
	public static void main(String[] args) {
		
		Solution ob=new Solution();
		
		System.out.println(ob.oddEven(0));

	}

}

class Solution{
  static String oddEven(int N){
      
      String out=null;
      
      if(N%2 != 0){
        out="odd"; 
      }else{
        out="even"; 
      }
      return out;
  }
}
