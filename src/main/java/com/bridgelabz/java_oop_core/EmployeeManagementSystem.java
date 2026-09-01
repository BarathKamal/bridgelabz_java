package com.bridgelabz.java_oop_core;

/*
Program to demonstrate Inheritance, Abstraction, Encapsulation and Polymorphism
through an Employee Management System
 */

// Employee class - Abstract and implements Department interface
abstract class Employee implements Department {
    // attributes protected by private access modifier (encapsulation)
    private int employeeId;
    private String name;
    private int baseSalary;
    private String departmentName;

    // parameterized constructor
    public Employee(int employeeId, String name, int baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // getter methods for safe access to the attributes (encapsulation)
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    // abstract method
    abstract int calculateSalary();

    // method overriding  - polymorphism
    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    // method overriding - polymorphism
    @Override
    public String getDepartmentName() {
        return departmentName;
    }

    // concrete method
    public void displayDetails() {
        System.out.println("Employee Details: ");
        System.out.println("Name: " + name);
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Base Salary: Rs. " + baseSalary);
        if (this.getDepartmentName() != null) {
            System.out.println("Department: " + getDepartmentName());
        }

    }
}

// subclass FullTimeEmployee extending the abstract class Employee
class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int employeeId, String name, int baseSalary) {
        super(employeeId, name, baseSalary); // constructor chaining
    }

    // method overriding - polymorphism
    @Override
    public int calculateSalary() {
        return this.getBaseSalary() * 30;
    }
}

// subclass PartTimeEmployee extending abstract class Employee
class PartTimeEmployee extends Employee {
    private int hoursWorked; // subclass specific attributes
    private int hourlyRate; // subclass specific attributes

    public PartTimeEmployee(int employeeId, String name, int hoursWorked, int hourlyRate){
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        int baseSalary = hoursWorked * hourlyRate;
        super(employeeId, name, baseSalary); // constructor chaining
    }

    // method overriding - polymorphism
    @Override
    public int calculateSalary() {
        return this.getBaseSalary() * 30;
    }

    // method overriding - polymorphism
    @Override
    public void displayDetails() {
        System.out.println("Employee Details: ");
        System.out.println("Name: " + this.getName());
        System.out.println("Employee Id: " + this.getEmployeeId());
        System.out.println("Hourly Rate: Rs. " + hourlyRate);
        System.out.println("Number of hours worked: " + hoursWorked);
        System.out.println("Base Salary: Rs. " + this.getBaseSalary());
        try {
            if (this.getDepartmentName().length() > 0) {
                System.out.println("Department: " + getDepartmentName());
            }
        } catch (NullPointerException e) {}
    }
}

// Department interface
interface Department {
    // methods declaration
    void assignDepartment(String departmentName);
    String getDepartmentName();
}

class Main {
    public static void main(String[] args) {
        // subclass object creation
        FullTimeEmployee employee1 = new FullTimeEmployee(1, "Sharma", 3000);
        FullTimeEmployee employee2 = new FullTimeEmployee(2, "Verma", 4000);
        FullTimeEmployee employee3 = new FullTimeEmployee(3, "Vinay", 5000);

        // upcasting PartTimeEmployee object to Employee reference
        // polymorphism
        Employee employee4 = new PartTimeEmployee(4, "Shubham", 6, 400);

        int salary1 = employee1.calculateSalary();
        System.out.println("Salary of " + employee1.getName() + " is Rs. " + salary1);

        employee2.assignDepartment("Engineering");
        System.out.println("Department of " + employee2.getName() + " is " + employee2.getDepartmentName());

        employee3.displayDetails();

        employee4.assignDepartment("Medical Science");
        employee4.displayDetails();

    }
}
