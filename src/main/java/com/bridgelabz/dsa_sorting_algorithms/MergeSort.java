package com.bridgelabz.dsa_sorting_algorithms;

/*
Program to sort the prices of the book using Merge Sort
 */

import java.util.Arrays;

public class MergeSort {

    public static void sort(int[] prices) {
        if (prices.length <= 1) {
            return;
        }

        mergeSort(prices, 0, prices.length - 1);
    }

    private static void mergeSort(int[] prices, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(prices, left, mid);
        mergeSort(prices, mid + 1, right);

        merge(prices, left, mid, right);
    }

    private static void merge(int[] prices, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        // Merge both sorted halves.
        while (i <= mid && j <= right) {
            if (prices[i] <= prices[j]) {
                temp[k++] = prices[i++];
            } else {
                temp[k++] = prices[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = prices[i++];
        }

        while (j <= right) {
            temp[k++] = prices[j++];
        }

        for (i = 0; i < temp.length; i++) {
            prices[left + i] = temp[i];
        }
    }
}

class MergeSortMain {

    public static void main(String[] args) {
        int[] prices = {450, 120, 300, 150, 500};

        MergeSort.sort(prices);

        System.out.println("Sorted book prices: "
                + Arrays.toString(prices));
    }
}
