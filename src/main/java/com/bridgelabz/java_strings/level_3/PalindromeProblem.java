package com.bridgelabz.java_strings.level_3;

import java.util.Scanner;

public class PalindromeProblem {

    public static boolean checkUsingLoop(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static boolean checkUsingRecursion(String text, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return checkUsingRecursion(text, start + 1, end - 1);
    }

    public static char[] reverseString(String text) {
        char[] reverse = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            reverse[i] = text.charAt(text.length() - 1 - i);
        }

        return reverse;
    }

    public static boolean checkUsingArrays(String text) {
        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        System.out.println("Logic 1: " + checkUsingLoop(text));
        System.out.println("Logic 2: " + checkUsingRecursion(text, 0, text.length() - 1));
        System.out.println("Logic 3: " + checkUsingArrays(text));

        sc.close();
    }
}
