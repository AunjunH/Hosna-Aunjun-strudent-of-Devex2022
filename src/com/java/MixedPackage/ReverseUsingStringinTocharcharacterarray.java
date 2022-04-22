package com.java.MixedPackage;

public class ReverseUsingStringinTocharcharacterarray {
    public static void main(String[] args) {
        String word = "Hosna";
        char[] chars = word.toCharArray();
        int len = word.length();
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
