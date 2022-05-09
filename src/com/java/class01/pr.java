package com.java.class01;

import java.util.Scanner;

public class pr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullname = sc.nextLine();
        String[] parts = fullname.split(" ");
        String firstname = parts[0];
        String middlename = parts[1];
        String lastname = parts[2];

        for (int i = 0; i < fullname.length(); i++) ;
        {

            System.out.println(parts[0].charAt(0) + "." + parts[1].charAt(0) + "." + parts[2].charAt(0) + ".");

        }
    }
}