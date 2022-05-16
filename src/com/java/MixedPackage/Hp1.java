package com.java.MixedPackage;

public class Hp1 {
    public static void main(String[] args) {
        String sentence="Mizanur Rahman Mowla";
        String rev=" ";
       // int length=word.length();

        for(int i=sentence.length()-1;i>=0;i--){
            rev=rev+sentence.charAt(i);
        }
        System.out.println( rev);

    }
}
