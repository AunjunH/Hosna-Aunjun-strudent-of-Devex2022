package com.java.Class21;

public class PaternTree {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }
                    for (int k = 1; k <= i; k++) {
                        System.out.print(k);
                    }
                    for (int m = i - 1; m >=1; m--) {
                        System.out.print(m);
                    }
                    System.out.println();
                }
            }
        }

