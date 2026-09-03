package com.bridgelabz.java_strings.extras;

import java.util.Scanner;

/*
Program to remove the duplicate occurrences of a character in a given string
 */
public class RemoveDuplicates {

    static String removeDuplicates(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("After removing duplicates: "
                + removeDuplicates(str));
    }
}
