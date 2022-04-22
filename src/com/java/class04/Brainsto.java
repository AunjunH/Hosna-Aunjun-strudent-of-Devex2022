package com.java.class04;

import java.util.Scanner;

public class Brainsto {
    //print number from user like 2 4 6 8 10 12
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int number = sc.nextInt();
        int i = 1;
        while (i <= number) {
            System.out.println(i * 2);
            i++;
        }
    }
}
