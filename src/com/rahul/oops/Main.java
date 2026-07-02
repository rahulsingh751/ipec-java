package com.rahul.oops;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("v6 petrol", "matte", 75000);
        Car car2 = new Car("v12 petrol", "black", 115000);

        car1.details();
        car2.details();
    }
}
