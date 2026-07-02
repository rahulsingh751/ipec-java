package com.rahul.oops;

public class Car {
    String engine;
    String color;
    int price;

    public Car(String engine, String color, int price) {
        this.engine = engine;
        this.color = color;
        this.price = price;
    }

    void details() {
        System.out.println("Engine: " + this.engine);
        System.out.println("Color: " + this.color);
        System.out.println("Price: " + this.price);
    }
}
