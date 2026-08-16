package com.bridgelabz.java_control_flows.level_1;

import java.util.Scanner;

public class SpringSeasonProblem {
    public static void main(String[] args) {
        /* Program to check whether the give date is spring season */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the month in numerical value: ");
        int month = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the day: ");
        int day = scanner.nextInt();
        scanner.nextLine();

        if (month > 0 && month <= 12) {
            boolean isSpringSeason = false;

            if (month >= 3 && month <= 6) {
                if (month == 3 && (day >= 20 && day <= 31)) {
                    isSpringSeason = true;
                }
                if (month == 4 || month == 5) {
                    isSpringSeason = true;
                }
                if (month == 6 && (day >= 1 && day <= 20)) {
                    isSpringSeason = true;
                }
            }
            if (isSpringSeason) {
                System.out.println("Day " + day + " of month " + month + " is a Spring Season" );
            }
            else {
                System.out.println("Day " + day + " of month " + month + " is not a Spring Season" );
            }
        }
        else {
            System.out.println("Enter a valid month");
        }

        scanner.close();

    }
}
