package com.bridgelabz.java_control_flows.level_3;

import java.util.Scanner;

public class NoOfDigitsProblem {
    public static void main(String[] args) {

        /* Program to find the total number of digits of an integer */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int originalNum = scanner.nextInt();
        scanner.nextLine();

        int num = originalNum;
        int noOfDigits = 0;

        while (num != 0) {
            num /= 10;
            noOfDigits += 1;
        }

        System.out.println("The number " + originalNum + " has " + noOfDigits + " digits");
        scanner.close();
    }
}
