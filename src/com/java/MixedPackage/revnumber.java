package com.java.MixedPackage;

public class revnumber {
    public static void main(String[] args) {
        int num=123456;
        int rev=0;
        int lastdisit=num%10;
        for(int i=0;i<=num;i++){
             rev=num*10+lastdisit;
             num=num/10;
        }
        System.out.println(num);
    }
}
