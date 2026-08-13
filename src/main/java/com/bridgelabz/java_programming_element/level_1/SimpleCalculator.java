package com.bridgelabz.java_programming_element.level_1;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        double firstNumber = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter number 2: ");
        double secondNumber = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter the case number as follows");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");

        int choice = scanner.nextInt();
        scanner.nextLine();

        double result;

        switch (choice) {
            case 1:
                result = firstNumber + secondNumber;
                System.out.println("Addition of " + firstNumber + " and " + secondNumber + " is " + result);
                break;
            case 2:
                result = firstNumber - secondNumber;
                System.out.println("Subtraction of " + firstNumber + " and " + secondNumber + " is " + result);
                break;
            case 3:
                result = firstNumber * secondNumber;
                System.out.println("Multiplication of " + firstNumber + " and " + secondNumber + " is " + String.format("%.2f", result));
            case 4:
                result = firstNumber / secondNumber;
                System.out.println("Division of " + firstNumber + " and " + secondNumber + " is " + String.format("%.2f", result));
                break;
            default:
                System.out.println("Enter a valid case");
        }

        scanner.close();
    }
}
