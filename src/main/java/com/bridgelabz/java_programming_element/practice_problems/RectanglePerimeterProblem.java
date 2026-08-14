package com.bridgelabz.java_programming_element.practice_problems;

import java.util.Scanner;

public class RectanglePerimeterProblem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle (in cm): ");
        int length = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the width of the rectangle (in cm): ");
        int width = scanner.nextInt();
        scanner.nextLine();

        int perimeter = 2 * (length + width);

        System.out.println("Perimeter of the rectangle (in cms): " + perimeter);

        scanner.close();
    }
}
