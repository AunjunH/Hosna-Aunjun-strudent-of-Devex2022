package com.java.Method;

public class Split_method_usingForloops {
    public static void main(String[] args) {
        String str1 = "welcome to java academy";
        String[] words = str1.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
