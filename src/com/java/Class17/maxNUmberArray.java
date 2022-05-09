package com.java.Class17;

import java.util.Scanner;

public class maxNUmberArray {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        double [] num = new double[5];
      //  double sum=0;
        System.out.println("Please enter 5 numbers");


        for(int i =0;i<num.length;i++ ){
            num [i]=sc.nextDouble();

        }
        double max = num[0];
        for (int i = 1; i < 5; i++) {
            if (max < num[i]) {
                max = num[i];
            }


        }
        System.out.println("the max num is "+ max);
    }
}