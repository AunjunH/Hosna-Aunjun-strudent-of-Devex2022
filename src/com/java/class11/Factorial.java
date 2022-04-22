package com.java.class11;
// do some factorial 1*2*3*4*5
public class Factorial {
    public static void main(String[] args) {
        int factorial =1;
        for(int i=1;i<=5;i++){
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
}
