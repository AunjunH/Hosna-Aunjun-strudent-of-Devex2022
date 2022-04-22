package com.java.class11;

import java.util.Scanner;

// write a program to print bellow numbers
// 6 12 18 24 30 36 42 48 54 60
public class BrainStroming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number= sc.nextInt();
        int i=1;
        while (i<=number){
            System.out.println(i*6);
            i++;

        }
    }
}