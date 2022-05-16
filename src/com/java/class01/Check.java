package com.java.class01;

import java.util.Scanner;

// write prime number from 1 to 50
public class Check {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int num=sc.nextInt();
        int count = 0;
        for (int i = 1; i <= 50; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println( num+  " is Prime number");
        } else {
            System.out.println( num +" is not prime");
        }
    }
}
