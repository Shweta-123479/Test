package com.java.in.capgmini;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestEmployee {

    public static void main(String[] args) {

        List<Employee> emp = Arrays.asList(
                new Employee("Vaibhav",1),
                new Employee("Shreesha",2),
                new Employee("Vaibhav",1)

        );

        // print employee with duplicate records

        Set<Employee> duplicates = emp.stream()
                        .collect(Collectors.groupingBy(Employee::getEmpId))
                                .values().stream()
                        .filter(dup -> dup.size()>1)
                                .flatMap(Collection::stream)
                                        .collect(Collectors.toSet());

        System.out.println("Duplicates records of employees -> " +duplicates);

        // count of employees
        long countOfEmployees = emp.stream()
                .count();

        System.out.println("Employee Count Is -> " +countOfEmployees);
    }
}
