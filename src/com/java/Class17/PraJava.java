package com.java.Class17;

import java.util.Scanner;

// take array num[] 1 to 5 and take the sum , ave, max and min
public class PraJava {
    public static void main(String[] args) {

        double num[]=new double[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your num");
        for(int i=0;i< num.length;i++){
            num[i]= sc.nextDouble();
        }
        double sum=0;
        for(int i=0;i<num.length;i++){
            sum=sum+num[i];
        }
        double average=0;
        average=sum/ num.length;
        double max=num[0];
        for(int i=1;i< num.length;i++){
            if(max<num[i]){
                max=num[i];
            }
        }
        double min=num[0];
        for(int i=1;i< num.length;i++){
            if(min>num[i]){
                min=num[i];
            }
        }
        System.out.println(" the minimum num is "+ min);
        System.out.println("the  maximum number  is "+max);
        System.out.println("total average is "+average);
        System.out.println("total sum "+ sum);
    }
}
