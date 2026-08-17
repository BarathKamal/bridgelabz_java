package com.bridgelabz.java_arrays.level_1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        /*
        Program to display the multiplication table of a given number
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        int[] multiplicationArray = new int[10];

        for (int i = 0; i < multiplicationArray.length; i++) {
            multiplicationArray[i] = (i + 1) * num;
        }

        for (int i = 0; i < multiplicationArray.length; i++) {
            System.out.println((i + 1) + " * " + num + " = " + multiplicationArray[i]);
        }

        scanner.close();
    }
}