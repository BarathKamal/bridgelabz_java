package com.bridgelabz.java_control_flows.level_1;

import java.util.Scanner;

public class PositiveNumberCheckProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("Positive");
        }
        else if (num < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }

        scanner.close();
    }
}
