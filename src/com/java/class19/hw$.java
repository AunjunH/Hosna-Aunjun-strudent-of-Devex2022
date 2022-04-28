package com.java.class19;
//write a program like 1 then 12 then123 then1234 then 12345
public class hw$ {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
