package com.java.Method;

import java.util.Scanner;

public class Scanner_initials {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullname= sc.nextLine();
        String []words=fullname.split(" ");
        String firstname= words[0];
        String middlename=words[1];
        String lastname=words[2];
        System.out.println(words[0].charAt(0)+"."+words[1].charAt(0)+"."+words[2].charAt(0)+".");
    }
}
