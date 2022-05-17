package com.java.OOP;

public class TeacherTester {
    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.name="chirag Khimani";
        t.quality="very knowledgeable about programming language";
        t.age=25;
        t.speciality="computerprogramming";
        t.phoneNumber=123456789;
        t.country="India";
        t.email=null;
        System.out.println(t.name+" is our java instructor.He is "+t.age+" years old"+". He is a " +t.quality+
                ". he is from "+t.country +". I don't know his email "+ t.email );
    }
}
