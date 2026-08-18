package com.bridgelabz.java_methods.level_1;

import java.util.Scanner;

public class MaximumHandshakeProblem {
    public static int calculateHandshakes(int noOfHandshakes) {
        int maxNoOfHandshakes = (noOfHandshakes * (noOfHandshakes - 1)) / 2;
        return maxNoOfHandshakes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int noOfStudents = scanner.nextInt();
        scanner.nextLine();

        int maxNoOfHandshakes = calculateHandshakes(noOfStudents);

        System.out.println("The maximum number of handshakes: " + maxNoOfHandshakes);

        scanner.close();
    }
}
