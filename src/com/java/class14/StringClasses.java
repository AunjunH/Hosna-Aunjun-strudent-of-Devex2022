package com.java.class14;

import java.util.Locale;

public class StringClasses {
    public static void main(String[] args) {
        String st1= "Hello world";
        String  str2= "hello world";
        String str3 = "Hello world welcome to devx";

        System.out.println(str3.contains(str2));
        System.out.println(str3.equalsIgnoreCase(str2));
        System.out.println("2. Equality ignoring case: "+str3.equalsIgnoreCase(str2));
        System.out.println("index of char: "+st1.charAt(6));
        //welcome to java class

    }
}

