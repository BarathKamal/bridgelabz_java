package com.bridgelabz.java_arrays.level_1;

import java.util.Scanner;

public class PositiveCheckProblem {
    public static void main(String[] args) {
        /*
        Program to check whether a given user number is positive, zero or negative.
        If its is positive, checking whether it is odd or even further.
         */
        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[5];

        System.out.println("Enter 5 space separated numbers: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                if (nums[i] % 2 != 0) {
                    System.out.println("The number " + nums[i] + " is positive and odd");
                }
                else {
                    System.out.println("The number " + nums[i] + " is positive and even");
                }
            }
            else if (nums[i] < 0) {
                System.out.println("The number " + nums[i] + " is negative");
            }
            else {
                System.out.println("The number " + nums[i] + " is zero");
            }
        }

        scanner.close();
    }
}