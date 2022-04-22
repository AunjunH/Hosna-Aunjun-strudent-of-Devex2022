package com.java.Class10;

public class __ {
// write a program to print below numbers

// 6 12 18 24 30 36 42 48 54 60

    public static void main(String[] args) {
        int i = 6;
        while (i <= 60) {
            if (i % 6 == 0) {
                System.out.println(i);
            }i++;
        }
    }
}