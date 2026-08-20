package com.bridgelabz.java_methods.level_3;

import java.util.Scanner;

public class CollinearCheckProblem {
    /*
    Program to check whether 3 points are collinear using
    slope method and area of triangle method
     */
    public static double[] findSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);
        double slopeAC = (double) (y3 - y1) / (x3 - x1);

        return new double[]{slopeAB, slopeBC, slopeAC};
    }

    public static boolean checkCollinearUsingSlope(int x1, int y1, int x2, int y2,
                                                   int x3, int y3) {
        double[] slopes = findSlope(x1, y1, x2, y2, x3, y3);

        return slopes[0] == slopes[1] && slopes[1] == slopes[2];
    }

    public static double findArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        return 0.5 * Math.abs(
                x1 * (y2 - y3) +
                        x2 * (y3 - y1) +
                        x3 * (y1 - y2)
        );
    }

    public static boolean checkCollinearUsingArea(int x1, int y1, int x2, int y2,
                                                  int x3, int y3) {
        double area = findArea(x1, y1, x2, y2, x3, y3);

        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        int x1 = sc.nextInt();

        System.out.print("Enter y1: ");
        int y1 = sc.nextInt();

        System.out.print("Enter x2: ");
        int x2 = sc.nextInt();

        System.out.print("Enter y2: ");
        int y2 = sc.nextInt();

        System.out.print("Enter x3: ");
        int x3 = sc.nextInt();

        System.out.print("Enter y3: ");
        int y3 = sc.nextInt();

        boolean slopeResult = checkCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        boolean areaResult = checkCollinearUsingArea(x1, y1, x2, y2, x3, y3);

        System.out.println("Collinear using slope: " + slopeResult);
        System.out.println("Collinear using area: " + areaResult);
    }
}
