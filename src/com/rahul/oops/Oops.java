package com.rahul.oops;

import java.util.Arrays;

public class Oops {
    public static void main(String[] args) {
        // why do we need oops?
        // store the names of 5 employees
        String[] emp_names = new String[5];
        // store the rnos of 5 employees
        int[] rnos = new int[5];

        // store the details of 5 employees
        // [name, emp_id, department]

//        com.rahul.oops.Employee[] employees = new com.rahul.oops.Employee[5];

//        com.rahul.oops.Employee employee1 = new com.rahul.oops.Employee("Oscar", 199, "IT");
//        employee1.details();
//
//        com.rahul.oops.Employee employee2 = new com.rahul.oops.Employee("Jacob", 111, "Sales");
//        employee2.details();
//
//
//        com.rahul.oops.Employee employee3 = new com.rahul.oops.Employee();
//        employee3.details();
//
        // final keyword.
        final int a = 90;

        final int[] arr = {10, 20, 30};

//        arr = new int[5];

        arr[0] = 101;
        System.out.println(Arrays.toString(arr));

    }
}

class Employee {
    String name;
    int emp_id;
    String department;

    Employee (String name, int emp_id, String department) {
        this.name = name;
        this.emp_id = emp_id;
        this.department = department;
    }

    Employee () { // default constructor
        this ("default person", 0, "not defined");
    }

    void details() {
        System.out.println("com.rahul.oops.Employee name: " + this.name);
        System.out.println("com.rahul.oops.Employee Id: " + this.emp_id);
        System.out.println("com.rahul.oops.Employee department: " + this.department);
    }
}
