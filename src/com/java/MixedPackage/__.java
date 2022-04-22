package com.java.MixedPackage;
//Write address in split line
public class __ {
    public static void main(String[] args) {
        String address = "2945 shadywood ln plano tx 75023";
        String[] words = address.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);


        }
    }
}
