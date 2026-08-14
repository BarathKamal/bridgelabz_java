package com.bridgelabz.java_programming_element.level_2;

import java.util.Scanner;

public class DivisionProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dividend: ");
        int dividend = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the divisor: ");
        int divisor = scanner.nextInt();
        scanner.nextLine();

        if (divisor != 0) {
            int quotient = dividend / divisor;
            int remainder = dividend % divisor;

            System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder
                    + " of two numbers " + dividend + " and " + divisor);
        }

        else {
            System.out.println("0 is Invalid Divisor");
        }
        scanner.close();
    }
}
