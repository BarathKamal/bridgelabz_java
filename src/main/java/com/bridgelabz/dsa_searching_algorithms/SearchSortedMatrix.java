package com.bridgelabz.dsa_searching_algorithms;

/*
Program to search for a target value in a 2D sorted matrix
using Binary Search by treating the matrix as a 1D array.
*/

public class SearchSortedMatrix {

    // Searches for the target value in the sorted matrix.
    public static boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0 ||
                matrix[0] == null || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int columns = matrix[0].length;

        int left = 0;
        int right = rows * columns - 1;

        while (left <= right) {

            // Find the middle position in the virtual 1D array.
            int mid = left + (right - left) / 2;

            /*
             * Convert the 1D index into 2D row and column.
             *
             * Example:
             * mid = 5, columns = 3
             * row = 5 / 3 = 1
             * col = 5 % 3 = 2
             */
            int row = mid / columns;
            int col = mid % columns;

            // Get the actual matrix value at this position.
            int middleValue = matrix[row][col];

            if (middleValue == target) {
                return true;
            }

            // Target is smaller, so search the left half.
            if (target < middleValue) {
                right = mid - 1;
            }
            // Target is larger, so search the right half.
            else {
                left = mid + 1;
            }
        }

        // Target was not found.
        return false;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target = 16;

        boolean found = searchMatrix(matrix, target);

        if (found) {
            System.out.println("Target " + target + " found.");
        } else {
            System.out.println("Target " + target + " not found.");
        }
    }
}