package com.bridgelabz.java_methods.level_2;

import java.util.Scanner;

public class StudentVoteChecker {
    public static boolean canStudentVote(int age) {
        // changed the condition to check different than the question's
        if (age > 0) {
            if (age >= 18) {
                return true;
            }
        }
        else {
            System.err.println("Invalid age");
            System.exit(0);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ageArray = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ageArray[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("Student vote eligibility: \n");

        for (int i = 0; i < 10; i++) {
            boolean eligibleToVote = canStudentVote(ageArray[i]);
            if (eligibleToVote) {
                System.out.println("The student " + (i + 1) + " can vote");
            }
            else {
                System.out.println("The student " + (i + 1) + " cannot vote");
            }
        }

        scanner.close();
    }
}
