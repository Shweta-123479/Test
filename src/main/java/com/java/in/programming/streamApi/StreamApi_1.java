package com.java.in.programming.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamApi_1 {

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(11,12,13,14,15);

        // 1. Divide by 2 or Even numbers
        num.stream().filter(n -> n %2 ==0).sorted().forEach(System.out::println);

        List<Integer> duplicates = Arrays.asList(10,20,20,30,40,40);
        Set<Integer> removeDuplicates = duplicates.stream().collect(Collectors.toCollection(TreeSet::new));

        System.out.println("Removes Duplicates -> "+removeDuplicates);
    }
}
