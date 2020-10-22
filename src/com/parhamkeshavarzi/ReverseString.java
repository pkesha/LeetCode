package com.parhamkeshavarzi;

/*
Write a function that reverses a string. T
he input string is given as an array of characters char[].

Do not allocate extra space for another array,
you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.

Example 1:
Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:
Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */

public class ReverseString {
    public static void main(String[] args) {
        char[] string = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(reverseString(string));
    }

    public static char[] reverseString(char[] s) {
        int charLength = s.length - 1;
        char a, b;
        for(int i = 0; i <= s.length/2; i++){
            a = s[i];
            b = s[charLength - i];
            s[i] = b;
            s[charLength - i] = a;
        }

        return s;
    }
}
