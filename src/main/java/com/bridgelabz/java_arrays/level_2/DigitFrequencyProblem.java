package com.bridgelabz.java_arrays.level_2;

import java.util.Scanner;

public class DigitFrequencyProblem {
    public static void main(String[] args) {
        /*
        Program to find the frequency of each digit in a given number
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int originalNum = scanner.nextInt();
        scanner.nextLine();

        int noOfDigits = 0;
        int num = originalNum;

        while (num != 0) {
            num /= 10;
            noOfDigits += 1;
        }

        num = originalNum;
        int[] digitArray = new int[noOfDigits];
        // index is not used

        for (int i = 0; i < noOfDigits; i++) {
            int digit = num % 10;
            digitArray[i] = digit;
            num /= 10;
        }

        int[] freqArray = new int[10];

        for (int i = 0; i < noOfDigits; i++) {
            freqArray[digitArray[i]] += 1;
        }

        System.out.println("Frequency of each digits in the number " + originalNum + " is as follows: ");
        for (int i= 0; i < 10; i++) {
            System.out.println("Frequency of digit " + i + " is " + freqArray[i]);
        }

        scanner.close();
    }
}
