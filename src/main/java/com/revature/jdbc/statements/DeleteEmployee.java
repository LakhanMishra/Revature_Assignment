package com.revature.jdbc.statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEmployee {
    public void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "Lakhan@123");
             PreparedStatement ps = con.prepareStatement("DELETE FROM employees WHERE empid = ?")) {

            ps.setInt(1, id);
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee deleted successfully.");
            } else {
                System.out.println("Employee not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
