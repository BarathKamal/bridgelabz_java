package com.bridgelabz.java_programming_element.level_2;

import java.util.Scanner;
public class SimpleInterestProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Principal amount in INR: ");
        int principal = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the Interest rate in percentage: ");
        int rate = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the Time period in months: ");
        int time = scanner.nextInt();
        scanner.nextLine();

        double simpleInterest = (double) (principal * rate * time) / 100;

        System.out.println("The Simple Interest is INR " + String.format("%.2f", simpleInterest) + " for Principal INR "
        + principal + ", Rate of Interest " + rate + " % and Time " + time + " months");
    }
}
