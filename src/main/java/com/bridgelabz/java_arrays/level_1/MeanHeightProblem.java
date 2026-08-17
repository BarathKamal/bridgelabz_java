package com.bridgelabz.java_arrays.level_1;

import java.util.Scanner;

public class MeanHeightProblem {
    public static void main(String[] args) {
        /*
        Program to find the sum and the mean of the heights of 11 players
         */
        Scanner scanner = new Scanner(System.in);

        double[] heights = new double[11];
        double sumOfHeights = 0;

        System.out.println("Enter the heights of all the players: ");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        for (double height : heights) {
            sumOfHeights += height;
        }

        double meanOfHeights = sumOfHeights / heights.length;

        System.out.println("Players Details: ");
        System.out.println("Sum of their heights (in cms): " + String.format("%.2f", sumOfHeights) + " cm");
        System.out.println("Mean of their heights (in cms): " + String.format("%.2f", meanOfHeights) + " cm");

        scanner.close();
    }
}
