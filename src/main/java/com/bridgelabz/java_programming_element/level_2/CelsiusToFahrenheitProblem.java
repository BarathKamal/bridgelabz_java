package com.bridgelabz.java_programming_element.level_2;

import java.util.Scanner;

public class CelsiusToFahrenheitProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature in °C: ");
        int celsius = scanner.nextInt();
        scanner.nextLine();

        double fahrenheitResult = ((double) celsius * 9/5) + 32;

        System.out.println("Fahrenheit = " + String.format("%.2f", fahrenheitResult));

        scanner.close();
    }
}
