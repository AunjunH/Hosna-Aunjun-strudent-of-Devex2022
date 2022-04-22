package com.java.MixedPackage;

import java.util.Scanner;

// write a program to check days of a month from user.
public class Months$days {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       String month=sc.nextLine();

        switch (month){
            case "1":
                System.out.println("january");
                break;

            case "2":
                System.out.println("February");
                break;
            case "3":
                System.out.println("March");
                break;
        }
    }
}
