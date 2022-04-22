package com.java.Method;

import java.util.Scanner;

// write a program 2nd half of string
public class Second_haf_of_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your word");
        String str = sc.nextLine();
        System.out.println(str.substring(str.length()/2));
        }
    }
