package com.java.class15;
 // Write a program to take number from user and check if it's divisible by 5 or 3


import java.util.Scanner;

public class CHw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your number");
        int num = sc.nextInt();
        if (num % 5 == 0 || num % 3 == 0) {
            System.out.println(num + " is divisible by 5 and 3");
        } else {
            System.out.println(num + " number is not divisible by 5 and 3");

        }
    }
}
