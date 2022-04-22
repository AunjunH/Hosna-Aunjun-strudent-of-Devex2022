package com.java.Class17;
//write a program using 1-100 with method.

public class P$rime {
    static boolean isPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num %i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;

        }
    }


    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(isPrime(i)==true){
                System.out.println(i);
            }
        }

    }
}
