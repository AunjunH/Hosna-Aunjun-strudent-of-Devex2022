package com.java.Projectworkhomework;

public class ____Practicelater_seriesgivennumber {
    public static void main(String[] args) {
        int h = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                h = h-i;
            } else {
                h = h + i;
            }

        }
        System.out.println(h);
    }
}
