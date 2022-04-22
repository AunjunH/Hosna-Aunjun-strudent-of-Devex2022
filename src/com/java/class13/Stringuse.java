package com.java.class13;

import java.util.Scanner;

public class Stringuse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "apple";
        String str2 = "apple";
        String str3 = sc.nextLine();

        if (str == str2) {
            System.out.println(true);
        } else {
            System.out.println(false);
            if (str2 == str3) {
                System.out.println(true);
            } else {
                System.out.println(false);
                if (str3.equals(str)) {
                    System.out.println(true);
                } else {
                    System.out.println(false);
                }
            }
        }
    }
}