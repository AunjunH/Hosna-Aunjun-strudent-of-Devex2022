package com.java.CLASS18;
//Write a program to check divisible with 6 from number 1-100.
public class DivisorHW {

    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%6==0){
                System.out.println(i+" divisible by 6");
            }
        }
    }
}