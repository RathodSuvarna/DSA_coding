package com.learn.DSA_coding.InterviewCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2, 5, 5, 7, 8, 5, 9, 9, 0);
        Set<Integer> seen = new HashSet<>();
        num.stream().filter(n ->!seen.add(n)).collect(Collectors.toSet()).forEach(System.out::println);
    }
}
