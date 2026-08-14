package com.bridgelabz.java_control_flows.level_1;

import java.util.Scanner;

public class SumUntil0OrNegativeProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;

        while (true) {
            System.out.println("Enter a number: ");
            double number = scanner.nextDouble();
            if (number <= 0.0) {
                break;
            }
            total += number;
        }

        System.out.println("The total value is " + total);
        scanner.close();
    }
}
