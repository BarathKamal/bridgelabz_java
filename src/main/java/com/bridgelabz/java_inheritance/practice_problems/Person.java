package com.bridgelabz.java_inheritance.practice_problems;

/*
Program to
1. demonstrate hierarchical inheritance
2. create superclass Person and subclasses Teacher, Student and Staff
 */

// superclass Person
public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// subclass Teacher
class Teacher extends Person {
    private String subject; // subclass specific attribute

    public Teacher(String name, int age, String subject) {
        super(name, age); // constructor chaining
        this.subject = subject;
    }

    // method overriding
    public void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}

// subclass Student
class Student extends Person {
    private char grade; // subclass specific attribute

    public Student(String name, int age, char grade) {
        super(name, age); // constructor chaining
        this.grade = grade;
    }

    // method overriding
    public void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

// subclass Staff
class Staff extends Person {
    private String work; // subclass specific attribute

    public Staff(String name, int age, String work) {
        super(name, age); // constructor chaining
        this.work = work;
    }

    // method overriding
    public void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Work: " + work );
    }
}

class PersonMain {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Sharath", 36, "Computer Science");
        Student student = new Student("Anushka", 17, 'A');
        Staff staff = new Staff("Arasan", 62, "Electricity");

        teacher.displayRole(); // Teacher object calling overridden method
        student.displayRole(); // Student object calling overridden method
        staff.displayRole(); // Staff object calling overridden method
    }
}
