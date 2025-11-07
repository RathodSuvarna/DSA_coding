package com.learn.DSA_coding.InterviewCode;

import java.util.*;
import java.util.stream.*;

public class FilterMapGroup {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("rohan", "mohan", "sohan", "rahul", "suvarna");

        List<String> result = names.stream()
                .filter(n -> n.startsWith("r"))        // Filter
                .map(String::toUpperCase)              // Map
                .sorted()                              // Sort
                .collect(Collectors.toList());         // Collect

        System.out.println(result);
    }
}

