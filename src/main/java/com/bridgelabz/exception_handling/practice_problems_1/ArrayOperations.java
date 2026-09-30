package com.bridgelabz.exception_handling.practice_problems_1;

/*
Program to demonstrate multiple catch blocks for different exceptions
 */

import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = null;

        try {
            System.out.print("Enter array size: ");
            int size = sc.nextInt();

            arr = new int[size];

            System.out.println("Enter array elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter index: ");
            int index = sc.nextInt();

            System.out.println("Value at index " + index + ": " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");

        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }

        sc.close();
    }
}
