package com.bridgelabz.java_control_flows.level_2;

import java.util.Scanner;

public class StudentGradeProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the marks in maths: ");
        int maths = scanner.nextInt();

        System.out.println("Enter the marks in physics: ");
        int physics = scanner.nextInt();

        System.out.println("Enter the marks in chemistry: ");
        int chemistry = scanner.nextInt();

        double average = (double) (maths + physics + chemistry) / 3;
        char grade = '\u0000';
        String remarks = null;

        if (average >= 80) {
            grade = 'A';
            remarks = "Level 4, above agency-normalized standards";
        }
        else if (average < 79 && average >= 70) {
            grade = 'B';
            remarks = "Level 3, at agency-normalized standards";
        }
        else if (average < 69 && average >= 60) {
            grade = 'C';
            remarks = "Level 2, below, but approaching agency-normalized standards";
        }
        else if (average < 59 && average >= 50) {
            grade = 'D';
            remarks = "Level 1, well below agency-normalized standards";
        }
        else if (average < 49 && average >= 40) {
            grade = 'E';
            remarks = "Level 1-, too below agency-normalized standards";
        }
        else {
            grade = 'R';
            remarks = "Remedial standards";
        }

        System.out.println("Average Marks: " + String.format("%.2f", average));
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        scanner.close();
    }
}
