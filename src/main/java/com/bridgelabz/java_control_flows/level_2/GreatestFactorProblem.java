package com.bridgelabz.java_control_flows.level_2;

import java.util.Scanner;

public class GreatestFactorProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to find the greatest factor: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        int greatestFactor = 1;

        for (int i = num - 1; i > 1; i--) {
            if (num % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        System.out.println("The greatest factor of number " + num + " is " + greatestFactor);

        scanner.close();
    }
}
