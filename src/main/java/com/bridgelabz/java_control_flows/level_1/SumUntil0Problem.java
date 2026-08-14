package com.bridgelabz.java_control_flows.level_1;

import java.util.Scanner;

public class SumUntil0Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double number = scanner.nextDouble();
        scanner.nextLine();

        double total = 0;

        while (number != 0.0) {
            total += number;

            System.out.println("Enter a number: ");
            number = scanner.nextDouble();
        }

        System.out.println("The total value is " + total);
        scanner.close();
    }
}
