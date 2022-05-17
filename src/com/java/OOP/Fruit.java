package com.java.OOP;

public class Fruit {
    String fruit;
    String fruitColor;
    String fruitTaste;
    int fruitTypes;

    Fruit(String fruitName, String fruitColor, String fruitTaste, int fruitTypes) {
fruit=fruitName;
this.fruitColor=fruitColor;
this.fruitTaste=fruitTaste;
this.fruitTypes=fruitTypes;


    }

    public void setFruit(String fruit) {


    }

    void displayInformation() {
        System.out.println("Fruit name " +" "+ fruit);
        System.out.println("Fruit color" +" "+ fruitColor);
        System.out.println("Fruit tate" +" "+ fruitTaste);
        System.out.println("Fruit types" +" "+ fruitTypes);
        System.out.println("\n\n");
    }
}
