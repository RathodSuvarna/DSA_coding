package com.learn.DSA_coding.InterviewCode;

import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    String dept;
    double salary;

    Employee(String name, String dept, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
}

public class GroupByDept {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Roshan", "IT", 70000),
                new Employee("Suvarna", "HR", 60000),
                new Employee("Mohan", "IT", 80000),
                new Employee("Rahul", "Finance", 50000),
                new Employee("Kiran", "HR", 65000)
        );

        Map<String, Double> avgSalary = employees.stream()
                .collect(Collectors.groupingBy(
                        e -> e.dept,
                        Collectors.averagingDouble(e -> e.salary)
                ));

        System.out.println("Average salary by department: " + avgSalary);
    }
}

