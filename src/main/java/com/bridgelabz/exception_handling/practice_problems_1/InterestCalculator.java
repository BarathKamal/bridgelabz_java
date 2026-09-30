package com.bridgelabz.exception_handling.practice_problems_1;

/*
Program to demonstrate throw and throws keyword in exception handling
 */
import java.util.Scanner;

public class InterestCalculator {

    // method that throws an exception
    static double calculateInterest(double amount, double rate, int years)
            throws IllegalArgumentException {

        if (amount < 0 || rate < 0 || years < 0) {
            throw new IllegalArgumentException(
                    "Amount, rate and years must be positive");
        }

        return (amount * rate * years) / 100;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter years: ");
        int years = sc.nextInt();

        try {
            double interest = calculateInterest(amount, rate, years);
            System.out.println("Calculated Interest: " + interest);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }

        sc.close();
    }
}
