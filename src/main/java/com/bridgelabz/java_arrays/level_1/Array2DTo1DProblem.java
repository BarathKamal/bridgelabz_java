package com.bridgelabz.java_arrays.level_1;

import java.util.Scanner;

public class Array2DTo1DProblem {
    public static void main(String[] args) {
        /*
        Program to fill a user structured 2D Array, copy to a 1D array
        and finally display all the elements in the 1D array
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the number of columns: ");
        int columns = scanner.nextInt();
        scanner.nextLine();

        int[][] Array2D = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                System.out.println("Enter the element Array2D[" + (row) + "][" + (col) + "]: ");
                Array2D[row][col] = scanner.nextInt();
                scanner.nextLine();
            }
        }

        int[] Array1D = new int[rows*columns];
        int index = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                Array1D[index] = Array2D[row][col];
                index += 1;
            }
        }

        System.out.println("Elements in 1D Array: ");
        for (int i = 0; i < index; i++) {
            System.out.println("Element " + (i + 1) + " = " + Array1D[i]);
        }

        scanner.close();
    }
}
