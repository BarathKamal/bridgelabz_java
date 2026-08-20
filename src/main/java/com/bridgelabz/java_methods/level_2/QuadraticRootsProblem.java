package com.bridgelabz.java_methods.level_2;

import java.util.Scanner;

public class QuadraticRootsProblem {
    public static double[] calculateQuadraticRoots(int a, int b, int c) {
        int delta = (int) Math.pow(b , 2) - (4 * a * c);

        if (delta > 0) {
            double[] roots = new double[2];
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            roots[0] = root1;
            roots[1] = root2;

            return roots;
        }

        else if (delta == 0) {
            double[] roots = new double[1];
            double root = (double) -b / (2*a);
            roots[0] = root;

            return roots;
        }

        return new double[0];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter c: ");
        int c = scanner.nextInt();
        scanner.nextLine();

        double[] roots = calculateQuadraticRoots(a, b, c);

        if (roots.length > 0) {
            System.out.println("The roots of the given a, b and c values are: ");
            for (double root : roots) {
                System.out.print(String.format("%.2f", root) + " ");
            }
        }

        else {
            System.out.println("There are no real roots for the given a, b and c values");
        }

        scanner.close();
    }
}
