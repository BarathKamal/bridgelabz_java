package com.bridgelabz.java_methods.level_1;

import java.util.Scanner;

public class AthleteProblem {
    public static int calculatePerimeter() {
        Scanner scanner = new Scanner(System.in);

        int perimeter = 0;

        System.out.println("Enter the sides of the triangular path separated by spaces: ");
        for (int i = 0; i < 3; i++) {
            perimeter += scanner.nextInt();
        }

        scanner.close();
        return perimeter;
    }

    public static int calculateNoOfRounds(int perimeter,int targetDistance) {
        int noOfRounds = 0;

        if (perimeter % targetDistance == 0) {
            noOfRounds = targetDistance / perimeter;
        }
        else {
            noOfRounds = (targetDistance / perimeter) + 1;
        }

        return noOfRounds;
    }

    public static void main(String[] args) {

        int targetDistance = 10;
        int perimeter = calculatePerimeter();
        int noOfRounds = calculateNoOfRounds(perimeter, targetDistance);

        System.out.println("The total number of rounds: " + noOfRounds);
    }
}
