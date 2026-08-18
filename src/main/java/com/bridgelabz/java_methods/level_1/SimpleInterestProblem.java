package com.bridgelabz.java_methods.level_1;

import java.util.Scanner;

public class SimpleInterestProblem {

    public static double calculateSimpleInterest(int principal, int rate, int time) {
        double simpleInterest = (double) (principal*rate*time) / 100;
        return simpleInterest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal amount in INR: ");
        int principal = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the Interest rate: ");
        int rate = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the time period in years: ");
        int time = scanner.nextInt();
        scanner.nextLine();

        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        System.out.println("The simple interest is INR " + String.format("%.2f", simpleInterest) + " for principal INR " + principal
                + ", rate of interest " + rate + " % and time " + time + " years");
        scanner.close();
    }
}
