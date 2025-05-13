package com.java.in.programming;

public class Prime_Numbers {

    public static void main(String[] args) {

        int num1 = 5;
        int count=0;

        for(int i=1; i<= num1; i++)
        {
            if(num1 % i == 0)
            {
                count++;

            }

        }
        if(count==2)
        {
            System.out.print(num1 +" Is Prime number");

        }
        else {
            System.out.print(num1 +" Is not Prime number");
        }
    }
}
