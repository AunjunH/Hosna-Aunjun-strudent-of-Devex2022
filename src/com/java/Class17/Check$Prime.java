package com.java.Class17;

public class Check$Prime {
    public static void main(String[] args) {
        for(int a=2;a<=50;a++) {
            boolean isPrime = true;
            for (int b = 2; b < a; b++) {
                if (a % b == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(a);
            }
        }





    }
}
