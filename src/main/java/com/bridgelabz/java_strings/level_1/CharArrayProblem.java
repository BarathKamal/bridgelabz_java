package com.bridgelabz.java_strings.level_1;

import java.util.Scanner;

public class CharArrayProblem {
    public static char[] createCharArray(String string) {
        char[] charArray = new char[string.length()];

        for (int i = 0; i < string.length(); i++) {
            charArray[i] = string.charAt(i);
        }

        return charArray;
    }

    public static boolean compareTwoCharArrays(char[] charArray1, char[] charArray2) {

        boolean comparisonResult = true;

        for (int i = 0; i < charArray1.length; i++) {
            if (charArray1[i] != charArray2[i]) {
                comparisonResult = false;
            }
        }

        return comparisonResult;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String string = scanner.next();

        char[] charArray1 = createCharArray(string);
        char[] charArray2 = string.toCharArray();
        boolean comparisonResult = compareTwoCharArrays(charArray1, charArray2);

        if (comparisonResult) {
            System.out.println("Both character arrays are equal");
        }
        else {
            System.out.println("Both character arrays are not equal");
        }

        scanner.close();
    }
}
