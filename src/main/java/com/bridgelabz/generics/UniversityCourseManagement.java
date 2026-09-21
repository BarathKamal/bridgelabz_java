package com.bridgelabz.generics;

import java.util.ArrayList;
import java.util.List;

abstract class CourseType {
    private String evaluationName;

    public CourseType(String evaluationName) {
        this.evaluationName = evaluationName;
    }

    public String getEvaluationName() {
        return evaluationName;
    }

    abstract void displayEvaluation();
}

class ExamCourse extends CourseType {

    public ExamCourse() {
        super("Exam-Based");
    }

    public void displayEvaluation() {
        System.out.println("Evaluation: Exam-Based");
    }
}

class AssignmentCourse extends CourseType {

    public AssignmentCourse() {
        super("Assignment-Based");
    }

    public void displayEvaluation() {
        System.out.println("Evaluation: Assignment-Based");
    }
}

class ResearchCourse extends CourseType {

    public ResearchCourse() {
        super("Research-Based");
    }

    public void displayEvaluation() {
        System.out.println("Evaluation: Research-Based");
    }
}


// T is bounded to CourseType.
// Course can therefore work only with valid course types.
class Course<T extends CourseType> {

    private String courseCode;
    private String courseName;
    private T courseType;

    public Course(String courseCode, String courseName, T courseType) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseType = courseType;
    }

    public void displayCourse() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        courseType.displayEvaluation();
        System.out.println("----------------------------");
    }
}


class CourseUtility {

    // ? extends CourseType allows lists containing
    // any subtype of CourseType.
    public static void displayAllCourseTypes(
            List<? extends CourseType> courseTypes) {

        for (CourseType type : courseTypes) {
            type.displayEvaluation();
        }
    }
}


public class UniversityCourseManagement {

    public static void main(String[] args) {

        ExamCourse exam = new ExamCourse();
        AssignmentCourse assignment = new AssignmentCourse();
        ResearchCourse research = new ResearchCourse();

        // T = ExamCourse
        Course<ExamCourse> javaCourse =
                new Course<>("CS101", "Java Programming", exam);

        // T = AssignmentCourse
        Course<AssignmentCourse> dbCourse =
                new Course<>("CS102", "Database Systems", assignment);

        // T = ResearchCourse
        Course<ResearchCourse> aiCourse =
                new Course<>("CS103", "Artificial Intelligence", research);

        javaCourse.displayCourse();
        dbCourse.displayCourse();
        aiCourse.displayCourse();

        // Wildcard method can accept different CourseType lists.
        List<ExamCourse> examCourses = new ArrayList<>();
        examCourses.add(exam);

        CourseUtility.displayAllCourseTypes(examCourses);
    }
}
