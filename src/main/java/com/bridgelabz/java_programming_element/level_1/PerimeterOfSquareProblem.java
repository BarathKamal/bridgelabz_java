package com.bridgelabz.java_programming_element.level_1;

import java.util.Scanner;
public class PerimeterOfSquareProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double perimeter = scanner.nextDouble();
        scanner.nextLine();

        double side = perimeter/4;

        System.out.println("The length of the side is " + String.format("%.2f", side) +
                " whose perimeter is " + perimeter);
    }


}
