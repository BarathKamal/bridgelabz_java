package com.bridgelabz.java_keywords.practice_problems;

/*
Program to create an Employee Management System to demonsrate the use of
keywords: static, this, final and instanceof
 */
public class Employee {
    // static variable to store the companyName, totalEmployees
    public static String companyName = "Amazon";
    public String name;
    public final int id; // final keyword to avoid changing id
    public String designation;
    private static int totalEmployees = 0;

    // this keyword to avoid ambiguity with method parameters
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    // static method to display the totalEmployees
    public static void displayTotalEmployees() {
        System.out.println("Total Number of Employees: " + totalEmployees);
    }

    // instance method to display the details of the employee
    public void displayEmployeeDetails() {
        System.out.println("Employee Details: ");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Employee Designation: " + designation);
    }
}

class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Akshay", 55, "Senior Developer");
        Employee employee2 = new Employee("Vikash", 23, "Manager");

        // instanceof keyword to check whether the object is an instance of this specific class
        if (employee1 instanceof Employee) {
            employee1.displayEmployeeDetails();
            System.out.println();
        }

        if (employee2 instanceof Employee) {
            employee2.displayEmployeeDetails();
            System.out.println();
        }

        Employee.displayTotalEmployees();
    }
}
