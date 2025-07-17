package com.revature.RecursionProblem;

public class RecursionAddition {
    public static int addValues(int n) {
        if (n == 1) {
            return 1;
        }
        return n + addValues(n - 1);
    }

    public static void main(String[] args) {
        int number = 10;
        int result = addValues(number);
        System.out.println("Sum from 1 to " + number + " is: " + result);
    }
}
