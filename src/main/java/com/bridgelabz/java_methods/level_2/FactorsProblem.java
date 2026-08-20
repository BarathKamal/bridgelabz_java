package com.bridgelabz.java_methods.level_2;

import java.util.Scanner;

public class FactorsProblem {
    public static int[] calculateFactors(int num) {
        int factorsCount = 0;

        for (int i = 1; i <= (num / 2); i++) {
            if (num % i == 0) {
                factorsCount += 1;
            }
        }

        int[] factorArray = new int[factorsCount];
        int index = 0;

        for (int i = 1; i <= (num / 2); i++) {
            if (num % i == 0) {
                factorArray[index] = i;
                index += 1;
            }
        }

        return factorArray;
    }

    public static int calculateSumOfFactors(int[] factorArray) {
        int sumOfFactors = 0;

        for (int i = 0; i < factorArray.length; i++) {
            sumOfFactors += factorArray[i];
        }

        return sumOfFactors;
    }

    public static int calculateProductOfFactors(int[] factorArray) {
        int productOfFactors = 1;

        for (int i = 0; i < factorArray.length; i++) {
            productOfFactors *= factorArray[i];
        }

        return productOfFactors;
    }

    public static int calculateSumOfSquaredOfFactors(int[] factorArray) {
        int sumOfSquares = 0;

        for (int i = 0; i < factorArray.length; i++) {
            sumOfSquares += Math.pow(factorArray[i], 2);
        }

        return sumOfSquares;
    }

    public static void printFactors(int num, int[] factorArray) {
        System.out.println("The factors of the number " + num + " are :");
        for (int i = 0; i < factorArray.length; i++) {
            System.out.print(factorArray[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        int[] factorArray = calculateFactors(num);
        int sumOfFactors = calculateSumOfFactors(factorArray);
        int productOfFactors = calculateProductOfFactors(factorArray);
        int sumOfSquares = calculateSumOfSquaredOfFactors(factorArray);

        printFactors(num, factorArray);
        System.out.print("\nThe sum of the factors are: " + sumOfFactors + "\n");
        System.out.print("The product of the factors are: " + productOfFactors + "\n");
        System.out.print("The sum of squares of the factors are: " + sumOfSquares + "\n");

        scanner.close();
    }
}
