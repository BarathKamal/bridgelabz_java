package com.bridgelabz.java_arrays.level_1;

import java.util.Scanner;

public class FactorsProblem {
    public static void main(String[] args) {
        /*
        Program to find all the factors of a given number
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        int maxFactor = 10;
        int[] factorsArray = new int[maxFactor];
        int index = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factorsArray[index] = i;
                index++;
            }

            if (index == maxFactor) {
                maxFactor *= 2;
                int[] temp = new int[maxFactor];

                for (int j = 0; j < index; j++) {
                    temp[j] = factorsArray[j];
                }

                factorsArray = temp;
            }
        }

        System.out.println("The factors of the number " + num + " are ");
        for (int i = 0; i < index; i++) {
            System.out.println(factorsArray[i]);
        }

        scanner.close();
    }
}
