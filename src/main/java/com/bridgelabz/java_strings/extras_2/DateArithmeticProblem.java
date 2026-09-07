package com.bridgelabz.java_strings.extras_2;

import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmeticProblem {

    public static LocalDate dateArithmetic(LocalDate date) {
        date = date.plusDays(7);
        date = date.plusMonths(1);
        date = date.plusYears(2);
        date = date.minusWeeks(3);
        return date;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day: ");
        int dayOfMonth = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the month: ");
        int month = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the year: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        LocalDate date = LocalDate.of(year, month, dayOfMonth);
        date = dateArithmetic(date);

        System.out.println("Updated date: " + date.getDayOfMonth() + "-" + date.getMonthValue() + "-" + date.getYear());

        scanner.close();
    }
}
