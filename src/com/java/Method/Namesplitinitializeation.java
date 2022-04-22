package com.java.Method;

public class Namesplitinitializeation {
    public static void main(String[] args) {
        String fullname = "Hosna Aunjun Heera";
        String[] words = fullname.split(" ");
        String firstname = words[0];
        String middlename = words[1];
        String lastname = words[2];
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[0].charAt(0) + "." + words[1].charAt(0) + "." + words[2].charAt(0) + ".");
        }
    }
}

