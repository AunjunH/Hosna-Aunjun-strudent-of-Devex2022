package com.java.class01;

public class P$R_Max {
    public static void main(String[] args) {
int num=65982;
int min=num%10;
while(num>0){
    if(num%10<min){
        min=num%10;
    }
        num=num/10;

    }
        System.out.println(min);
}

    }


