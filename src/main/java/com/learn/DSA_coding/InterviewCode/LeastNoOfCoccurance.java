package com.learn.DSA_coding.InterviewCode;

import java.sql.SQLOutput;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LeastNoOfCoccurance {
    public static void main(String[] args) {
        String word = "aaddbaaadcc";
      //1.  without Java 8

        LinkedHashMap<Character, Integer> countMap = new LinkedHashMap<>(); // Create map to store charecter and occurance

        for(char ch : word.toCharArray()){  //Conert string to char Array and itterate
            countMap.put(ch, countMap.containsKey(ch)? countMap.get(ch)+1: 1);
        }

        int minCount = Integer.MAX_VALUE;  //Find the minimum occurrence value
        for(int num : countMap.values()){
            if(num < minCount)
                minCount = num;
        }

        for(Map.Entry<Character, Integer> result : countMap.entrySet() ){  // Print characters having that minimum occurrence
            if(result.getValue() == minCount){
                System.out.println(" charecter " + result.getKey() + " : " + "occurance" + result.getValue() );
            }
        }

        // 2. using java 8
        Map<Character, Long>  newMap = word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map.Entry<Character, Long> minOccrance = newMap.entrySet()
                .stream()
                .min(Map.Entry.comparingByValue())
                .get();

        System.out.println("Character" + minOccrance.getKey());
        System.out.println("MinOccurance" + minOccrance.getValue());

    }

}
