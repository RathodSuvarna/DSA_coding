package com.learn.DSA_coding.InterviewCode;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacterOccurrence {
    public static void main(String[] args) {
        String str = "programming";

        Map<Character, Long> charCount = str.chars()                // IntStream of characters
                .mapToObj(ch -> (char) ch)                          // Convert int to Character
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));// Count each char

        System.out.println(charCount);
    }
}



