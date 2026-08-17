package com.bridgelabz.java_arrays.level_1;

import java.util.Scanner;

public class StudentAgeProblem {
    public static void main(String[] args) {
        /*
        Program to check the ages of 10 people for finding the eligibility to vote
         */
        Scanner scanner = new Scanner(System.in);

        int[] age = new int[10];

        System.out.println("Enter the ages of 10 people, separated by spaces: ");
        for (int i = 0; i < age.length; i++) {
            age[i] = scanner.nextInt();
        }

        for (int i = 0; i < age.length; i++) {
            if (age[i] < 0) {
                System.out.println("Invalid Age");
            }
            else if (age[i] >= 18) {
                System.out.println("The person with the age " + age[i] + " can vote");
            }
            else {
                System.out.println("The person with the age " + age[i] + " cannot vote");
            }
        }

        scanner.close();
    }
}
