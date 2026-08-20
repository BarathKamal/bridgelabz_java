package com.bridgelabz.java_strings.level_1;

import java.util.Scanner;

public class UppercaseConversionProblem {
    public static String conversionUsingCharAt(String string) {
        String lowerCaseString = "";

        for(int i = 0; i < string.length(); i++) {
            int asciiValue = (int) string.charAt(i);
            if ((asciiValue >= 65) && (asciiValue<= 90)) {
                lowerCaseString += (char) (string.charAt(i) + 32);
            }
            else {
                lowerCaseString += (char) (string.charAt(i));
            }
        }

        return lowerCaseString;
    }

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

        System.out.println("Enter a string: ");
        String string = scanner.nextLine();

        String lowerCaseString1 = conversionUsingCharAt(string);
        System.out.println("Lower case conversion using manual loop and charAt() method: " + lowerCaseString1);

        String lowerCaseString2 = string.toLowerCase();
        System.out.println("Lower case conversion using .toLowerCase() method: " + lowerCaseString2);

        boolean comparisonResult = compareTwoStrings(lowerCaseString1, lowerCaseString2);
        System.out.println("Are " + lowerCaseString1 + " and " + lowerCaseString2 + " the same? " + comparisonResult);

        scanner.close();
    }
}
