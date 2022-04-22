package com.java.Class17;
// write a program 1-50 prime number using method.
public class PrimeMethod {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (isprime(i) == true) {
                System.out.println(i);
            }
        }
    }

    static boolean isprime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;

        }
    }
}
