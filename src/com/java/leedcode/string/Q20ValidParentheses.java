package com.java.leedcode.string;

import java.util.Stack;

public class Q20ValidParentheses {

	public static void main(String[] args) {
		String  s = "([))";
		System.out.println(isValid(s));
	}

	public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Push opening brackets
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } 
            // Handle closing brackets
            else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if (ch == ')' && top != '(') return false;
                if (ch == ']' && top != '[') return false;
                if (ch == '}' && top != '{') return false;
            }
        }

        return stack.isEmpty();
    }
}
