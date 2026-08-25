package com.bridgelabz.java_constructors.level_2;

/*
Program to:
1. Create an Employee class with employeeID, department and salary attributes
2. Provide getter and setter for salary
3. Create a Manager subclass and demonstrate access modifiers (public, protected, private)
*/

public class Employee {
    // public attribute: accessible from anywhere
    public int employeeID;
    // protected attribute: accessible in subclass and same package
    protected String department;
    // private attribute: accessible only within this class
    private int salary;

    // Parameterized constructor
    public Employee(int employeeID, String department, int salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Getter for salary
    public int getSalary() {
        return this.salary;
    }

    // Setter for salary
    public void setSalary(int salary) {
        this.salary = salary;
    }
}

// Manager subclass: demonstrates inheritance from Employee and access to public/protected members
class Manager extends Employee {
    public Manager(int employeeID, String department, int salary) {
        super(employeeID, department, salary);
    }
}

// EmployeeMain: demonstrates creating Employee and Manager instances and using getters/setters
class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "IT", 50000);
        int oldSalary = employee.getSalary();
        System.out.println("Employee old Salary: " + oldSalary);

        int newSalary = oldSalary + 10000;
        employee.setSalary(newSalary);
        System.out.println("Employee new Salary: " + employee.getSalary());
        System.out.println();

        Manager manager = new Manager(2, "HR", 100000);
        System.out.println("Manager Employee ID: " + manager.employeeID);
        System.out.println("Manager Department: " + manager.department);
    }
}
