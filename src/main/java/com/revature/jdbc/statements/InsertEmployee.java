package com.revature.jdbc.statements;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertEmployee {
    public void insert() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Department: ");
        String dept = sc.nextLine();
        System.out.print("Designation: ");
        String designation = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Salary: ");
        double salary = sc.nextDouble();

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "Lakhan@123");
             CallableStatement cs = con.prepareCall("{call insert_employee(?, ?, ?, ?, ?)}")) {

            cs.setString(1, name);
            cs.setString(2, dept);
            cs.setString(3, designation);
            cs.setString(4, email);
            cs.setDouble(5, salary);
            cs.execute();

            System.out.println("Employee inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
