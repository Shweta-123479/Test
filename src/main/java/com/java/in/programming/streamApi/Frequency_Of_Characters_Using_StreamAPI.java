package com.java.in.programming.streamApi;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Frequency_Of_Characters_Using_StreamAPI {

    public static void main(String[] args) {

        String str = "TellMeSomething";

        Map<String,Long> characters = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(s -> s, TreeMap::new , Collectors.counting()));

        System.out.println(characters);
    }
}
