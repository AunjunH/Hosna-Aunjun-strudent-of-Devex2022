package com.java.MixedPackage;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palindrome = sc.next();
        String reversed = new StringBuilder(palindrome).reverse().toString();
        if (palindrome.equalsIgnoreCase(reversed)) {
            System.out.println(palindrome + "  is a palindrome");
        } else {
            System.out.println(palindrome + " is not a palindrome");
        }
    }
}