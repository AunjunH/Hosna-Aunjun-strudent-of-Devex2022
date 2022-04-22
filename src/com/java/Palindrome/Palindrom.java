package com.java.Palindrome;

import java.util.Locale;
import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type any word to check if it is a palindrome");
        String word = sc.nextLine().toLowerCase();
        String inverted = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            inverted = inverted +  word.substring(i, i + 1);
        }
        System.out.println("inverted word " +  inverted);
        if (word.equals(inverted)) {
            System.out.println(word + "  is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}