package com.java.CLASS18;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word");
        String palindrome = sc.next();
        String reverse = new StringBuilder().reverse().toString();
        if (palindrome.equalsIgnoreCase(reverse)) {
            System.out.println(palindrome + " is a palindrome");
        } else {
            System.out.println(palindrome + " is not a palindrome");

        }
    }
}
