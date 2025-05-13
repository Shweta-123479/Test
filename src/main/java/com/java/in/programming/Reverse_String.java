package com.java.in.programming;

public class Reverse_String {

    public static void main(String[] args) {
        String s="Vaibhav";

        int str_Length =s.length() - 1 ;
        String rev="";

        for(int i=0; i<=str_Length; i++)
        {
            rev = s.charAt(i) + rev;

        }
        System.out.println("Rev String is -> " +rev);
    }
}
