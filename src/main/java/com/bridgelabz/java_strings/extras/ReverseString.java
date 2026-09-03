package com.bridgelabz.java_strings.extras;

import java.util.Scanner;
/*
Program to reverse a given string
 */
public class ReverseString {

    static String reverse(String str) {
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Reversed String: " + reverse(str));
    }
}
