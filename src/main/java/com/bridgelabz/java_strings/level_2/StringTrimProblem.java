package com.bridgelabz.java_strings.level_2;

import java.util.Scanner;

public class StringTrimProblem {

    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String createSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    public static boolean compareStrings(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }

        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) != text2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int[] indexes = findTrimIndexes(text);

        String userTrimmed = createSubstring(
                text,
                indexes[0],
                indexes[1]
        );

        String builtInTrimmed = text.trim();

        System.out.println("User-defined trimmed string: [" + userTrimmed + "]");
        System.out.println("Built-in trimmed string: [" + builtInTrimmed + "]");

        System.out.println("Both strings are equal: "
                + compareStrings(userTrimmed, builtInTrimmed));
    }
}
