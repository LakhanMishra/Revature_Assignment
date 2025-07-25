package com.revature.jdbc.service;

import com.revature.jdbc.model.Employee;
import com.revature.jdbc.dao.EmployeeDAO;
import com.revature.jdbc.dao.EmployeeDAOImpl;
import java.util.List;

public class EmployeeService {
    private final EmployeeDAO dao = new EmployeeDAOImpl();

    public List<Employee> fetchAll() {
        return dao.getAllEmployees();
    }

    public Employee fetchById(int id) {
        return dao.getEmployeeById(id);
    }

    public String addEmployee(Employee emp) {
        if (emp.getEmpname().isBlank() || emp.getDept().isBlank() || emp.getEmail().isBlank()) {
            return "Name, department and email must not be empty.";
        }
        if (emp.getSalary() <= 0) {
            return "Salary must be greater than 0.";
        }
        return dao.insertEmployee(emp) ? "Employee added successfully." : "Failed to add employee.";
    }

    public String updateDesignation(int id, String designation) {
        if (designation.isBlank()) return "Designation must not be empty.";
        return dao.updateDesignation(id, designation) ? "Updated successfully." : "Update failed.";
    }

    public String deleteById(int id) {
        return dao.deleteEmployee(id) ? "Deleted successfully." : "Deletion failed.";
    }

    public int totalEmployees() {
        return dao.getTotalEmployees();
    }

    public int totalInDepartment(String dept) {
        return dao.getTotalByDepartment(dept);
    }
}
