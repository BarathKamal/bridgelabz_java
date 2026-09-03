package com.bridgelabz.java_strings.extras;

import java.util.Scanner;

/*
Program to toggle the case between uppercase and lowercase of a given string
 */

public class ToggleCase {

    static String toggleCase(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32);
            }
            else if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            }
            else {
                result += ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Toggled String: " + toggleCase(str));
    }
}
