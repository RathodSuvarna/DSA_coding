package com.learn.DSA_coding.InterviewCode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HightestOccurance {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(2,4,5,6,7,4,1,4,5,3,2,5,6,5,4,3,8,9,7,8,9);

        // 🧠 Group and count each number
        Map<Integer, Long> countMap = num.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        // 🏆 Find number with highest count
        Map.Entry<Integer, Long> max = countMap.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get();

        System.out.println("Highest occurring number: " + max.getKey());
        System.out.println("Frequency: " + max.getValue());
    }
}



