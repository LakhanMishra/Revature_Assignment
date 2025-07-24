package com.revature.jdbc.statements;

import java.sql.*;

public class ReadAllEmployees {
    public void displayAll() {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "Lakhan@123");
             PreparedStatement ps = con.prepareStatement("SELECT * FROM employees");
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                System.out.println(rs.getInt("empid") + " - " + rs.getString("empname") + " - "
                        + rs.getString("dept") + " - " + rs.getString("designation") + " - "
                        + rs.getString("email") + " - " + rs.getDouble("salary"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
