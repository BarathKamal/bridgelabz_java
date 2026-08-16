package com.bridgelabz.java_control_flows.level_3;

import java.util.Scanner;

public class AbundantNumberProblem {
    public static void main(String[] args) {

        /* Program to find whether the given number is Abundant or not.
        An Abundant number is a number where the sum of its divisors is
        greater than the number itself.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        int sumOfDivisors = 0;
        for (int i = 1; i < num; i++) {
            if  (num % i == 0) {
                sumOfDivisors += i;
            }
        }

        boolean isAbundant = (sumOfDivisors > num) ? true : false;

        System.out.println("Is the number " + num + " Abundant? " + isAbundant);
        scanner.close();
    }
}
