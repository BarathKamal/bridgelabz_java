package com.bridgelabz.java_programming_element.level_2;

import java.util.Scanner;

public class AthleteProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the side 1 in meters: ");
        int side1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the side 2 in meters: ");
        int side2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the side 3 in meters: ");
        int side3 = scanner.nextInt();
        scanner.nextLine();

        int distance = 5 * 1000;
        int parkLength = side1 + side2 + side3;
        int rounds = distance/parkLength;
        int extraLength = distance % parkLength;

        if (extraLength != 0) {rounds += 1;}

        System.out.println("The athlete needs to complete " + rounds + " rounds to cover " + distance/1000 + " kms");
        scanner.close();

    }
}
