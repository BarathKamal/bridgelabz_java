package com.bridgelabz.dsa_searching_algorithms;

/*
Program to find the index of the smallest element
(rotation point) in a rotated sorted array using Binary Search.
*/

public class RotationPoint {

    // Finds the index of the smallest element.
    public static int findRotationPoint(int[] arr) {

        if (arr == null || arr.length == 0) {
            return -1;
        }

        int left = 0;
        int right = arr.length - 1;

        // Continue until left and right point to the same element.
        while (left < right) {

            // Avoid possible integer overflow.
            int mid = left + (right - left) / 2;

            /*
             * If middle element is greater than the last element,
             * the smallest element must be on the right side.
             */
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                /*
                 * Otherwise, the smallest element is at mid
                 * or somewhere on its left.
                 */
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {

        int[] arr = {15, 18, 2, 3, 6, 12};

        int index = findRotationPoint(arr);

        if (index != -1) {
            System.out.println("Rotation point index: " + index);
            System.out.println("Smallest element: " + arr[index]);
        } else {
            System.out.println("Array is empty.");
        }
    }
}
