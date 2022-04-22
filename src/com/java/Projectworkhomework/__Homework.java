package com.java.Projectworkhomework;
//Find divisor of given number (Input - 6, output will be 1 2 3 6)
       // Find result of given series 1 + 2 – 3+ 4 + 5 – 6 + 7 + 8 – 9 +10
public class __Homework {
    public static void main(String[] args) {
        int sum = 0;
        int k;
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                k = -i;
            } else {
                k = i;

            }
            sum += k;

        }
        System.out.println(sum);
    }
}
