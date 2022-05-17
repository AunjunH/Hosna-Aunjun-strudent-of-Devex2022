package com.java.SwatiHW;

import java.util.Scanner;

// deposit mini 5000 to 20000 if deposit for 1yr rate 2% rate will increase by0.25%
//deposit mini 20001-50000; if deposit for 1yr 4% rate will increase 0.25%
public class JiraProjectDepsitwithinterestCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How much you want to deposit?");
        double depositAmount=sc.nextDouble();

        System.out.println("for how long you want to keep your deposit?");
        int depositTime=sc.nextInt();
        double savings=0;
double rate=0;
double totalAmount=0;
        if(depositAmount>=5000 && depositAmount<=20000){
            rate = 2+ (depositTime - 1)*0.25;}


            else if(depositAmount>=20001 && depositAmount<=50000){
        rate = 4+ (depositTime - 1)*0.25;}
        totalAmount=(depositAmount*rate/100)+depositAmount;
        System.out.println("your balance is "+ totalAmount);
                }

            }



