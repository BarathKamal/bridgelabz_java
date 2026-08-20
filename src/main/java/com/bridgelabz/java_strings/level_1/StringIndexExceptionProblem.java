package com.bridgelabz.java_strings.level_1;

import java.util.Scanner;

public class StringIndexExceptionProblem {
    public static void generateException(String string) {
        char letter = string.charAt(string.length() + 1);
    }

    public static  void handleException(String string) {
        try {
            generateException(string);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index out of bounds exception occured");
        } catch (Exception e) {
            System.out.println("Exception occured");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String string = scanner.nextLine();

        handleException(string);

        scanner.close();
    }
}
