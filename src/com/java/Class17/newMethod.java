package com.java.Class17;

import java.lang.invoke.SwitchPoint;
import java.util.Locale;
import java.util.Scanner;

public class newMethod {
    static void printline(int length, char c) {

        for (int i = 1; i <= length; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printline(30,'=');
        System.out.println("Enter your first number");
        printline(30,'=');
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();

        printline(30,'*');

        System.out.println("Enter your second number");
        printline(30,'=');
        int b = sc.nextInt();

        printline(30,'=');
        System.out.println("Enter your function add/sub/mul/divide");
        printline(30,'=');
        String choice=sc.next();

        switch (choice.toLowerCase()){

            case "add" :
                System.out.println(a+b);
                break;
            case "sub":
                System.out.println(a-b);
                break;
            case "mul":
                System.out.println(a*b);
                break;
            case "divide":
                System.out.println(a/b);
                break;
            default:
                System.out.println("Enter right question");


        }
    }
}
