package com.java.in.programming.streamApi;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

class Employee
{
    int eid;
    String ename;
    Double esalary;

    public Employee(int eid, String ename, Double esalary)
    {
        super();
        this.eid = eid;
        this.ename=ename;
        this.esalary=esalary;

    }
    public int getEid()
    {
        return eid;
    }

    public String getEname()
    {
        return ename;
    }

    public Double getEsalary()
    {
        return esalary;
    }

    public String toString()
    {
        return "Employee[ eid ="+eid+", ename="+ename+", esalary="+esalary+"]";
    }


}

public class Employee_Stream_Example {

    public static void main(String[] args) {

        List<Employee> list1 = Arrays.asList(
                new Employee(1,"Vaibhav",5500.00),
                new Employee(2,"Shreesha",10500.00),
                new Employee(3,"Shweta",15500.00)
        );

        // Use Case 1 -> find highest salary
        Optional<Employee> highestSalary = list1.stream().max(Comparator.comparingDouble(e -> e.getEsalary()));

        System.out.println("Max salary of Employee " +highestSalary);

        //Use Case 2 -> get All names of Employee
        list1.stream().map(e -> e.getEname()).forEach(System.out::println);

        // Use Case 3 -> Filter employees with salary > 5000

        System.out.println("Employee with salary > 10000");

        list1.stream().filter(sal -> sal.getEsalary() > 10000).forEach(System.out::println);

        // Use Case 4 -> Sort employees by salary ascending
        System.out.println("Sort employees by salary ascending");

        list1.stream().sorted(Comparator.comparingDouble(e -> e.getEsalary()) ).collect(Collectors.toList()).forEach(System.out::println);

        // Use case 5-> group employees by salary

        Map<Double , List<Employee>> groupBySlaary =list1.stream()
                .collect(Collectors.groupingBy(e -> e.getEsalary()));
        System.out.println("Group By Salary ->" +groupBySlaary);

//        // Use Case -> Min, Max,Count , Sum & Avg of salaries
//
//        Map<String, DoubleSummaryStatistics> metrics = list1.stream().
//                collect(Collectors.groupingBy(Employee::getEname, Collectors.summarizingDouble(Employee::getEsalary)));
//
//        System.out.println("Metrices -> " +metrics);

        //min salary

          Optional<Employee> minSlar = list1.stream().min(Comparator.comparingDouble(e -> e.getEsalary()));
        System.out.println("Min salary -> " +minSlar);





    }


}
