package com.revature.jdbc.dao;

import com.revature.jdbc.model.Employee;
import com.revature.jdbc.util.DBUtil;
import java.sql.*;
import java.util.*;

public class EmployeeDAOImpl implements EmployeeDAO{
    public List<Employee> getAllEmployees() {
        List<Employee> list = new ArrayList<>();
        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement("SELECT * FROM employees");
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                list.add(new Employee(
                        rs.getInt("empid"),
                        rs.getString("empname"),
                        rs.getString("dept"),
                        rs.getString("designation"),
                        rs.getString("email"),
                        rs.getDouble("salary")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public Employee getEmployeeById(int id) {
        Employee emp = null;
        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement("SELECT * FROM employees WHERE empid = ?")) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                emp = new Employee(
                        rs.getInt("empid"),
                        rs.getString("empname"),
                        rs.getString("dept"),
                        rs.getString("designation"),
                        rs.getString("email"),
                        rs.getDouble("salary")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return emp;
    }

    public boolean insertEmployee(Employee emp) {
        try (Connection con = DBUtil.getConnection();
             CallableStatement cs = con.prepareCall("{call insert_employee(?,?,?,?,?)}")) {
            cs.setString(1, emp.getEmpname());
            cs.setString(2, emp.getDept());
            cs.setString(3, emp.getDesignation());
            cs.setString(4, emp.getEmail());
            cs.setDouble(5, emp.getSalary());
            return cs.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateDesignation(int id, String designation) {
        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement("UPDATE employees SET designation = ? WHERE empid = ?")) {
            ps.setString(1, designation);
            ps.setInt(2, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteEmployee(int id) {
        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement("DELETE FROM employees WHERE empid = ?")) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public int getTotalEmployees() {
        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement("SELECT COUNT(*) FROM employees");
             ResultSet rs = ps.executeQuery()) {
            if (rs.next()) return rs.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int getTotalByDepartment(String dept) {
        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement("SELECT COUNT(*) FROM employees WHERE dept = ?")) {
            ps.setString(1, dept);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) return rs.getInt(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
