package com.bridgelabz.java_programming_element.level_1;

import java.util.Scanner;

public class HeightProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your height in cms: ");
        double height = scanner.nextDouble();
        scanner.nextLine();

        double inch = height / 2.54;
        int feet = (int) (inch / 12);
        double remainingInch = inch % 12;

        System.out.println("Your Height in cm is " + height + " while in feet and inches is " + feet + " ft " + String.format("%.2f", remainingInch) + " in");

        scanner.close();
    }
}
