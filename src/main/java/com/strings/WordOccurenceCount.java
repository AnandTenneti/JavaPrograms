package com.strings;

import java.util.HashMap;

public class WordOccurenceCount {
    public static void main(String[] args) {
        String inputStr="Test Automation Java Automation Selenium Automation";
        HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();
        String[] words = inputStr.split(" ");
        for (String word : words) {
            if(wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            }else{
                wordCountMap.put(word, 1);
            }
        }
        System.out.println("Count of characters in the string: "+wordCountMap);
    }
}
