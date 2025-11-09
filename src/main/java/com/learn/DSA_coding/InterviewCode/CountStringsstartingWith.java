package com.learn.DSA_coding.InterviewCode;

import java.util.Arrays;
import java.util.List;

public class CountStringsstartingWith {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("rohan", "mohan", "roshan", "rahul", "suvarna");
        Long count = words.stream().filter(a->a.startsWith("r")).count();
        System.out.println(count);

        // without java 8
        int ncount =0;
        for(String word : words){
            if(word.startsWith("r")){
                ncount ++;
            }
        }

        System.out.println(ncount);
    }
}
