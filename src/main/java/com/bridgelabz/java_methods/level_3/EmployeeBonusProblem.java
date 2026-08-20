package com.bridgelabz.java_methods.level_3;

import java.util.Scanner;

public class EmployeeBonusProblem {

    public static double[][] generateEmployeeData(int numberOfEmployees) {
        double[][] employees = new double[numberOfEmployees][2];

        for (int i = 0; i < numberOfEmployees; i++) {
            employees[i][0] = (int) (Math.random() * 90000) + 10000;
            employees[i][1] = (int) (Math.random() * 11);
        }

        return employees;
    }

    public static double[][] calculateBonus(double[][] employees) {
        double[][] result = new double[employees.length][2];

        for (int i = 0; i < employees.length; i++) {
            double salary = employees[i][0];
            double years = employees[i][1];

            double bonusRate;

            if (years > 5) {
                bonusRate = 0.05;
            } else {
                bonusRate = 0.02;
            }

            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;

            result[i][0] = newSalary;
            result[i][1] = bonus;
        }

        return result;
    }

    public static double[] calculateTotals(double[][] employees, double[][] result) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        for (int i = 0; i < employees.length; i++) {
            totalOldSalary += employees[i][0];
            totalNewSalary += result[i][0];
            totalBonus += result[i][1];
        }

        return new double[]{totalOldSalary, totalNewSalary, totalBonus};
    }

    public static void displayData(double[][] employees, double[][] result) {
        System.out.println("Employee\tYears\tOld Salary\tBonus\t\tNew Salary");

        for (int i = 0; i < employees.length; i++) {
            System.out.println(
                    (i + 1) + "\t\t" +
                            (int) employees[i][1] + "\t" +
                            employees[i][0] + "\t" +
                            result[i][1] + "\t" +
                            result[i][0]
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int numberOfEmployees = sc.nextInt();

        double[][] employees = generateEmployeeData(numberOfEmployees);

        double[][] result = calculateBonus(employees);

        double[] totals = calculateTotals(employees, result);

        displayData(employees, result);

        System.out.println("\nTotal Old Salary = " + totals[0]);
        System.out.println("Total New Salary = " + totals[1]);
        System.out.println("Total Bonus = " + totals[2]);
    }
}
