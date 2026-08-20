package com.bridgelabz.java_strings.level_1;

import java.util.Scanner;

public class NullPointerExceptionProblem {
    public static void generateException() {
        String text = null;
        text.length();
    }

    public static  void handleException() {
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception occured");
        } catch (Exception e) {
            System.out.println("Exception occured");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        handleException();

        scanner.close();
    }
}
