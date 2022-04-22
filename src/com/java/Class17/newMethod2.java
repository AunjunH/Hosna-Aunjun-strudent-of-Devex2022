package com.java.Class17;
// write program to check odd or even from 1 to 50
public class newMethod2 {

    static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (isEven(i) == true) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
    }
}