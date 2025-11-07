package com.learn.DSA_coding.InterviewCode;


import java.util.HashMap;

public class LeastNoOfCoccurance {
    public static void main(String[] args) {
        String word = "aaddbaaadcc";
        leastNoOCuurance(word);
    }

    private static void leastNoOCuurance(String input){
     HashMap<Character, Integer> map = new HashMap<>();
     int count =1;
     for(int i=1; i<input.length(); i++){
         if(input.charAt(i) == input.charAt(i-1)){
             count ++;
         }else{
             char ch = input.charAt(i-1);
             map.put(ch, Math.min(map.getOrDefault(ch, Integer.MAX_VALUE), count));
             count = 1;
         }
     }
     char lastCh = input.charAt(input.length()-1);
     map.put(lastCh, Math.min(map.getOrDefault(lastCh, Integer.MAX_VALUE), count));
     map.forEach((Key, Value) -> System.out.println(Key +":" + Value));
    }

}
