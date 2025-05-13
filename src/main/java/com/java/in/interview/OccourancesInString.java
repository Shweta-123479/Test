package com.java.in.interview;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class OccourancesInString {

    public static void main(String[] args) {

        String str = "Java is a programming language, and Java is also platform-independent because Java runs on any operating system with the JVM";


        TreeMap<String, Long> list = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy( s -> s, TreeMap::new, Collectors.counting()));

        System.out.println("");

    }
}
