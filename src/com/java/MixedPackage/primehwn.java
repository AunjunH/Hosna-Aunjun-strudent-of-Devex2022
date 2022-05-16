package com.java.MixedPackage;

import java.util.Scanner;

// check 1-50 prime number
public class primehwn {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("number " + num + " is a prime number");
        } else {
            System.out.println(" number "+num + " is not a prime number");

        }
    }
}
