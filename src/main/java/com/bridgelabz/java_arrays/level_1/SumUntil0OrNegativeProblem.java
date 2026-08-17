package com.bridgelabz.java_arrays.level_1;

import java.util.Scanner;

public class SumUntil0OrNegativeProblem {
    public static void main(String[] args) {
        /*
        Program that takes input numbers till
        1. The number is not less than or equal to zero
        2. Total input numbers does not exceed 10
        and displays them along with their sum
         */
        Scanner scanner = new Scanner(System.in);

        double[] array = new double[10];
        double total = 0;
        int index = 0;

        while (true) {
            if (index == 10) {
                break;
            }

            System.out.println("Enter a number: ");
            double num = scanner.nextDouble();
            scanner.nextLine();

            if (num <= 0) {
                break;
            }

            array[index] = num;
            total += num;
            index += 1;
        }

        for (int i = 0; i < index; i++) {
            System.out.println("Value " + (i + 1) + " is " + array[i]);
        }
        System.out.println("Total sum of the elements is " + total);

        scanner.close();
    }
}
