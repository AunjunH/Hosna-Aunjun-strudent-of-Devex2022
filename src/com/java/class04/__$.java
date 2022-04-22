package com.java.class04;

import java.util.Scanner;

//print number from user like 1 4 9 16 25 36
public class __$ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number");
        int number = sc.nextInt();
        int i = 1;
        while (i <= number) {
            System.out.println(i * i);
            i++;

        }
    }
}