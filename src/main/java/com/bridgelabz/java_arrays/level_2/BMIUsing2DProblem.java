package com.bridgelabz.java_arrays.level_2;

import java.util.Scanner;

public class BMIUsing2DProblem {
    public static void main(String[] args) {
        /*
        Program to find the BMI of a given number of persons using 2D array
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the total number of persons: ");
        int noOfPersons = scanner.nextInt();
        scanner.nextLine();

        double[][] personData = new double[noOfPersons][3];
        String[] status = new String[noOfPersons];

        for (int i = 0; i < noOfPersons; i++) {

            System.out.println("Enter the weight (in kgs) and height (in m) of person  " + (i + 1) + ": ");
            personData[i][0] = scanner.nextDouble();
            personData[i][1] = scanner.nextDouble();
            if  (personData[i][0] < 0 || personData[i][1] < 0) {
                System.err.println("Enter a valid weight and height value");
                System.exit(0);
            }

            double bmiValue = personData[i][0] / Math.pow(personData[i][1], 2);
            personData[i][2] = bmiValue;

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

        System.out.println("\nPeople BMI data: \n");
        for (int i = 0; i < noOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ": ");
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " m");
            System.out.println("BMI: " + String.format("%.2f", personData[i][2]));
            System.out.println("Weight Status: " + status[i]);
            System.out.println();
        }

        scanner.close();
    }
}
