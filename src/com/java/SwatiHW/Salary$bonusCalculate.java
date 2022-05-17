package com.java.SwatiHW;
// usere input the number of service in years and salary
//we have to filtered the bonus have to be 10% if the year is more or equal to 3 yrs.
//if year is more then 5 then bonus have to be 12%
//calculate the salary+bonus for both criteria.


import java.util.Scanner;

public class Salary$bonusCalculate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many years are you working?");
        int serviceYear=sc.nextInt();
        System.out.println("how much is your salary?");
        double salary=sc.nextInt();
        double bonus=0;

        if(serviceYear>=3 &&serviceYear<=5){
            bonus=salary*0.10;

        }else if(serviceYear>5){
            bonus=salary*0.12;
        }
        System.out.println( "you salary and bonus is "+(salary+bonus));

    }
}
