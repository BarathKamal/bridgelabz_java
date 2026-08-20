package com.bridgelabz.java_strings.level_1;

import java.util.Scanner;

public class NumberFormatExceptionProblem{
    public static void generateException(String string) {
        int num = Integer.parseInt(string);
    }

    public static  void handleException(String string) {
        try {
            generateException(string);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception occurred");
        } catch (Exception e) {
            System.out.println("Exception occurred");
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
