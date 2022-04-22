package com.java.class03;

import java.util.Scanner;

public class Months_Days_count {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your month");
        String month = sc.nextLine();


        switch (month){
            case "January" :
            case "March":
            case"April":
            case "May":
                System.out.println(  "have 31 days");
                break;
            case "February":
                System.out.println(" 28 /29 days");
                break;
            case "june":
            case "July":
            case "August":
            case "September":
            case "October":
            case "November":
            case "December":
                System.out.println(" have 30 days");
                break;

        }
    }
}
