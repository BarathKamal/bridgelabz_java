package com.bridgelabz.java_strings.level_1;

import java.util.Scanner;

public class StringComparisonProblem {
    public static boolean compareTwoStrings (String str1, String str2) {
        boolean comparisonUsingCharAt = true;

        for (int i = 0; i < str1.length() ; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                comparisonUsingCharAt = false;
                break;
            }
        }

        return comparisonUsingCharAt;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string 1: ");
        String str1 = scanner.nextLine();

        System.out.println("Enter the string 2: ");
        String str2 = scanner.nextLine();

        boolean comparisonUsingCharAt = compareTwoStrings(str1, str2);
        System.out.println("Are " + str1 + " and " + str2 + " the same using ChartAt() comparison? " + comparisonUsingCharAt );

        boolean comparisonUsingEquals = str1.equals(str2);
        System.out.println("Are " + str1 + " and " + str2 + " the same using .equals() comparison? " + comparisonUsingCharAt );

        if (comparisonUsingCharAt == comparisonUsingEquals) {
            System.out.println("Both the result are same");
        }

        scanner.close();
    }
}
