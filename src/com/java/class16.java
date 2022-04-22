package com.java;

import java.util.Scanner;

public class class16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = sc.nextLine();
        char[] chars = word.toCharArray();
        int len = word.length();
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
