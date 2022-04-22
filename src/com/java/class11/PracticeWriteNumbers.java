package com.java.class11;

import java.util.Scanner;

// Write numbers like 11 2 10 3 9 4 8 5 7 6 6 7
public class PracticeWriteNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();

        int i = 2;
        int j =13;
        for(i=1;i<=number/2;){
            i++;
            System.out.println(j-i);
            System.out.println(i);


        }
    }
}
