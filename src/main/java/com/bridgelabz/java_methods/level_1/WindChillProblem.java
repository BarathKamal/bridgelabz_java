package com.bridgelabz.java_methods.level_1;

import java.util.Scanner;

public class WindChillProblem {
    public static double calculateWindChill(double temperature, double windSpeed) {
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature in fahrenheit: ");
        double temperature = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter the wind speed in mph: ");
        double windSpeed = scanner.nextInt();
        scanner.nextLine();

        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.println("Wind Chill for " + temperature + " F and wind speed " + windSpeed + " mph is "+ String.format("%.2f", windChill));
        scanner.close();
    }
}
