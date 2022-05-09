package com.java.class11;

import java.util.Scanner;

// write a program to write a pattern like3,6,9,12,15,18
public class Brainstorming2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();
        int i = 1;
        while (i <= num) {
            System.out.println(i * 3);
            i++;
        }
    }
}

