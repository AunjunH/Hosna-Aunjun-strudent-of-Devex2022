package com.java.Class21;

public class StarPatarn {
    public static void main(String[] args) {
        //maintain row
        for (int i = 1; i <= 5; i++) {

            //maintain space

            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // maintain disit
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // maintain reversrse
            for (int l = i - 1; l >= 1; l--) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
