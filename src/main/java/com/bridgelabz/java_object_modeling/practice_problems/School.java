package com.bridgelabz.java_object_modeling.practice_problems;

import java.util.List;
import java.util.ArrayList;
/*
Program to create the classes School, Course and Student to demonstrate the concepts of association and aggregation
 */
public class School {
    private String name;
    private List<Student> students = new ArrayList<>();

    public School(String name) {
        this.name = name;
    }

    public void addStudent(Student student){
        students.add(student);
        System.out.println(student.getName() + " joined in " + name + " school");
    }

    public void displayStudents() {
        System.out.println("Students of \"" + name + "\" school:");
        int count = 1;
        for (Student student : students) {
            System.out.println(count + ". " + student.getName());
            count++;
        }
    }
}

class Student {
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    // many-to-many relationship
    public void enroll(Course course) {
        courses.add(course);
        course.getStudents().add(this);
        System.out.println(name + " registered in " + course.getName());
    }

    public void displayCourses() {
        System.out.println("Enrolled courses of " + name + ":");
        int count = 1;
        for (Course course : courses) {
            System.out.println(count + ". " + course.getName());
            count++;
        }
    }

}

class Course {
    private String name;
    private List<Student> students = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void displayStudents() {
        System.out.println("Enrolled students in " + name + " course:");
        int count = 1;
        for (Student student : students) {
            System.out.println(count + ". " + student.getName());
            count++;
        }
    }
}

class SchoolMain {
    public static void main(String[] args) {
        School school = new School("Oxford");

        Student student1 = new Student("Billa");
        Student student2 = new Student("Ranga");
        Student student3 = new Student("Vetri");

        Course course1 = new Course("Java Programming");
        Course course2 = new Course("Python Programming");

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        student1.enroll(course1);
        student1.enroll(course2);
        student2.enroll(course2);

        student1.displayCourses();
        course2.displayStudents();
        school.displayStudents();
    }
}
