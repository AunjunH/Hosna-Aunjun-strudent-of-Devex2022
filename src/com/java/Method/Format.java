package com.java.Method;

public class Format {
    public static void main(String[] args) {
        String str1="welcome %s";
        String str2="welcome to %s";
        System.out.println(String.format(str1, "hosna"));
        System.out.println(String.format(str2,"Mizan"));
    }
}
