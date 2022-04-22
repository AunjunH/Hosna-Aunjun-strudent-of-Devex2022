package com.java.Projectworkhomework;

import java.util.Scanner;

//Find divisor of given number (Input - 6, output will be 1 2 3 6)
//Find result of given series 1 + 2 – 3+ 4 + 5 – 6 + 7 + 8 – 9 +10
public class $homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}