package com.bridgelabz.java_programming_element.level_2;

import java.util.Scanner;

public class SwapNumbersProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter num2: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Numbers before swapping: " + num1 + " and " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Numbers after swapping: " + num1 + " and " + num2);

        scanner.close();
    }
}
