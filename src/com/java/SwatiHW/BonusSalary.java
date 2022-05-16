package com.java.SwatiHW;

import java.util.Scanner;

// usere input the number of service in years and salary
//we have to filtered the bonus have to be 5% if the year is more or equal to 3 yrs.
//if year is more then 5 then bonus have to be 10%
public class BonusSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" please enter your service year");
        int year = sc.nextInt();
        System.out.println("Please enter your salary");
        double salary = sc.nextDouble();
        double bonus = 0;
        if (year >= 3 && year <= 5) {
            bonus = salary * 0.05;
        } else if (year > 5) {
            bonus = salary * 0.10;

        }   //  salary= salary+bonus;
            System.out.println("The salary including bonus is " + (salary + bonus));


    }
}
