package com.java.Class17;
// write a program to write number  29 to check prime
public class PrimeNum {
    public static void main(String[] args) {
        int num = 3;
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " not prime");
        }
    }
}
