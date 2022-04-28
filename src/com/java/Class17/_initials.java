package com.java.Class17;
// write fulll name initials
public class _initials {
    public static void main(String[] args) {
        String fullname="Hosna Aunjun Heera";
        String[]parts=fullname.split(" ");
        String firstname=parts[0];
        String middlename=parts[1];
        String lastname=parts[2];
        System.out.println(parts[0].charAt(0)+"."+parts[1].charAt(0)+"."+parts[2].charAt(0)+".");
    }
}
