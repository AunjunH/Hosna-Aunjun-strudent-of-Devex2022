package com.java.CLASS18;
// write 1-100 using method to find prime number
public class PracticePrimewithmethod {

    public static void isPrime(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

    }

    public static void main(String[] args) {
        for( int i=1;i<=100;i++){
            ;
                System.out.println(i);
            }
        }
    }

