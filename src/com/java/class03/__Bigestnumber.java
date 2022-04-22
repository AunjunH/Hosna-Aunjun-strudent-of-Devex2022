package com.java.class03;

import java.util.Scanner;

public class __Bigestnumber {
    // take 3 numbers from user and find out the biggest number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();


        if (number1 > number2 && number1 > number3) {
            System.out.println(number1+ "  is biggest ");


        } else if (number2 > number3) {
            System.out.println(number2 +" is biggest");
        } else {
            System.out.println( number3+" biggest");
        }
    }
}
