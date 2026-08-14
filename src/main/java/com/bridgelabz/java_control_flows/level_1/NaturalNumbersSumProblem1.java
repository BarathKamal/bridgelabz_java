package com.bridgelabz.java_control_flows.level_1;

import java.util.Scanner;

public class NaturalNumbersSumProblem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num > 0) {
            int formulaResult = (num * (num+ 1)) / 2;
            int whileResult = 0;
            while (num > 0) {
                whileResult += num;
                num -=1;
            }
            System.out.println("Sum via formula: " + formulaResult);
            System.out.println("Sum via while loop: " + whileResult);
            System.out.println("Are both the results equal? " + (formulaResult == whileResult));
        }
        else {
            System.out.println("Enter a valid natural number");
        }
        scanner.close();
    }
}
