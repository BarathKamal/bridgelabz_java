package com.bridgelabz.java_constructors.level_2;

/* Program to
1. Create a class Student with instance variables rollNumber, name and CGPA
2. Create a subclass PostgraduateStudent which inherits Student class
3. Demonstrate the properties of protected and private access modifiers
 */

public class Student {
    // variables declartion
    public  int rollNumber;
    protected String name;
    private double cgpa;

    // Parameterized constructor
    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Getter method for accessing private instance variable
    public double getCgpa() {
        return cgpa;
    }

    // Setter method for modifying private instance variable
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    // Instance method to display the details
    public void displayDetails() {
        System.out.println("\nStudent Details: ");
        System.out.println("Student Roll Number: " + rollNumber);
        System.out.println("Student Name: " + name);
        System.out.println("Student CGPA: " + cgpa);
    }
}

// Child class inheriting the Parent class
class PostgraduateStudent extends Student {

    // Child class constructor
    public PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }

}

class StudentMain {
    public static void main(String[] args) {
        // Parent class object creation
        Student student1 = new Student(1056, "Aryan", 9.24);
        student1.displayDetails();
        System.out.println();

        // Access of private instance variable
        System.out.println("Student's cgpa via getter method: " + student1.getCgpa());

        // Modification of private instance variable
        double newCgpa = 9.76;
        student1.setCgpa(newCgpa);
        System.out.println("Student's updated cgpa: " + student1.getCgpa());

        // Child class object creation
        PostgraduateStudent student2 = new PostgraduateStudent(1082, "Mithran", 8.97);
        student2.displayDetails();
        System.out.println();

        // Direct access of protected instance variable of parent class
        System.out.println("Postgraduate Student's name via direct access: " + student2.name);

    }
}
