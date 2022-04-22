package com.java.Class17;
// write prime number from 1-50
public class CheckPrime_Numbers1to50 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i < 50; i++) {
            if (50 % i == 0) {
                count++;
                break;
            }
            if (count == 0) {
                System.out.println(i + " is prime");
            } else {
                System.out.println(i + " not prime");

            }
        }
    }
}
