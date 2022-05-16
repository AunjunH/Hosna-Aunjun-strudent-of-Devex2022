package com.java.MixedPackage;

// write a program to reverse word
public class HP {
    public static void main(String[] args) {
        String word="Hosna";
        String  rev=" ";
        int length=word.length();
       for(int i=length-1;i>=0;i--){
         rev=rev+word.charAt(i);
       }
        System.out.println(rev);
    }

}
