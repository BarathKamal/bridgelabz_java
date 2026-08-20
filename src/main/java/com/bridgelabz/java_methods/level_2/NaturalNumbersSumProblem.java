package com.bridgelabz.java_methods.level_2;

import java.util.Scanner;

public class NaturalNumbersSumProblem {
    public static int calculateSumUsingRecursion(int num) {
        if (num == 1) {
            return num;
        }

        int sumUsingRecursion = num + calculateSumUsingRecursion(num - 1);

        return sumUsingRecursion;
    }

    public static int calculateSumUsingFormula(int num) {
        int sumUsingFormula = (num * (num + 1)) / 2;

        return sumUsingFormula;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        int sumUsingRecursion = 0;
        int sumUsingFormula = 0;
        if (num > 0) {
            sumUsingRecursion = calculateSumUsingRecursion(num);
            sumUsingFormula = calculateSumUsingFormula(num);
            System.out.println("The sum of " + num + " natural numbers using recursion is " + sumUsingRecursion);
            System.out.println("The sum of " + num + " natural numbers using formula is " + sumUsingFormula);
            System.out.println("Are both the sum equal? " + (sumUsingRecursion == sumUsingFormula));
        }

        else {
            System.err.println("Invalid natural number");
            System.exit(0);
        }

        scanner.close();
    }
}
