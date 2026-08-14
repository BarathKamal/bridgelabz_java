package com.bridgelabz.java_programming_element.practice_problems;

import java.util.Scanner;

public class AdditionProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        int addition = num1 + num2;

        System.out.println("Addition of " + num1 + " and " + num2 + " is " + addition);
        scanner.close();
    }
}
