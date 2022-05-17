package com.java.OOP;



public class personTester {
    public static void main(String[] args) {

        person p=new person("Hosna",29,"female");
        person p1=new person("mizan",30,"male");
        p.displayInformation();
        p1.displayInformation();
        person p2=new person("Mykhailo",28,"male");
        p2.anotherpersonNameandage();
        person p3=new person("Swati",25,"female");
        p3.displayInformation();
        person p4=new person("Inna",30,"female");
    p3.noperamiter();
    }
}

