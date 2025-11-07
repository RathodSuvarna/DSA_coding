package com.learn.DSA_coding.InterviewCode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccuranceOfWords {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("rahul", "Suvarna", "Roshan", "Mohan", "Suvarna", "Suvarna");
        Map<String, Long> words = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        words.forEach((k, v) ->System.out.println(k +":"+ v));

       /* String names = "rahul, Suvarna, Roshan, Mohan, Suvarna, Suvarna";
        Map<String, Long> words = Arrays.stream(names.replaceAll(",", "").toLowerCase().split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        words.forEach((k, v) -> System.out.println(k +":"+ v));*/
    }


}
