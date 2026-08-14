package com.bridgelabz.java_programming_element.practice_problems;

import java.util.Scanner;

public class ExponentProblem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base number: ");
        double base = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the exponent number: ");
        double exponent = scanner.nextInt();
        scanner.nextLine();

        double result = Math.pow(base, exponent);

        System.out.println(base + " raised to " + exponent + " is " + result);

        scanner.close();
    }
}
