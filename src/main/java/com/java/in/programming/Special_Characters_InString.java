package com.java.in.programming;

public class Special_Characters_InString {

    public static void main(String[] args) {
        String str = "Va$%ibhav";

        String original_Str = str;

        String withNoSpecialCharacter="";

        //String withSpecialCharacters="";

        System.out.println("With Special Characters -> ");

        int count =0;

        for (int i=0; i<= str.length()-1; i++) {

            if (!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i)))
            {
                        System.out.println(str.charAt(i) + " ");
                        count++;
            }
            else {
                withNoSpecialCharacter= withNoSpecialCharacter + str.charAt(i);
            }
        }
        System.out.println("___________________________________");
        System.out.println("Count of Special Characters -> " +count);

        System.out.println("String with No special char -> "+withNoSpecialCharacter);

    }
}
