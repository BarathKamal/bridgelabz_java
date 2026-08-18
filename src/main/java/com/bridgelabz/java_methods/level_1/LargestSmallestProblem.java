package com.bridgelabz.java_methods.level_1;

import java.util.Scanner;

public class LargestSmallestProblem {
    public static int[] findSmallestAndLargest(int num1, int num2, int num3) {
        int[] nums = new int[3];
        nums[0] = num1;
        nums[1] = num2;
        nums[2] = num3;

        int[] result = {num1, num1};

        for (int i = 1; i < 3; i++) {
            if (nums[i] > result[0]) {
                result[0] = nums[i];
            }
            if (nums[i] < result[1]) {
                result[1] = nums[i];
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();
        scanner.nextLine();

        int [] result = findSmallestAndLargest(num1, num2, num3);

        System.out.println("The largest number: " + result[0]);
        System.out.println("The smallest number: " + result[1]);

        scanner.close();
    }
}
