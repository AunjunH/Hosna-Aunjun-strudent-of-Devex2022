package com.java.class15;

import java.util.Scanner;

//vowel and consonant
public class chw2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your character");
        String c=sc.next();
        switch (c){
            case "a":
            case"e":
            case "i":
            case "o":
            case "u":
                System.out.println("Its a vowel");
                      break;
            default:
                System.out.println("Its consonant");
        }


    }
}
