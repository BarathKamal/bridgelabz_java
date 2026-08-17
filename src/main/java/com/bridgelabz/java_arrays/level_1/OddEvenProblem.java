package com.bridgelabz.java_arrays.level_1;

import java.util.Scanner;

public class OddEvenProblem {
    public static void main(String[] args) {
        /*
        Program to store the odd and even numbers from the
        user in separate arrays and display them
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the total number of inputs: ");
        int totalNumbers = scanner.nextInt();
        scanner.nextLine();

        if (totalNumbers <= 0) {
            System.err.println("Invalid Number");
            System.exit(0);
        }

//        int sizePerArray = (totalNumbers / 2) + 1;
        int[] odd = new int[totalNumbers];
        int[] even = new int[totalNumbers];
        int oddIndex = 0;
        int evenIndex = 0;

        for (int i = 0; i < totalNumbers; i++) {
            System.out.println("Enter the number " + (i + 1) + ": ");
            int num = scanner.nextInt();
            scanner.nextLine();

            if (num % 2 != 0) {
                odd[oddIndex] = num;
                oddIndex += 1;
            }
            else {
                even[evenIndex] = num;
                evenIndex += 1;
            }
        }

        System.out.println("Numbers in odd array: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.println(odd[i]);
        }

        System.out.println("Numbers in even array: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.println(even[i]);
        }
        scanner.close();
    }
}
