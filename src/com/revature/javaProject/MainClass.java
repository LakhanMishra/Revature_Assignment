package com.revature.javaProject;

public class MainClass {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        Customer c2 = new Customer("Lakhan", 28);

        c1.display();
        c2.display("Customer Info");

        System.out.println("Company: " + c2.company);
        System.out.println("Total Customers: " + Customer.customerCount);
    }
}
