package com.bridgelabz.java_inheritance.practice_problems;

/*
Program to
1. create hierarchical inheritance of Employee, Manager, Developer and Intern
2. demonstrate subclasses with specific attributes and overriding superclass methods
 */

// superclass Employee
public class Employee {
    protected int id;
    protected String name;
    protected int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Details: ");
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Salary: Rs. " + salary);
    }
}

// subclass Manager
class Manager extends Employee {
    private int teamSize; // subclass's attribute

    public Manager(int id, String name, int salary, int teamSize) {
        super(id, name, salary);
        this.teamSize = teamSize; // additional initialization
    }

    // method overriding
    @Override
    public void displayDetails() {
        System.out.println("Manager Details: ");
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Salary: Rs. " + salary);
        System.out.println("Team Size: " + teamSize);
    }
}

// subclass Developer
class Developer extends Employee {
    private String programmingLanguage; // subclass's attribute

    public Developer(int id, String name, int salary, String programmingLanguage) {
        super(id, name, salary);
        this.programmingLanguage = programmingLanguage; // additional initialization
    }

    // method overriding
    @Override
    public void displayDetails() {
        System.out.println("Developer Details: ");
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Salary: Rs. " + salary);
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// subclass Intern
class Intern extends Employee {
    public Intern(int id, String name, int salary) {
        super(id, name, salary);
    }

    // method overriding
    @Override
    public void displayDetails() {
        System.out.println("Intern Details: ");
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Salary: Rs. " + salary);
    }
}

class EmployeeMain {
    public static void main(String[] args) {
        Manager manager = new Manager(1, "Adithyan", 200000, 5);
        Developer developer = new Developer(5, "Chandru", 125000, "Java");
        Intern intern = new Intern(10, "Vishwa", 40000);

        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}


