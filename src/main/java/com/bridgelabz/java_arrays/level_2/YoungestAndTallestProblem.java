package com.bridgelabz.java_arrays.level_2;

import java.util.Scanner;

public class YoungestAndTallestProblem {
    public static void main(String[] args) {
        /*
        Program to find the youngest and tallest person among 3 people
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the age of Amar, Akbar and Anthony in order: ");
        int[] ages = new int[3];
        for (int i = 0; i < ages.length; i++) {
            ages[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("Enter the height of Amar, Akbar and Anthony in order: ");
        int[] heights = new int[3];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = scanner.nextInt();
            scanner.nextLine();
        }

        int youngestPerson = 0;
        int tallestPerson = 0;
        for (int i = 0; i < 3; i++) {
            if (ages[i] < ages[youngestPerson]) {
                youngestPerson = i;
            }
            if (heights[i] > heights[tallestPerson]) {
                tallestPerson = i;
            }
        }

        System.out.println("The person " + (youngestPerson + 1) + " is the youngest");
        System.out.println("The person " + (tallestPerson + 1) + " is the tallest");
        scanner.close();
    }
}
