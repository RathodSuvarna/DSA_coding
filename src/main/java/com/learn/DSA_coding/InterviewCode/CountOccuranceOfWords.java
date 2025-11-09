package com.learn.DSA_coding.InterviewCode;

import java.util.Arrays;
import java.util.LinkedHashMap;
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

        System.out.println("without java 8");
        // without using java 8
        Map<String, Integer> wordCount = new LinkedHashMap<>();  //use LinkedHashMap to preserve insertion order
        for(String word : names){
            wordCount.put(word, wordCount.containsKey(word) ? wordCount.get(word) +1 : 1);
        }

        for(Map.Entry<String, Integer> newMap : wordCount.entrySet()){
            System.out.println(newMap.getKey() + " : " + newMap.getValue());
        }
    }

}
