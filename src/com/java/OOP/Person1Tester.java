package com.java.OOP;

public class Person1Tester {
    public static void main(String[] args) {
        Person1 p=new Person1();
        p.Print();
        Person1 p2 = new Person1(28,"female");
        p2.Print();
        Person1 p3=new Person1("Hosna ", 28 );
        p3.Print();

    }
}
