package com.java.practice.array.twopointer;

public class Q4ValidPalindrome {

	public static void main(String[] args) {

		String s = "A man, a plan, a canal: Panama";
		// ^ not in
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		// create pointers
		int l = 0, r = s.length() - 1;

		// create loop
		while (l < r) {
			// logic for check
			if (s.charAt(l) != s.charAt(r)) {
				System.out.println(false);
				return;
			}
			// loop condition
			l++;
			r--;
		}

		System.out.println(true);
	}

}
