package com.bridgelabz.java_control_flows.level_3;

import java.util.Scanner;

public class ArmstrongNumberProblem {
    public static void main(String[]args) {

        /* Program to check if a number is Armstrong or not */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int originalNum = scanner.nextInt();
        scanner.nextLine();

        int numCopy1 = originalNum;
        int numCopy2 = originalNum;
        int sumOfCubes = 0;
        int noOfDigits = 0;

        while (numCopy1 != 0) {
            numCopy1 /= 10;
            noOfDigits += 1;
        }

        while (numCopy2 != 0) {
            int digitValue = numCopy2 % 10;
            sumOfCubes += Math.pow(digitValue, noOfDigits);
            numCopy2 /= 10;
        }

        System.out.println(sumOfCubes);

        if (sumOfCubes == originalNum) {
            System.out.println("The number " + originalNum + " is an Armstrong number");
        }
        else {
            System.out.println("The number " + originalNum + " is not an Armstrong number");
        }
        scanner.close();
    }
}
