package com.revature.jdbc.statements;

import java.sql.*;
import java.util.Scanner;

public class ReadEmployeeById {
    public void displayById() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int empid = sc.nextInt();

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "Lakhan@123");
             PreparedStatement ps = con.prepareStatement("SELECT * FROM employees WHERE empid = ?")) {

            ps.setInt(1, empid);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println(rs.getInt("empid") + " - " + rs.getString("empname") + " - "
                        + rs.getString("dept") + " - " + rs.getString("designation") + " - "
                        + rs.getString("email") + " - " + rs.getDouble("salary"));
            } else {
                System.out.println("Employee not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
