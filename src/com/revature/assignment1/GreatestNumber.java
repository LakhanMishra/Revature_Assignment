package com.revature.assignment1;

public class GreatestNumber {
    public static void main(String[] args) {
        int a = 40, b = 25, c = 30;

        if (a > b && a > c)
            System.out.println("Greatest: " + a);
        else if (b > c)
            System.out.println("Greatest: " + b);
        else
            System.out.println("Greatest: " + c);
    }
}
