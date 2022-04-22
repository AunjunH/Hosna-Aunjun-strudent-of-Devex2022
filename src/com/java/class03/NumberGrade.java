package com.java.class03;

import java.util.Scanner;

public class NumberGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int number = sc.nextInt();

        if (number > 90 && number > 100) {
            System.out.println("Grade A");
        } else if (number > 80 && number < 90) {
            System.out.println("Grade B");
        } else if (number > 70 && number < 80) {
            System.out.println("Grade C");
        } else if (number > 60 && number < 70) {
            System.out.println("Grade d");
        } else if (number > 50 && number < 60) {
            System.out.println("Grade E");
        } else if (number > 0 && number < 50) {
            System.out.println("Fail");
        }
    }
}

