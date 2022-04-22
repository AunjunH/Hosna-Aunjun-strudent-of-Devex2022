package com.java;

import java.util.Scanner;

// find and count number
public class Exercise {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your word");
        String word=sc.nextLine();
        String[]parts=word.split("  ");
       // System.out.println(parts.length());
    }
}