package com.bridgelabz.java_methods.level_1;

import java.util.Scanner;

public class ChocolateProblem {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;

        int[] result = new int[2];
        result[0] = quotient;
        result[1] = remainder;

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the total number of children: ");
        int m = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the total number of chocolates: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        int[] result = findRemainderAndQuotient(n, m);

        System.out.println("Chocolates per child: " +  result[0]);
        System.out.println("Remaining chocolates: " +  result[1]);

        scanner.close();
    }
}
