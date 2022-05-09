package com.java.Class17;

import java.util.Scanner;

// find minimum number from Array 1 to 5
public class minNUmFromArray {
    public static void main(String[] args) {

        int num[] = new int[5]; // take the array but not initialized yet!



        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter your 5 numbers");
        // now taking input from user and initialized.

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();

        }
        int min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (min > num[i]) {
                min = num[i];
            }


        }
        System.out.println("then min is " + min);
    }
}
