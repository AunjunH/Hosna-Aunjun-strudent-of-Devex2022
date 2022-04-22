package com.java.CLASS18;
// write a program divisible by 6 from 1 to 50
public class Homeworkwithmethod {
    static boolean divisbleBy6(int i) {
        if ( i %6 == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        for(int i=1;i<=50;i++){
            if(divisbleBy6(i)==true){
                System.out.println(i);
            }
        }
    }
}