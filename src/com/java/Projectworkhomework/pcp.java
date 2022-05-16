package com.java.Projectworkhomework;

import java.util.Scanner;

// check prime or not from 1 to 50
public class pcp {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
        System.out.println(" enter your number");
    int num = sc.nextInt();

    for(int i=1;i<=50;i++){
        if(isPrime(i)==true){
            System.out.println(i);
        }
    }

}


public static boolean isPrime(int num){
        int count = 0;


        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }
}
