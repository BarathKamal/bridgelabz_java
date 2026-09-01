package com.bridgelabz.java_uml_diagrams;

import java.util.List;
import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private List<Subject> subjects = new ArrayList<>();

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }


}

class Subject {
    private String name;
    private int score;

    public Subject(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}

class GradeCalculator {
    public static int calculateTotalScore(List<Subject> subjects){
        int total = 0;
        for (Subject subject : subjects) {
            total += subject.getScore();
        }
        return total;
    }

    public static char calculateGrade(Student student) {
        List<Subject> subjects = student.getSubjects();
        int totalScore = calculateTotalScore(subjects);
        int totalSubjects = subjects.size();
        double averageScore = (double) totalScore / totalSubjects;

        if (averageScore > 90) {
            return 'A';
        } else if ((averageScore > 80) && (averageScore <= 90)) {
            return 'B';
        }
        else {
            return 'C';
        }
    }

}
class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Vijay");
        Student student2 = new Student(2, "Ajith");

        Subject subject1 = new Subject("Maths", 100);
        Subject subject2 = new Subject("Physics", 98);

        Subject subject3 = new Subject("Maths", 65);
        Subject subject4 = new Subject("Physics", 70);

        student1.addSubject(subject1);
        student1.addSubject(subject2);

        student2.addSubject(subject3);
        student2.addSubject(subject4);

        char grade1 = GradeCalculator.calculateGrade(student1);
        System.out.println(student1.getName() + " has got " + grade1);
        char grade2 = GradeCalculator.calculateGrade(student2);
        System.out.println(student2.getName() + " has got " + grade2);

    }
}
