package com.java.Class17;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        int m,n =0;
        int count=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your starting number");
         m = sc.nextInt();
        System.out.println("Enter your Ending number");
        n=sc.nextInt();
        for(int i=m;i<=n;i++){
            for (int j=2;j<i;j++){
                if (i%j==0){
                    count++;
                    break;
                }
            }
            if (count==2);
            System.out.println(i);
        }count=0;

    }
}
