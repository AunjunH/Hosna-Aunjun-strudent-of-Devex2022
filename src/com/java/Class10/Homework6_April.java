package com.java.Class10;

public class Homework6_April {
    public static void main(String[] args) {
        int i = 3;
        while (i <= 50) {
            if (i % 3 != 0 && i % 7 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
