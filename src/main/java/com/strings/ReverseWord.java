package com.strings;

import java.util.List;

/**
 * This program is for reversing each word of a string
 */
public class ReverseWord {
    public static void main(String[] args) {
        String inputString = "Java is one of the good programming languages";
        String[] words = inputString.split(" ");
        int count = words.length;
        String reversedString = "";
       for(int i=0;i<count;i++){
           String word=words[i];
           String nstr="";
              for(int j=0;j< word.length();j++){
                nstr=word.charAt(j)+nstr;
              }
              reversedString= reversedString+nstr+" ";
        }
        System.out.println("The input string is: "+inputString);
        System.out.println("The reversed string is: "+reversedString);
    }
}
