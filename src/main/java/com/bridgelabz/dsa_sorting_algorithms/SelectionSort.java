package com.bridgelabz.dsa_sorting_algorithms;

/*
Program to sort the students' exam scored in ascending order using selection sort
 */

import java.util.Arrays;

public class SelectionSort {

    public static void sort(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            int minIndex = i;

            // Find the minimum element in the unsorted part.
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap minimum element with the first unsorted element.
            if (minIndex != i) {
                int temp = scores[i];
                scores[i] = scores[minIndex];
                scores[minIndex] = temp;
            }
        }
    }
}

class SelectionSortMain {

    public static void main(String[] args) {
        int[] scores = {78, 92, 65, 88, 70};

        SelectionSort.sort(scores);

        System.out.println("Sorted exam scores: "
                + Arrays.toString(scores));
    }
}
