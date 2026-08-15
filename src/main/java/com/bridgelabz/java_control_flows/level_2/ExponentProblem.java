package com.bridgelabz.java_control_flows.level_2;

import java.util.Scanner;

public class ExponentProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the exponent: ");
        int exponent = scanner.nextInt();
        scanner.nextLine();

        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= num;
        }

        System.out.println(num + " raised to the power " + exponent + " is " + result);
        scanner.close();

    }
}
