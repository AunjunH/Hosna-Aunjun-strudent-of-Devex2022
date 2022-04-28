package com.java.class19;

public class MoreThen5Divisor {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (myNumber(i) == true) {
                System.out.println(i);
            }

        }
    }


    public static boolean myNumber(int num) {
        int count = 0;
        for (int k = 1; k <= num; k++) {
            if (num%k == 0) {
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

