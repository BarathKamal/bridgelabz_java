package com.bridgelabz.java_keywords.practice_problems;

/*
Program to create a University Student Management System to demonstrate the use of
java keywords: static, this, final and isntanceof
 */

public class Student {
    // static keyword to store the universityName
    public static String universityName = "SRM";
    public String name;
    public final int rollNumber; // final keyword to avoid changing the rollNumber
    private char grade;
    public static int totalStudents;

    // this keyword to avoid ambiguity with the method parameters
    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public char getGrade() {
        return grade;
    }

    // static method to display the totalStudents
    public static void displayTotalStudents() {
        System.out.println("Total Number of students: " + totalStudents);
    }
}

class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Franklin",12, 'A');
        Student student2= new Student("Benjamin", 5, 'B');

        // instanceof keyword to check whether the object is an instance of this specific class
        if (student1 instanceof Student) {
            char grade = 'B';
            student1.setGrade(grade);
            System.out.println("Grade: " + student1.getGrade());
        }
        if (student2 instanceof Student) {
            char grade = 'A';
            student2.setGrade(grade);
            System.out.println("Grade: " + student2.getGrade());
        }

        Student.displayTotalStudents();
    }
}
