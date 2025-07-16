package com.revature.javaProject;

public class Customer {
    static int customerCount = 0;
    final String company = "Revature";

    String name;
    int age;

    public Customer() {
        name = "Unknown";
        age = 0;
        customerCount++;
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
        customerCount++;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void display(String message) {
        System.out.println(message + " -> Name: " + name + ", Age: " + age);
    }
}
