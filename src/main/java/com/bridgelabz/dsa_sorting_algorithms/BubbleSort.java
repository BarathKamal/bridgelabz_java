package com.bridgelabz.dsa_sorting_algorithms;

/*
Program to sort the student marks in ascending order using Bubble sort
 */

import java.util.Arrays;

public class BubbleSort {

    public static void sort(int[] marks) {
        for (int i = 0; i < marks.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < marks.length - 1 - i; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;

                    swapped = true;
                }
            }

            // Stop if the array is already sorted.
            if (!swapped) {
                break;
            }
        }
    }
}

class BubbleSortMain {

    public static void main(String[] args) {
        int[] marks = {75, 92, 68, 85, 60};

        BubbleSort.sort(marks);

        System.out.println("Sorted marks: " + Arrays.toString(marks));
    }
}
