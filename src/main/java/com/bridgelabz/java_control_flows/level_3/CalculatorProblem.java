package com.bridgelabz.java_control_flows.level_3;

import java.util.Scanner;

public class CalculatorProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Program to create a simple calculator for basic arithmetic operations
        +, -, * and / using switch statement
        */

        System.out.println("Enter the first number: ");
        double firstNum = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the second number: ");
        double secondNum = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Choose the operation from the following options: ");
        System.out.println("Type '+' for Addition");
        System.out.println("Type '-' for Subtraction");
        System.out.println("Type '*' for Multiplication");
        System.out.println("Type '/' for Division");
        String choice = scanner.nextLine();

        double result = 0;
        String operation = "";

        switch (choice) {

            case "+":
                result = firstNum + secondNum;
                operation = "Addition";
                break;

            case "-":
                result = firstNum - secondNum;
                operation = "Subtraction";
                break;

            case "*":
                result = firstNum * secondNum;
                operation = "Multiplication";
                break;

            case "/":
                result = firstNum / secondNum;
                operation = "Division";
                break;

            default:
                System.out.println("Enter a valid option");
        }

        System.out.println(operation + " of " + firstNum + " and " + secondNum + " is " + String.format("%.2f", result));
        scanner.close();
    }
}
