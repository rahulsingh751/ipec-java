package com.rahul.basics;

public class Methods {
    public static void main(String[] args) {
        greetings();
//        System.out.println(addition(10, 20));

        int result = addition(10, 20);
        System.out.println(result);


        int[] arr = {10, 33, 99, 62, 91};
        outputArray(arr);

        int[] nums = {88, 99, 111};
        outputArray(nums);


        String name = "Adarsh";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String name) {
        name = "Kunal";
    }

    static void outputArray(int[] numbers) {
        for (int j : numbers) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    // defining a method
    static void greetings() {
        System.out.println("Hello User, Hope you are doing great!!");
    }

    static int addition(int num1, int num2) {
        return num1 + num2;
//        System.out.println(num1 + num2);
    }

}
