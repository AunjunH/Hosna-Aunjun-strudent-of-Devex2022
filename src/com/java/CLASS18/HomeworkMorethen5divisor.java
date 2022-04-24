package com.java.CLASS18;
// write a program to find more then 5 divisor between 1-50

public class HomeworkMorethen5divisor {
    public static void main(String[] args) {
        for (int i=0;i<50;i++){
            if(mydivision(i)==true)
            System.out.println(i);
        }

    }
    public static boolean mydivision(int num){
     int count =0;
        for ( int i=1; i<=num;i++){
            if (num%i==0){
                count++;
            }

        }
        if( count>=5){
            return true;
        }else {
            return false;
        }
    }
}
