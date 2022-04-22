package com.java.class11;

import java.util.Scanner;

//Write a number from user 14 10 13 11 12 12 11 13
public class PracticeOdd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your number");
        int number= sc.nextInt();
        int i=1;
        int j=15;
        for(i=1;i<=number/2;i++){
            System.out.println(j-i);
            System.out.println(i);
        }
    }
}
