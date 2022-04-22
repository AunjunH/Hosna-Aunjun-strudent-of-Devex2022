package com.java.PrimeClass;

import java.util.Scanner;

public class PrimeOrNOtprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " not a prime number");
        }
    }
}
