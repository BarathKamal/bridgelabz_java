package com.bridgelabz.java_strings.level_2;

import java.util.Scanner;

public class StringLengthProblem {

    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String Index out of bounds error caught and handled");
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.next();

        int lengthUsingLoop = findLength(text);
        int lengthUsingMethod = text.length();

        System.out.println("Length using user-defined method: " + lengthUsingLoop);
        System.out.println("Length using length(): " + lengthUsingMethod);
    }
}
