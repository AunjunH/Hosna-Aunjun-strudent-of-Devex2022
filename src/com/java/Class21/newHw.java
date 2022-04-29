package com.java.Class21;
//write a program find the sum of each disit 36346.
public class newHw {
    public static void main(String[] args) {
        int num=36346;
        int sum=0;

        while(num!=0){
             sum =sum+num%10;
             num=num/10;
        }
        System.out.println(sum);
    }
}
