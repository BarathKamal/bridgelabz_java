package com.bridgelabz.java_arrays.level_2;

import java.util.Scanner;

public class BMIProblem {
    public static void main(String[] args) {
        /*
        Program to find the BMI of a given number of persons
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the total number of persons: ");
        int noOfPersons = scanner.nextInt();
        scanner.nextLine();

        double[] weight = new double[noOfPersons];
        double[] height = new double[noOfPersons];
        double[] bmi = new double[noOfPersons];
        String[] status = new String[noOfPersons];

        for (int i = 0; i < noOfPersons; i++) {

            System.out.println("Enter the weight (in kgs) and height (in m) of person  " + (i + 1) + ": ");
            weight[i] = scanner.nextDouble();
            height[i] = scanner.nextDouble();

            double bmiValue = weight[i] / Math.pow(height[i], 2);
            bmi[i] = bmiValue;

            if (bmiValue <= 18.4) {
                status[i] = "Underweight";
            }
            else if (bmiValue > 18.4 && bmiValue <= 24.9 ){
                status[i] = "Normal";
            }
            else if (bmiValue > 24.9 && bmiValue <= 39.9){
                status[i] = "Overweight";
            }
            else {
                status[i] = "Obese";
            }
        }

        for (int i = 0; i < noOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ": ");
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.println("Height: " + height[i] + " m");
            System.out.println("BMI: " + String.format("%.2f", bmi[i]));
            System.out.println("Weight Status: " + status[i]);
            System.out.println();
        }

        scanner.close();
    }
}
