package com.bridgelabz.java_strings.level_1;

import java.util.Scanner;

public class SubstringProblem {
    public static String substringUsingCharAt(String string, int beginIndex, int endIndex) {
        String substring = "";

        for (int i = beginIndex; i < endIndex; i++) {
            substring += string.charAt(i);
        }

        return substring;
    }

    public static String substringUsingSubstring(String string, int beginIndex, int endIndex) {

        String substring = string.substring(beginIndex, endIndex);

        return substring;
    }

    public static boolean compareTwoStrings(String string1, String string2) {

        boolean comparisonResult = true;

        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) != string2.charAt(i)) {
                comparisonResult = false;
            }
        }

        return comparisonResult;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String string = scanner.next();

        System.out.println("Enter the begin index: ");
        int beginIndex = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the end index: ");
        int endIndex = scanner.nextInt();
        scanner.nextLine();

        String substring1 = substringUsingCharAt(string, beginIndex, endIndex);
        String substring2 = substringUsingSubstring(string, beginIndex, endIndex);
        boolean comparisonResult = compareTwoStrings(substring1, substring2);

        if (comparisonResult) {
            System.out.println(substring1 + " and " + substring2 + " are the same");
        }
        else {
            System.out.println(substring1 + " and " + substring2 + " are not the same");
        }

        scanner.close();
    }
}
