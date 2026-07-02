package com.rahul.basics;

public class VarArgs {
    static int number = 999;
    public static void main(String[] args) {
        number = 333;
        int result = total(90, 23, 26, 912);
        System.out.println(result);


        System.out.println(number);
    }

    static int total(int ...numbers) {
        System.out.println(number);
        int result = 0;
        for (int number : numbers) {
            result = result + number;
        }

        return result;
    }
}
