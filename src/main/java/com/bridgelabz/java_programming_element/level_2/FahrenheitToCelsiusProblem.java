package com.bridgelabz.java_programming_element.level_2;

import java.util.Scanner;

public class FahrenheitToCelsiusProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature in °F: ");
        int fahrenheit = scanner.nextInt();
        scanner.nextLine();

        double celsiusResult = (fahrenheit - 32) * (double) 5/9;

        System.out.println("Celsius = " + String.format("%.2f", celsiusResult));

        scanner.close();
    }
}
