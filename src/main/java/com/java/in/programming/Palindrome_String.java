package com.java.in.programming;

public class Palindrome_String {

    public static void main(String[] args) {

        String s1 = "DAD";
        int str_Length = s1.length()-1;
        int count = 0;
        String palindrome ="";
        for (int i=0; i<= str_Length; i++)
        {
           palindrome = s1.charAt(i) + palindrome;
           count++;
        }
        if(count> 0)
        {
            System.out.println("Palindrome String is -> " +palindrome);

        }
        else
        {
            System.out.println("String is not palindrome");
        }
    }
}
