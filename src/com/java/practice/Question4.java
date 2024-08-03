package com.java.practice;

public class Question4 {

	public static void main(String[] args) {
		
		Solution4 obj=new Solution4();
			
		System.out.println(obj.reverse_digit(232));

	}

}

class Solution4
{
    public long reverse_digit(long n)
    {
    	long og=n;
    	long rev=0;
    	
    	while( og>0 ) {
    		rev=rev*10 + og%10;
    		
    		og /= 10;
    	}
    	return rev;
    }
}