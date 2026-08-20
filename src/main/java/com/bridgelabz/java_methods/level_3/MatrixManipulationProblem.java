package com.bridgelabz.java_methods.level_3;

import java.util.Scanner;

public class MatrixManipulationProblem {
    public static int[][] generateMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j= 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }

        return matrix;
    }
    public static int[][] matrixAddition(int[][] matrix1, int[][] matrix2){
        int rows = matrix1.length;
        int columns = matrix1[0].length;

        int[][] finalMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j= 0; j < columns; j++) {
                finalMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return finalMatrix;
    }

    public static int[][] matrixSubtraction(int[][] matrix1, int[][] matrix2){
        int rows = matrix1.length;
        int columns = matrix1[0].length;

        int[][] finalMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j= 0; j < columns; j++) {
                finalMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return finalMatrix;
    }

    public static int[][] matrixMultiplication(int[][] matrix1, int[][] matrix2) {

        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;

        int rows2 = matrix2.length;
        int columns2 = matrix2[0].length;

        int[][] finalMatrix = new int[rows1][columns2];

        if (columns1 == rows2) {
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns2; j++) {
                    for (int k = 0; k < rows2; k++) {
                        finalMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
        }
        else {
            System.out.println("Matrix Multiplication is not possible");
        }

        return finalMatrix;
    }

    public static int[][] matrixTranspose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transposeMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }

        return transposeMatrix;
    }

    public static int matrixDeterminant(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int determinant = 0;

        if (rows == columns) {
            if (rows == 2) {
                determinant = matrix[0][0]*matrix[1][1] + matrix[0][1]*matrix[1][0];
            }
            else if (rows == 3) {
                determinant = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                        - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                        + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
            }
            else {
                System.out.println("Invalid Square matrix! try with a 2x32 or 3x3 square matrix");
            }
        }
        else {
            System.out.println("Invalid matrix! try a square matrix of size 2x2 or 3x3");
        }
        return determinant;
    }

    public static void displayMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
                if (j == columns - 1) {
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the no of rows: ");
        int rows = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the no of columns: ");
        int columns = scanner.nextInt();
        scanner.nextLine();

        int[][] matrix1 = generateMatrix(rows, columns);
        int[][] matrix2 = generateMatrix(rows, columns);

        System.out.println("Matrix 1: ");
        displayMatrix(matrix1);

        System.out.println("Matrix 2: ");
        displayMatrix(matrix2);

        int[][] addition = matrixAddition(matrix1, matrix2);
        System.out.println("Matrix addition: ");
        displayMatrix(addition);

        int[][] subtraction = matrixSubtraction(matrix1, matrix2);
        System.out.println("Matrix subtraction: ");
        displayMatrix(subtraction);

        int[][] multiplication = matrixMultiplication(matrix1, matrix2);
        System.out.println("Matrix Multiplication: ");
        displayMatrix(multiplication);

        int[][] transpose = matrixTranspose(matrix1);
        System.out.println("Matrix Transpose: ");
        displayMatrix(transpose);

        int determinant = matrixDeterminant(matrix1);
        System.out.println("Matrix determinant: " + determinant);

        scanner.close();
    }
}
