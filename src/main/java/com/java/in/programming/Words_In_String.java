package com.java.in.programming;

public class Words_In_String {

    public static void main(String[] args) {
        String word = "Lets Do Code";
        int count = 1;

        for (int i=0; i<= word.length()-1; i++)
        {
            if( (word.charAt(i) == ' ') && (word.charAt(i+1) != ' '))
            {
               count++;
            }
        }
        if(count>0)
        {
            System.out.println("No of Words in String -> " +count);
        }


    }
}
