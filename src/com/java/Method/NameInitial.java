package com.java.Method;
//print name initial Hosna Aunjun Heera = HAH
public class NameInitial {
    public static void main(String[] args) {
        String fullname = "Hosna Aunjun Heera";
        String parts[]= fullname.split("");

        String firstname= parts[0];
        String middlename=parts[1];
        String lastname=parts[2];

        System.out.println(firstname.charAt(0)+"."+middlename.charAt(0)+"."+lastname.charAt(0)+".");

    }

}
