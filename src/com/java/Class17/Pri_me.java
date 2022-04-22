package com.java.Class17;

import java.util.Scanner;

public class Pri_me {
    public static void main(String[] args) {
        System.out.println("enternumber up to u want");
        Scanner sc = new Scanner(System.in);
        int upToNumber = sc.nextInt();
        if (upToNumber == 1)
            System.out.println(1);
    }

        static void primeSequence ( int n){
            boolean prime = true;
            for (int currentnumber = 2; currentnumber <= n; currentnumber++) {
                for (int i = 2; i < currentnumber; i++) {
                    if (currentnumber % i == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    System.out.println(currentnumber + " ");
                }
                prime=true;
            }
        }
    }
