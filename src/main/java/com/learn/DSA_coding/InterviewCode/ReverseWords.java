package com.learn.DSA_coding.InterviewCode;

import java.util.*;
import java.util.stream.*;

public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "Java 8 Stream API example";

        String reversed = Arrays.stream(sentence.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println(reversed);
    }
}

