package com.java.Class21;
//    1
//   121
//  12321
// 1234321
//123454321
public class Patternhw2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10- i; j++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print(l);
            }
            for (int k = i - 1; k>=1; k--) {

                System.out.print(k);
            }
            System.out.println();
        }

    }
}


