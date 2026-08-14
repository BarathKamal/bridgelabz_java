package com.bridgelabz.java_programming_element.practice_problems;

import java.util.Scanner;

public class CylinderVolumeProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the cylinder (in cm): ");
        int radius = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the height of the cylinder (in cm): ");
        int height = scanner.nextInt();
        scanner.nextLine();

        final double PI = 22/7.0;
        double volume = PI * Math.pow(radius, 2) * height;

        System.out.println("Volume of the cylinder (in cm^3): " + String.format("%.2f", volume));

        scanner.close();

    }
}
