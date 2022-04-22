package com.java.class01;

import java.util.Scanner;

public class pr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullname= sc.nextLine();
        String[]splitname=fullname.split("");
        String newstr="";

        for (String s :splitname);{
         //   newstr+=splitname.(0 +".");
            System.out.println(newstr);

        }

    }
}
