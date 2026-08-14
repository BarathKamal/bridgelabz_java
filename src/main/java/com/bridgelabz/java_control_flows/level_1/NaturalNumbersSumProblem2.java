package com.bridgelabz.java_control_flows.level_1;

import java.util.Scanner;

public class NaturalNumbersSumProblem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num > 0) {
            int formulaResult = (num * (num+ 1)) / 2;
            int forResult = 0;
            for (int i = 1; i <= num; i++) {
                forResult += i;
            }
            System.out.println("Sum via formula: " + formulaResult);
            System.out.println("Sum via for loop: " + forResult);
            System.out.println("Are both the results equal? " + (formulaResult == forResult));
        }
        else {
            System.out.println("Enter a valid natural number");
        }
        scanner.close();
    }
}