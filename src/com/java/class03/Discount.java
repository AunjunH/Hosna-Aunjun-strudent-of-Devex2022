package com.java.class03;


//Take a price from the user a print their discount based on the following:
//Less than 100 - No Discount
//Less than 500 - 5%
//Less than 1000 - 10%
//More than 1000 - 15%

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        System.out.println("Enter your price to get discount");
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        if (price > 0 && price < 100) {
            System.out.println("NO discount");
        } else if (price > 100 && price < 500) {
            System.out.println("Get 5% discount");
        } else if (price > 500 && price < 1000) {
            System.out.println("Get 10% discount");
        } else if (price > 1000) {
            System.out.println("Get 15% discount");

        }
    }
}
