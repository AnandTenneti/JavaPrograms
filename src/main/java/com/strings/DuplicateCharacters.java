package com.strings;

import java.util.HashMap;
import java.util.Set;

/**
 * This program is to find the duplicate characters in a string
 */

public class DuplicateCharacters {
    public static void main(String[] args) {
        String inputString = "Learn Java Programming";
        HashMap<Character,Integer> charCountMap = new HashMap<>();
        char[] strArray = inputString.toCharArray();
        for (char c : strArray) {
            if(c!=' ') {
                if (charCountMap.containsKey(c)) {
                    charCountMap.put(c, charCountMap.get(c) + 1);
                } else {
                    charCountMap.put(c, 1);
                }
            }
        }
        Set<Character> charsInString = charCountMap.keySet();
        for (Character ch : charsInString) {
            if(charCountMap.get(ch)>1){
                System.out.println(ch+" is "+charCountMap.get(ch)+" times");
            }
        }
    }
}
