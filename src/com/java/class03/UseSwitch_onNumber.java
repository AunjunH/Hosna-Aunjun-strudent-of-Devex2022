package com.java.class03;

import java.util.Scanner;

public class UseSwitch_onNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number From 1 to 9");
        int num = sc.nextInt();
        switch (num){
            case 0 :
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("Seven");
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Enter the right number");
        }


    }
}
