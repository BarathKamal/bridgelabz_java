package com.bridgelabz.java_control_flows.level_1;

import java.util.Scanner;

public class FactorialProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int originalNum = scanner.nextInt();
        int num = originalNum;
        scanner.nextLine();

        if (originalNum == 0) {
            System.out.println("Factorial: " + 1);
        }
        else if (originalNum > 0) {

            int factorial = 1;
            while (num > 0) {
                factorial *= num;
                num -= 1;
            }
            System.out.println("Factorial of " + originalNum + " is " + factorial);
        }
        else {
            System.out.println("Enter a valid number");
        }
        scanner.close();
    }
}
