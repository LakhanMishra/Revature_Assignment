package com.revature.ExceptionPractice;

import java.io.*;

public class CheckedExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("file.txt");
            System.out.println("File opened successfully.");
            fr.close();
        } catch (IOException e) {
            System.out.println("Checked Exception Caught: " + e.getMessage());
        }
    }
}
