package com.bridgelabz.java_constructors.level_2;

import java.util.Scanner;
/* Program to
1. Create a Course class with instance and static variables
2. Use an instance method to display course details
3. Use a static method to update the institute name
 */
public class Course {
    // variable declaration
    private String courseName;
    private int duration;
    private int fee;
    private static String instituteName = "SRM";

    // parameterized constructor
    public Course(String courseName, int duration, int fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // static method for updating the institute name
    public static void updateInstituteName(String instituteName) {
        Course.instituteName = instituteName;
    }

    // instance method to display the course details
    public void displayCourseDetails() {
        System.out.println("\nCourse Details: ");
        System.out.println("Course Name: " + courseName);
        System.out.println("Course duration in months: " + duration);
        System.out.println("Course Fees (in Rs.): " + fee);
        System.out.println("Institute Name: " + instituteName);
    }
}

class CourseMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.println("Enter the name of the course: ");
        String courseName = scanner.nextLine();

        System.out.println("Enter the course duration (in months): ");
        int duration = scanner.nextInt();

        System.out.println("Enter the course fee (in Rs.): ");
        int fee = scanner.nextInt();
        scanner.nextLine();

        // Object creation and calling the instance method
        Course course = new Course(courseName, duration, fee);
        course.displayCourseDetails();
        System.out.println();

        // Getting the new institute name
        System.out.println("Enter the new institute name: " );
        String newInstituteName = scanner.nextLine();

        // Updating the institute name
        Course.updateInstituteName(newInstituteName);
        course.displayCourseDetails();

        scanner.close();

    }
}
