package com.java.class13;
//take number from user and multiply
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();
        int num=1;
        for (int i =1; i<=number;i++){
            int result = (number*i);
        }
        System.out.println(number);
    }
}
