package com.bridgelabz.java_control_flows.level_1;

import java.util.Scanner;

public class LargestNumberProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number 1: ");
        double num1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter the number 2: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter the number 3: ");
        double num3 = scanner.nextDouble();
        scanner.nextLine();

        double largest = 0;

        if (num1 >= num2) {
            if (num1 >= num3) {
                largest = num1;
            }
            else {
                largest = num2;
            }
        }
        else if (num2 >= num3) {
            largest = num2;
        }
        else {
            largest = num3;
        }

        System.out.println("Is the first number the largest? " + (num1 == largest));
        System.out.println("Is the second number the largest? " + (num2 == largest));
        System.out.println("Is the third number the largest? " + (num3 == largest));
        scanner.close();
    }
}
