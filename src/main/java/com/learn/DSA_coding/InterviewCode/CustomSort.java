package com.learn.DSA_coding.InterviewCode;

import java.util.*;

public class CustomSort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Roshan", "Suvarna", "Mohan", "Rahul");

        // Sort by length (ascending)
       // names.sort((a, b) -> Integer.compare(a.length(), b.length()));
        names.sort((a, b) ->Integer.compare(a.length(), b.length()));

        System.out.println("Sorted by length: " + names);
    }
}

