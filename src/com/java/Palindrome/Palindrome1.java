package com.java.Palindrome;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.substring(i, i + 1);
        }
       if (reversed.equals(str)) {
            System.out.println(str + "is a palindrome");
        } else {
            System.out.println(str + "is not a palindrome");
        }
    }
}
