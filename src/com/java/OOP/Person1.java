package com.java.OOP;

public class Person1 {
    String name;
    String gender;
    int age;
    int phone;

    Person1(int age,String gender){
       this.age=age;
        this.gender=gender;

    }
    Person1(){
        System.out.println("NOthing to print");
    }
    Person1(String name,int age){
        ;
        this.name=name;
        this.age=age;

    }
    void Print(){
        System.out.println("Her name is "+name+"her age is "+age+"she is from ");
        System.out.println("her phone number is "+phone);
        System.out.println("his name is "+ name +"his age is " +age+"his contact number is "+phone);
    }

}
