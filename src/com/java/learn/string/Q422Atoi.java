package com.java.learn.string;

public class Q422Atoi {
	
    public static void main(String[] args) {
        String s = "-123";
        System.out.println(myAtoi(s)); // Output: -123

        System.out.println(myAtoi("  -")); // Output: 0
        System.out.println(myAtoi(" 1231231231311133")); // Output: 2147483647
        System.out.println(myAtoi("-999999999999")); // Output: -2147483648
        System.out.println(myAtoi("  -0012gfg4")); // Output: -12
    }
    
    
    public static int myAtoi(String s) {
        int i = 0, n = s.length(), sign = 1, result = 0;
        int INT_MAX = 2147483647, INT_MIN = -2147483648;

        // 1. Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Check for sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // 3. Convert digits to integer
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // 4. Handle integer overflow
            if (result > (INT_MAX - digit) / 10) { 
                return (sign == 1) ? INT_MAX : INT_MIN;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }


}


/*
 Great question! Let me break it down step by step.
Understanding Integer Overflow in atoi

When converting a string to an integer, we are multiplying the previous result by 10 and adding the new digit. This can cause an integer overflow if the result exceeds Integer.MAX_VALUE (2147483647) or goes below Integer.MIN_VALUE (-2147483648).
The Overflow Check

if (result > (INT_MAX - digit) / 10) { 
    return (sign == 1) ? INT_MAX : INT_MIN;
}

This line checks whether adding the next digit would cause an overflow.
Why (INT_MAX - digit) / 10?

    The variable result holds the current number formed so far.
    We are about to do:
    new result=result×10+digit
    new result=result×10+digit
    Since result * 10 + digit must not exceed INT_MAX, we check:
    result>INT_MAX−digit10
    result>10INT_MAX−digit​ If result is already greater than this threshold, then adding another digit would push it over the maximum limit, causing an overflow.

Example Walkthrough
Example 1: Safe Case (No Overflow)

Input: "214"
Steps:

    '2' → result = 2
    '1' → result = 2 * 10 + 1 = 21
    '4' → result = 21 * 10 + 4 = 214
    ✅ No overflow.

Example 2: Overflow Case

Input: "2147483649"
Steps:

    '2' → result = 2
    '1' → result = 21
    '4' → result = 214
    '7' → result = 2147
    '4' → result = 21474
    '8' → result = 214748
    '3' → result = 2147483
    '6' → result = 21474836
    '4' → result = 214748364
    Next digit is '9'.
        result = 214748364
        digit = 9
        Check:
        214748364>2147483647−910=214748364
        214748364>102147483647−9​=214748364 Since 214748364 == 214748364, adding 9 will exceed INT_MAX!

🔴 Overflow detected, return 2147483647 (INT_MAX).
Example 3: Negative Overflow

Input: "-9999999999"
Steps:

    The number being formed would be -9999999999, which is less than -2147483648 (INT_MIN).
    The same logic applies, and we return -2147483648 (INT_MIN).

Final Thought

This condition:

if (result > (INT_MAX - digit) / 10) { 
    return (sign == 1) ? INT_MAX : INT_MIN;
}

is a guardrail that ensures we never exceed the valid integer range.

🚀 Without this check, your program would produce incorrect results or crash due to integer overflow.

  */