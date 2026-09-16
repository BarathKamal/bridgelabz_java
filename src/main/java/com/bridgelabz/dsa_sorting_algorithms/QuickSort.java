package com.bridgelabz.dsa_sorting_algorithms;

/*
Program to sort the produce prices in an e-commerce company using quick sort
 */

import java.util.Arrays;

public class QuickSort {

    public static void sort(int[] prices) {
        if (prices.length <= 1) {
            return;
        }

        quickSort(prices, 0, prices.length - 1);
    }

    private static void quickSort(int[] prices, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivotIndex = partition(prices, low, high);

        quickSort(prices, low, pivotIndex - 1);
        quickSort(prices, pivotIndex + 1, high);
    }

    private static int partition(int[] prices, int low, int high) {
        // Use the last element as the pivot.
        int pivot = prices[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (prices[j] <= pivot) {
                i++;

                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }
}

class QuickSortMain {

    public static void main(String[] args) {
        int[] prices = {999, 250, 750, 100, 500};

        QuickSort.sort(prices);

        System.out.println("Sorted product prices: "
                + Arrays.toString(prices));
    }
}