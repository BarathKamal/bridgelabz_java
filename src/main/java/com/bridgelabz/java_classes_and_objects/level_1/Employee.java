package com.bridgelabz.java_classes_and_objects.level_1;

public class Employee {
    private String name;
    private int id;
    private int salary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("Employee name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Employee salary: " + salary);
    }

}

class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Harish", 12, 50000);
        employee.displayDetails();
    }
}
