package com.java.in.programming;

public class Palindrome_Number {
    public static void main(String[] args) {


        // int num = 121;

        int num1 = 131;
        int palindrome = 0;

        while (num1 > 0)
        {
            palindrome = palindrome * 10 + (num1 % 10);
            num1 = num1 / 10;
        }

        System.out.println("Palindrome Number of "+ " 131 " + " is -> " +palindrome );

    }
}
