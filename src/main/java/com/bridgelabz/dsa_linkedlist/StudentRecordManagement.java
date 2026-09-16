package com.bridgelabz.dsa_linkedlist;
/*
Program to demonstrate the implementation of Student Record Management using singly linked list
 */

// Node containing student record details
class StudentNode {
    private int rollNumber;
    private String name;
    private int age;
    private char grade;
    private StudentNode next;

    public StudentNode(int rollNumber, String name, int age, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public char getGrade() {
        return grade;
    }

    public StudentNode getNext() {
        return next;
    }

    public void setNext(StudentNode student) {
        this.next = student;
    }
}

class StudentLinkedList {
    StudentNode head;
    int size;

    public StudentLinkedList() {
        head = null;
        size = 0;
    }

    // Insert student at the beginning
    public void addStudentAtBeginning(StudentNode student) {
        if (head == null) {
            head = student;
            size++;
            return;
        }

        student.setNext(head);
        head = student;
        size++;
    }

    // Insert student at the end
    public void addStudentAtEnd(StudentNode student) {
        if (head == null) {
            head = student;
            size++;
            return;
        }

        StudentNode last = head;

        while (last.getNext() != null) {
            last = last.getNext();
        }

        last.setNext(student);
        size++;
    }

    // Insert student at a specific position
    public void addStudentAtPosition(StudentNode student, int targetPosition) {
        if (targetPosition < 1 || targetPosition > size + 1) {
            System.out.println("Invalid target position");
            return;
        }

        if (targetPosition == 1) {
            addStudentAtBeginning(student);
            return;
        }

        if (targetPosition == size + 1) {
            addStudentAtEnd(student);
            return;
        }

        int currPosition = 1;
        StudentNode curr = head;

        while (curr != null) {
            if (currPosition + 1 == targetPosition) {
                student.setNext(curr.getNext());
                curr.setNext(student);
                size++;
                break;
            }

            currPosition++;
            curr = curr.getNext();
        }
    }

    // Delete student by roll number
    public void deleteStudent(int rollNumber) {
        if (head == null) {
            System.out.println("No students exist!");
            return;
        }

        StudentNode curr = head;

        if (curr.getRollNumber() == rollNumber) {
            head = head.getNext();
            size--;
            return;
        }

        while (curr.getNext() != null) {
            if (curr.getNext().getRollNumber() == rollNumber) {
                curr.setNext(curr.getNext().getNext());
                size--;
                return;
            }

            curr = curr.getNext();
        }

        System.out.println("Student with roll number " + rollNumber + " not found.");
    }

    // Update student grade by roll number
    public void updateStudentGrade(int rollNumber, char grade) {
        StudentNode curr = head;

        while (curr != null) {
            if (curr.getRollNumber() == rollNumber) {
                curr.setGrade(grade);
                return;
            }

            curr = curr.getNext();
        }

        System.out.println("Student with roll number " + rollNumber + " not found.");
    }

    // Display all student records
    public void displayStudents() {
        System.out.println("------------------------");
        System.out.println("Students List: ");
        System.out.println("------------------------");
        System.out.println("Total Students: " + size);
        System.out.println("------------------------");

        StudentNode curr = head;

        while (curr != null) {
            System.out.println("Roll Number: " + curr.getRollNumber());
            System.out.println("Name: " + curr.getName());
            System.out.println("Age: " + curr.getAge());
            System.out.println("Grade: " + curr.getGrade());
            System.out.println("------------------------");

            curr = curr.getNext();
        }
    }
}

public class StudentRecordManagement {
    public static void main(String[] args) {
        StudentNode student1 = new StudentNode(12, "Anand", 17, 'A');
        StudentNode student2 = new StudentNode(14, "David", 17, 'B');
        StudentNode student3 = new StudentNode(16, "Ravi", 17, 'A');

        StudentLinkedList list = new StudentLinkedList();

        list.addStudentAtBeginning(student1);
        list.addStudentAtEnd(student2);
        list.addStudentAtEnd(student3);

        list.displayStudents();

        StudentNode student4 = new StudentNode(18, "Gregorian", 16, 'O');
        list.addStudentAtBeginning(student4);

        StudentNode student5 = new StudentNode(21, "Alauddin", 17, 'C');
        list.addStudentAtEnd(student5);

        StudentNode student6 = new StudentNode(1, "Birju", 16, 'B');
        list.addStudentAtPosition(student6, 4);

        list.displayStudents();

        list.deleteStudent(18);
        list.displayStudents();

        list.updateStudentGrade(21, 'A');
        list.displayStudents();
    }
}


