package com.bridgelabz.java_methods.level_3;

import java.util.Scanner;

public class EuclideanDistanceProblem {

    /*
    Program to calculate the euclidean distance and equation
    of a straight line for given (x1, y1) and (x2, y2) points
     */
    public static double findDistance(double x1, double y1,
                                      double x2, double y2) {

        double distance = Math.sqrt(
                Math.pow(x2 - x1, 2) +
                        Math.pow(y2 - y1, 2)
        );

        return distance;
    }

    public static double[] findLineEquation(double x1, double y1,
                                            double x2, double y2) {

        double m = (y2 - y1) / (x2 - x1);

        double b = y1 - m * x1;

        return new double[]{m, b};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double distance = findDistance(x1, y1, x2, y2);

        double[] equation = findLineEquation(x1, y1, x2, y2);

        double m = equation[0];
        double b = equation[1];

        System.out.println("Euclidean Distance = " + String.format("%.2f", distance));
        System.out.println("Slope (m) = " + m);
        System.out.println("Y-intercept (b) = " + b);

        System.out.println("Equation of line: y = " + m + "x + " + b);
    }
}
