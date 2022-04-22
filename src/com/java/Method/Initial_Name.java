package com.java.Method;

public class Initial_Name {
    public static void main(String[] args) {
        String name="Mizanur Rahman Mowla";
        String[]parts=name.split(" ");
        String firstname=parts[0];
        String middlename=parts[1];
        String lastname=parts[2];
        for(int i=0;i<= parts.length;i++);
        System.out.println(parts[0].charAt(0)+"."+parts[1].charAt(0)+"."+parts[2].charAt(0)+".");
    }
}
