package com.bridgelabz.java_inheritance.practice_problems;

/*
Program to
1. demonstrate multilevel inheritance
2. create superclass Course, subclass OnlineCourse extending Course and
subclass PaidOnlineCourse extending OnlineCourse
 */

// superclass Course
public class Course {
    protected String courseName;
    protected int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayDetails() {
        System.out.println("Course Details:");
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
    }
}

// subclass OnlineCourse extending the superclass Course
class OnlineCourse extends Course {
    // subclass specific attributes
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration); // constructor chaining
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // method overriding
    @Override
    public void displayDetails() {
        System.out.println("Online Course Details: ");
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration (in months): " + duration);
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + ((isRecorded) ? "yes" : "No"));
    }
}

// subclass PainOnlineCourse extending the subclass OnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    // subclass specific attributes
    protected int fee;
    protected int discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, int fee, int discount) {
        super(courseName, duration, platform, isRecorded); // constructor chaining
        this.fee = fee;
        this.discount = discount;
    }

    // method overriding
    @Override
    public void displayDetails() {
        System.out.println("Paid Online Course Details: ");
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration (in months): " + duration);
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + ((isRecorded) ? "yes" : "No"));
        System.out.println("Fees: Rs. " + fee);
        System.out.println("Discount (in %): " + discount);
    }
}

class CourseMain {
    public static void main(String[] args) {
        Course course1 = new Course("Python", 3);
        OnlineCourse course2 = new OnlineCourse("Java", 3, "SRM", true);
        PaidOnlineCourse course3 = new PaidOnlineCourse("C++", 3, "Udemy", false, 10000, 5);

        course1.displayDetails(); // Course object calling displayDetails() method
        course2.displayDetails(); // OnlineCourse Object calling displayDetails() method
        course3.displayDetails(); // PaidOnlineCourse Object calling displayDetails() method
    }
}
