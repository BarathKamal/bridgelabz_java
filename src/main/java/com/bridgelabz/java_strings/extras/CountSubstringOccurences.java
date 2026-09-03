package com.bridgelabz.java_strings.extras;

import java.util.Scanner;

/*
Program to count the number of occurrences of a substring in a string
 */
public class CountSubstringOccurences {

    static int countOccurrences(String str, String sub) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String str = sc.nextLine();

        System.out.print("Enter substring: ");
        String sub = sc.nextLine();

        System.out.println("Occurrences: "
                + countOccurrences(str, sub));
    }
}
