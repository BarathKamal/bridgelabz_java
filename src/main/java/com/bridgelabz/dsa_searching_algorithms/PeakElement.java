package com.bridgelabz.dsa_searching_algorithms;

/*
Program to find a peak element in an array using Binary Search.
A peak element is greater than its neighboring elements.
*/

public class PeakElement {

    // Finds the index of any one peak element.
    public static int findPeak(int[] arr) {

        if (arr == null || arr.length == 0) {
            return -1;
        }

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Avoid possible integer overflow.
            int mid = left + (right - left) / 2;

            /*
             * If the next element is greater,
             * a peak must exist on the right side.
             */
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                /*
                 * If the current element is greater than or equal
                 * to the next element, a peak exists at mid or left.
                 */
                right = mid;
            }
        }

        // left == right, so this index contains a peak.
        return left;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 6, 4, 2};

        int index = findPeak(arr);

        if (index != -1) {
            System.out.println("Peak element: " + arr[index]);
            System.out.println("Peak index: " + index);
        } else {
            System.out.println("Array is empty.");
        }
    }
}
