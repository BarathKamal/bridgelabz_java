package com.bridgelabz.java_methods.level_2;

import java.util.Scanner;

public class UnitConvertor {
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        double miles = km * km2miles;
        return miles;
    }
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        double km = miles * miles2km;
        return km;
    }
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        double feet  = meters * meters2feet;
        return feet;
    }
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        double meters = feet * feet2meters;
        return meters;
    }

    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        double feet = yards * yards2feet;
        return feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        double yards = feet * feet2yards;
        return yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        double inches = meters * meters2inches;
        return inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        double meters = inches * inches2meters;
        return meters;
    }

    public static double convertInchesToCentiMeters(double inches) {
        double inches2cm = 2.54;
        double cm = inches * inches2cm;
        return cm;
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//
//
//        scanner.close();
//    }
}
