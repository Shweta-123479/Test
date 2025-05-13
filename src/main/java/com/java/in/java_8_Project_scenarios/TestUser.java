package com.java.in.java_8_Project_scenarios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestUser {

    public static void main(String[] args) {

        List<User> user1 = Arrays.asList(
                new User(1,"Vaibhav",true),
                new User(2,"Shreesha",false),
                new User(3,"Shweta",true),
                new User(4,"Sarita",false),
                new User(5,"Balubhau",true)
        );

        List<String> active =user1.stream().filter(s -> s.getIsActive())
                .map(User::getNames).collect(Collectors.toList());

        System.out.println("Names of Users having status active -> " +active);

        List<String> inActive =user1.stream().filter(s -> !s.getIsActive())
                .map(User::getNames).collect(Collectors.toList());

        System.out.println("Names of Users having status inActive -> " +inActive);
    }
}
