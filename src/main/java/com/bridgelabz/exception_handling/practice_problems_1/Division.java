package com.bridgelabz.exception_handling.practice_problems_1;

/*
Program to demonstrate unchecked exceptions handling
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // try block generates exception
        try {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            int result = num1 / num2;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) { // catch block handles the exception
            System.out.println("Error: Cannot divide by zero.");

        } catch (InputMismatchException e) { // catch block for different exception
            System.out.println("Error: Please enter numeric values.");
        }

        sc.close();
    }
}
