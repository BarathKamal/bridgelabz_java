package com.bridgelabz.java_programming_element.level_2;

import java.util.Scanner;

public class DistanceBetweenCitiesProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the from City: ");
        String fromCity = scanner.nextLine();

        System.out.println("Enter the via City: ");
        String viaCity = scanner.nextLine();

        System.out.println("Enter the final City: ");
        String toCity = scanner.nextLine();

        System.out.println("Enter the distance between " + fromCity + " and " + viaCity + " in miles: ");
        double distanceFromToVia = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter the distance between " + viaCity + " and " + toCity + " in miles: ");
        double distanceViaToFinal = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter the time taken from " + fromCity + " to " + viaCity + " in hours: ");
        double timeFromToVia = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter the time taken from " + viaCity + " and " + toCity + " in hours: ");
        double timeViaToFinal = scanner.nextDouble();
        scanner.nextLine();

        double totalDistance = distanceFromToVia + distanceViaToFinal;
        double totalTime = timeFromToVia + timeViaToFinal;

        System.out.println("The Total Distance travelled from " +
                fromCity + " to " + toCity + " via " + viaCity +
                " is " + String.format("%.2f", totalDistance) + " km and " +
                "the Total Time taken is " + String.format("%.2f", totalTime) + " hours");

        scanner.close();
    }
}
