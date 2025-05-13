package com.java.in.programming;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Character_Occurance_String {

    public static void main(String[] args) {

        String s1="AAaaBBbbCCccdef";
        System.out.println("Character occurance in string");

//        Map<String,Long> s2= Arrays.stream(s1.split(""))
//                .collect(Collectors.groupingBy(s -> s, TreeMap::new, Collectors.counting()));

        Map<String,Long> result = Arrays.stream(s1.split(""))
                        .collect(Collectors.groupingBy(m -> m, TreeMap::new, Collectors.counting() ));

        System.out.println(result);





    }
}
