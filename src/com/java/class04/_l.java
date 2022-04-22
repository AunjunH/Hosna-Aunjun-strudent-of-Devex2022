package com.java.class04;
//print user taking number like 5 10 15 20
import java.util.Scanner;

public class _l {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter your number");
        int number = sc.nextInt();
        int i=1;
        while (i<=number){
            System.out.println(i*5);
            i++;
        }
    }
}
