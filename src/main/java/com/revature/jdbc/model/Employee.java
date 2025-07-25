package com.revature.jdbc.model;

public class Employee {
    private int empid;
    private String empname;
    private String dept;
    private String designation;
    private String email;
    private double salary;

    // Constructors
    public Employee() {}

    public Employee(String empname, String dept, String designation, String email, double salary) {
        this.empname = empname;
        this.dept = dept;
        this.designation = designation;
        this.email = email;
        this.salary = salary;
    }

    public Employee(int empid, String empname, String dept, String designation, String email, double salary) {
        this(empname, dept, designation, email, salary);
        this.empid = empid;
    }

    // Getters and Setters
    public int getEmpid() { return empid; }
    public void setEmpid(int empid) { this.empid = empid; }

    public String getEmpname() { return empname; }
    public void setEmpname(String empname) { this.empname = empname; }

    public String getDept() { return dept; }
    public void setDept(String dept) { this.dept = dept; }

    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return empid + " - " + empname + " - " + dept + " - " + designation + " - " + email + " - " + salary;
    }

}
