package com.learn.DSA_coding.InterviewCode;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckOddNum {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(4, 3, 7,8, 9, 10, 12, 5);
        num.stream()
                .filter(a ->a%2 !=0)  // to check odd numbers we need to filter.
                .forEach(System.out::println);
    }

}
