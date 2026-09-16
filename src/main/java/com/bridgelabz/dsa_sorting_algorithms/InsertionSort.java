package com.bridgelabz.dsa_sorting_algorithms;

/*
Program to sort employee Ids using Insertion Sort
 */

import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] employeeIds) {
        for (int i = 1; i < employeeIds.length; i++) {
            int key = employeeIds[i];
            int j = i - 1;

            // Shift larger elements to the right.
            while (j >= 0 && employeeIds[j] > key) {
                employeeIds[j + 1] = employeeIds[j];
                j--;
            }

            employeeIds[j + 1] = key;
        }
    }
}

class InsertionSortMain {

    public static void main(String[] args) {
        int[] employeeIds = {105, 101, 108, 103, 102};

        InsertionSort.sort(employeeIds);

        System.out.println("Sorted employee IDs: "
                + Arrays.toString(employeeIds));
    }
}

