package com.java.practice.basicMath;

/*Given an integer, check whether it is a palindrome or not.

Note : Strings which read the same backwards as forwards , eg - MADAM, MOM etc.

Example 1:

Input: n = 555
Output: Yes


Example 2:

Input: n = 123
Output: No*/


public class Q10_PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(is_palindrome(555));
	}
	
	public static String is_palindrome(int n)
    {
        int og=n;
        int ans=0;
        while(n>0){
            int last=n%10;
            ans=ans*10+last;
            n/=10;
        }
        if (og == ans) {
        return "Yes";
        }
        return "No";
    }

}
