package com.java.class19;

// Write a program to check for than 5 divisor from number 1 to100
public class again5divisor {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(myDivisor5(i)==true){
                System.out.println(i);
            }
        }
    }
    static boolean myDivisor5(int num) {
        int count = 0;
        for (int k = 1; k <= num; k++) {
            if (num % k == 0) {
                count++;
            }
        }
        if (count >= 5) {
            return true;
        } else {
            return false;
        }
    }

}
