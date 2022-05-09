package com.java.class15;
// check to find out biggest number
import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 3 number");

        int numa = sc.nextInt();
        int numb = sc.nextInt();
        int numc = sc.nextInt();
        if (numa > numb && numa > numc) {
            System.out.println(numa + "biggest number");
        }
        if (numb > numc) {
            System.out.println(numb + " biggest number");
        } else {
            System.out.println(numc + "biggest number");
        }
    }
}

