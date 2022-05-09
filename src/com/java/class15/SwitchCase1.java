package com.java.class15;

import java.util.Scanner;

// Write a java program to Find Company name from the given product
//   Possible inputs = {gmail, whatsapp, youtube, Skype, Hangouts, outlook}
//   Possible Outputs = {google, facebook, microsoft}
public class SwitchCase1 {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your product name");
        String product = sc.nextLine();


        switch (product ){
            case "gmail":
            case "whatsapp":
            case "youtube":
                System.out.println("its Google Product");
                break;
            case "skype":
            case "messenger":
                System.out.println("its facebook product");
                break;
            case "hangout":
            case"outlook":
                System.out.println("its microsoft product");
                break;
            case "company":
                break;
            default:
                System.out.println("invalid output");
        }


    }

}
