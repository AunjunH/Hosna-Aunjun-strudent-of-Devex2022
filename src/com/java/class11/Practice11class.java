package com.java.class11;

import java.util.Scanner;

//print number like 10 1 9 2 8 3 7 4 6 5
public class Practice11class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int number = sc.nextInt();
        int i = 1;
        int j=11;
        while (i <= number/2) {
            System.out.println(j - i);
            System.out.println(i);
            i++;

        }
    }
}
