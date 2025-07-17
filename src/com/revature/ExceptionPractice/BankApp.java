package com.revature.ExceptionPractice;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bal = 5000;

        System.out.print("Enter amount: ");
        int amt = sc.nextInt();

        try {
            if (amt > bal) {
                throw new InsufficientException("Not enough balance");
            } else {
                bal -= amt;
                System.out.println("Withdrawn. Balance: " + bal);
            }
        } catch (InsufficientException e) {
            System.out.println("InsufficientException: " + e.getMessage());
            e.printStackTrace();
        }

        sc.close();
    }
}
