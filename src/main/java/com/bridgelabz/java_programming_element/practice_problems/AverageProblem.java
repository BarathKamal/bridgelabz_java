package com.bridgelabz.java_programming_element.practice_problems;

import java.util.Scanner;

public class AverageProblem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number 1: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the number 2: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the number 3: ");
        int num3 = scanner.nextInt();
        scanner.nextLine();

        double average = (double) (num1 + num2 + num3) / 3;

        System.out.println("Average: " + String.format("%.2f", average));

        scanner.close();
    }
}
