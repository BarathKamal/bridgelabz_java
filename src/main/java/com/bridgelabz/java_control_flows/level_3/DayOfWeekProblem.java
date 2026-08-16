package com.bridgelabz.java_control_flows.level_3;

import java.util.Scanner;

public class DayOfWeekProblem {
    public static void main(String [] args) {

        /*
        Program to find the weekday of a particular date in the gregorian calendar
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the month in numerical value: ");
        int month = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the day: ");
        int day = scanner.nextInt();
        scanner.nextLine();

        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4- y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + 31*m0 / 12) % 7;

        System.out.println("Day of the week in number where 0 is Sunday and 7 is Saturday is " + d0);

        scanner.close();
    }
}
