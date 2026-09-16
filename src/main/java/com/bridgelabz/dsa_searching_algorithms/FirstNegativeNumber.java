package com.bridgelabz.dsa_searching_algorithms;

/*
Program to find the index of the first negative number
in an integer array using Linear Search.
*/

public class FirstNegativeNumber {

    // Performs linear search to find the first negative number.
    public static int findFirstNegative(int[] arr) {

        // Traverse the array from the beginning.
        for (int i = 0; i < arr.length; i++) {

            // Check whether the current element is negative.
            if (arr[i] < 0) {
                return i;
            }
        }

        // Return -1 if no negative number is found.
        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 25, 8, -5, 12, -9};

        int index = findFirstNegative(numbers);

        if (index != -1) {
            System.out.println("First negative number: " + numbers[index]);
            System.out.println("Index: " + index);
        } else {
            System.out.println("No negative number found.");
        }
    }
}
