package com.bridgelabz.java_arrays.level_2;

import java.util.Scanner;

public class ReverseNumberProblem {
    public static void main(String[] args) {
        /*
        Program to reverse a given number
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int originalNum = scanner.nextInt();
        scanner.nextLine();

        int num = originalNum;
        int[] digitArray = new int[10];
        int index = 0;

        while (num != 0) {
            int digit = num % 10;
            digitArray[index] = digit;
            num /= 10;
            index ++;
        }

        System.out.println("Reversed Number: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digitArray[i]);
        }

        scanner.close();
    }
}
