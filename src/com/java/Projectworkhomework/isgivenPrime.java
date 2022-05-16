package com.java.Projectworkhomework;

public class isgivenPrime {
    public static void main(String[] args) {

        int num=7;
        if(myPrime(7)==true){
            System.out.println(myPrime(7 )+ "a prime number");
        }else {
            System.out.println(myPrime(num)+" not prime");
        }
    }
    public static boolean myPrime(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==2){
                count++;
            }
        }
        if(count==2){
            return true;
        }return false;
    }
}
