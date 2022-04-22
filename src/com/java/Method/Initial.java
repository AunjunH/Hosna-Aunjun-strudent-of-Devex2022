package com.java.Method;

import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your full name");
        String fullname= sc.nextLine();
        String parts[]=fullname.split(" ");
        String firstname= parts[0];
        String middlename= parts[1];
        String lastname = parts[2];
      //  System.out.println(parts[0].charAt(0)+"."+parts[1].charAt(0)+"."+parts[2].charAt(0)+".");
    }
}
