package com.learn.DSA_coding;

import java.util.Arrays;
import java.util.List;

public class CountStringsstartingWith {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("rohan", "mohan", "roshan", "rahul", "suvarna");
        Long count = words.stream().filter(a->a.startsWith("s")).count();
        System.out.println(count);
    }
}
