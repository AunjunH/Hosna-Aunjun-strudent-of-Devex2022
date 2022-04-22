package com.java.class03;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your username");
        String exPuser = "admin";
        String user = sc.nextLine();

        System.out.println("Enter your password");
        String exppass = "123";
        String password =sc.nextLine();

        if (user.equals(exPuser) && password.equals(exppass)) {
            System.out.println("log in successful");

        } else {
            System.out.println("log in uncussessful");

        }

    }
}

