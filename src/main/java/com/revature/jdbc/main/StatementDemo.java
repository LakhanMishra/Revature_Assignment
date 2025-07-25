package com.revature.jdbc.main;

import com.revature.jdbc.model.Employee;
import com.revature.jdbc.service.EmployeeService;
import java.util.List;
import java.util.Scanner;

public class StatementDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        while (true) {
            System.out.println("""
                \n--- MENU ---
                1. Display All Employees
                2. Display Employee by ID
                3. Insert Employee
                4. Update Designation
                5. Delete Employee
                6. Total Employees
                7. Employees in Department
                8. Exit
                """);
            System.out.print("Choose: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1: {
                    List<Employee> list = service.fetchAll();
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }
                    break;
                }
                case 2: {
                    System.out.print("Enter ID: ");
                    System.out.println(service.fetchById(sc.nextInt()));
                    break;
                }
                case 3: {
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Dept: ");
                    String dept = sc.nextLine();
                    System.out.print("Designation: ");
                    String desig = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Salary: ");
                    double salary = sc.nextDouble();
                    Employee emp = new Employee(name, dept, desig, email, salary);
                    System.out.println(service.addEmployee(emp));
                    break;
                }
                case 4: {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("New Designation: ");
                    String desig = sc.nextLine();
                    System.out.println(service.updateDesignation(id, desig));
                    break;
                }
                case 5: {
                    System.out.print("Enter ID to delete: ");
                    System.out.println(service.deleteById(sc.nextInt()));
                    break;
                }
                case 6: {
                    System.out.println("Total: " + service.totalEmployees());
                    break;
                }
                case 7: {
                    sc.nextLine();
                    System.out.print("Enter Dept: ");
                    System.out.println("Total: " + service.totalInDepartment(sc.nextLine()));
                    break;
                }
                case 8: {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default: {
                    System.out.println("Invalid choice!");
                    break;
                }
            }
        }
    }
}
