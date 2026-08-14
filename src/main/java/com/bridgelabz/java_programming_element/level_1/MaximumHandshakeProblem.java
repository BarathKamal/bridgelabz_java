package com.bridgelabz.java_programming_element.level_1;

import java.util.Scanner;

public class MaximumHandshakeProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int noOfStudents = scanner.nextInt();
        scanner.nextLine();

        int maxHandShakes = (noOfStudents * (noOfStudents - 1)) / 2;

        System.out.println("The total number of handshakes possible is " + maxHandShakes);

        scanner.close();
    }

}
