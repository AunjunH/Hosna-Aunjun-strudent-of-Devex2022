package com.java.Class17;
// print 1-50 is even or odd
public class Print1_50 {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");

            }

        }
    }
}
