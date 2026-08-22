package com.bridgelabz.java_classes_and_objects.level_2;

public class Student {
    private String name;
    private int rollNumber;
    private int marks;
    private char grade;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void calculateGrade() {
        if (marks > 90) {
            this.grade = 'A';
        }
        else if (marks > 80 && marks <= 90) {
            this.grade = 'B';
        }
        else if (marks > 70 && marks <= 80) {
            this.grade = 'C';
        }
        else if (marks > 60 && marks <= 70) {
            this.grade = 'D';
        }
        else if (marks > 50 && marks <= 60) {
            this.grade = 'E';
        }
        else {
            this.grade = 'F';
        }
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Roll Number: " + rollNumber);
        System.out.println("Student Marks (out of 100): " + marks);
        System.out.println("Student Grade: " + grade);
    }
}

class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("Jai Kamal", 5467, 98);
        student.calculateGrade();
        student.displayDetails();
    }
}
