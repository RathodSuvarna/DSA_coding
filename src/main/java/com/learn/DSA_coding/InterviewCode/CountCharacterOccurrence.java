package com.learn.DSA_coding.InterviewCode;
// CountCharacterOccurrence of Sting
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class CountCharacterOccurrence {
    public static void main(String[] args) {
        String str = "programming";
        // with java 8
        Map<Character, Long> charCount = str.chars()                // IntStream of characters
                .mapToObj(ch -> (char) ch)                          // Convert int to Character
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));// Count each char

        System.out.println(charCount);

        // without java 8
        LinkedHashMap<Character, Integer> countMap = new LinkedHashMap<>();

        // Step 2: Convert string to char array and iterate
        for(char ch : str.toCharArray()) {
            // Step 3: Put character and count in map
            countMap.put(ch, countMap.containsKey(ch) ? countMap.get(ch) + 1 : 1);
        }

        // Step 4: Print characters and their occurrences (no streams)
        for(Map.Entry<Character, Integer> finalMap : countMap.entrySet()){
            System.out.println("character "  + finalMap.getKey() + " : " + "occurance "  + finalMap.getValue());
        }

    }
}



