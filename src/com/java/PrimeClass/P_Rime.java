package com.java.PrimeClass;

import java.util.Scanner;

public class P_Rime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for (int k = 2; k < num; k++) {
            if (num % k == 0) {
                count++;
                break;

            }
            } if (count == 0) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}
