package com.learn.DSA_coding.InterviewCode;

import java.util.*;
import java.util.stream.*;

public class FirstNonRepeatedChar {
    public static <Char> void main(String[] args) {
        String str = "aabbcdeff";

        Character result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        HashMap<Character, Long> collect = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, HashMap::new, Collectors.counting()));


        Character output = null;
        for (Map.Entry<Character, Long> entry : collect.entrySet()){
            if(entry.getValue() == 1){
                output = entry.getKey();
                break;
            }

        }

        System.out.println("First non-repeated character: " + result);
        System.out.println("Occurrence character: " + collect);
        System.out.println("First non-repeating character out : " + output);

    }
}

