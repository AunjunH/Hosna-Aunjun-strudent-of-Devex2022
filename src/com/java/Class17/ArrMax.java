package com.java.Class17;

import java.util.Scanner;

// find max in arr[] 1 to 5
public class ArrMax {

    public static void main(String[] args) {
        int num[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter your 5 numbers");
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }

        }
        int min=num[0];
        for(int i=1;i<num.length;i++){
            if(min>num[i]){
                min=num[i];

            }
        }
        int sum=0;
        for (int i=0;i<num.length;i++){
            sum=sum+num[i];
        }
        int ave=0;
        ave=sum/ num.length;
        System.out.println("tota average is "+ave);
        System.out.println("total sum is "+ sum);
        System.out.println("the min in "+ min);
        System.out.println(" the max is " + max);
    }
}