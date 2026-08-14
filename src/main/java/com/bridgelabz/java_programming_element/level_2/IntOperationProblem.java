package com.bridgelabz.java_programming_element.level_2;

import java.util.Scanner;

public class IntOperationProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter c: ");
        int c = scanner.nextInt();
        scanner.nextLine();

        int operation1 = a + b * c;
        int operation2 = a * b + c;
        int operation3 = c + a / b;
        int operation4 = a % b + c;

        System.out.println("a + b * c = " + operation1);
        System.out.println("a * b + c = " + operation2);
        System.out.println("c + a / b= " + String.format("%.2f", operation3));
        System.out.println("a % b * c = " + operation4);

        scanner.close();
    }
}
