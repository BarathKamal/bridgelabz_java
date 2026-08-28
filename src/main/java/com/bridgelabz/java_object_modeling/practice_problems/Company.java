package com.bridgelabz.java_object_modeling.practice_problems;

import java.util.List;
import java.util.ArrayList;
/*
Program to
1. create Company, Department and Employee class
2. demonstrate composition relationship between them (Company <- Department <- Empoyee)
 */
public class Company {
    private String name;
    private List<Department> departments = new ArrayList<>();
    private int nextDeptId = 1;

    public Company(String name) {
        this.name = name;
    }

    // creating a department
    public void createDepartment(String deptName) {
        Department department = new Department(nextDeptId, name, deptName);
        departments.add(department);
        System.out.println("Department " + deptName + " of id " + nextDeptId + " is created in company " + name);
        nextDeptId++;
    }

    // get the department using deptId
    public Department getDepartment(int deptId) {
        return departments.get(deptId - 1);
    }

    // display the list of departments
    public void displayDepartments() {
        System.out.println("List of departments in company " + name + ": ");
        for (Department department : departments) {
            System.out.println("Department id " + department.getId() + ": " + department.getName());
        }
    }
}

class Department {
    private int id;
    private String companyName;
    private String name;
    List<Employee> employees = new ArrayList<>();
    private int nextEmployeeId = 1;

    public Department(int id, String companyName, String name) {
        this.id = id;
        this.companyName = companyName;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // creating an employee in a department
    public void createEmployee(String employeeName) {
        Employee employee = new Employee(nextEmployeeId, employeeName);
        employees.add(employee);
        nextEmployeeId++;
    }

    // displays list of employees
    public void displayEmployees() {
        System.out.println("List of employees in department " + name + " of company " + companyName);
        for (Employee employee : employees) {
            System.out.println("Employee id " + employee.getId() + ": " + employee.getName());
        }
    }


}

class Employee {
    private int id;
    private String name;

    public Employee (int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class CompanyMain {
    public static void main(String[] args) {
        // company object creation
        Company company = new Company("Wells Fargo");

        // departments creation
        company.createDepartment("AI");
        company.createDepartment("Devops");

        // employee creation in with deptId 1
        Department dept1 = company.getDepartment(1);
        dept1.createEmployee("Velan");
        dept1.createEmployee("Suri");

        // employee creation in dept with deptId 2
        Department dept2 = company.getDepartment(2);
        dept2.createEmployee("Arivu");
        dept2.createEmployee("Anbu");

        // display of the list of departments
        company.displayDepartments();

        // display of the list of employees
        dept1.displayEmployees();
        dept2.displayEmployees();
    }
}