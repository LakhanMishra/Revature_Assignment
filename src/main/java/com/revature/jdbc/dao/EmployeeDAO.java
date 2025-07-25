package com.revature.jdbc.dao;

import com.revature.jdbc.model.Employee;
import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(int id);
    boolean insertEmployee(Employee emp);
    boolean updateDesignation(int id, String designation);
    boolean deleteEmployee(int id);
    int getTotalEmployees();
    int getTotalByDepartment(String dept);
}
