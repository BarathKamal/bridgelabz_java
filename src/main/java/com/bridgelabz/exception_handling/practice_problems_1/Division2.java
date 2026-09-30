package com.bridgelabz.exception_handling.practice_problems_1;

/*
Program to demonstrate the use of finally block in exception handling
 */
import java.util.Scanner;

public class Division2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            int result = num1 / num2;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");

        } finally { // gets executed always
            System.out.println("Operation completed");
        }

        sc.close();
    }
}
