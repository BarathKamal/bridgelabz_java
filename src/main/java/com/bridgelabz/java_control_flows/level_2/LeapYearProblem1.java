package com.bridgelabz.java_control_flows.level_2;

import java.util.Scanner;

public class LeapYearProblem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year to check for leap year: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        if (year >= 1582) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("Year " + year + " is a leap year");
                    }
                    else {
                        System.out.println("Year " + year + " is not a leap year");
                    }
                }
                else {
                    System.out.println("Year " + year + " is a leap year");
                }
            }
            else {
                System.out.println("Year " + year + " is not a leap year");
            }
        }
        else {
            System.out.println("Enter a year above 1582");
        }
        scanner.close();
    }
}
