package com.java.OOP;

public class person {

    String name;
    int age;
    String gender;


  person (String name, int age, String gender) {
       this.name=name;
       this.age=age;
       this.gender=gender;

        }
        void noperamiter(){
            System.out.println("Nothing to print");
    }
    void anotherpersonNameandage(){
        this.name=name;
        this.gender=gender;
        this.age=age;
        System.out.println("My name is "+name+"my gender is "+gender+"my age is "+age);
    }
    void displayInformation(){
        System.out.println("Name of the person "+name+" age of the person " + +age+" gender of the person "+ gender);
        System.out.println("*/*/*/**//**/*/*//*/");
    }

}