package com.bridgelabz.java_control_flows.level_1;

import java.util.Scanner;

public class NaturalNumberSumProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a natural number: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num >= 0) {
            int numSum = num * (num + 1) / 2;
            System.out.println("The sum of " + num + " natural numbers is " + numSum);
        }
        else {
            System.out.println("The number " + num + " is not a natural number");
        }
        scanner.close();
    }
}
