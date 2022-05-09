package com.java.Class17;

import java.util.Scanner;

// find max in array [] 1 to 5
public class FindMaxinArray {
    public static void main(String[] args) {


        double num[]=new double[7];
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter your 7 number ");
        for(int i=0;i< num.length;i++){
            num[i]= sc.nextDouble();
        }

        double max=num[0];
        for(int i =1;i< num.length;i++){
            if(max< num[i]){
                max= num[i];
            }
        }
        System.out.println("the max number is "+ max);
    }
}
