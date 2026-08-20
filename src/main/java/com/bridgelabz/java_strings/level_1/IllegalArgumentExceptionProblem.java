package com.bridgelabz.java_strings.level_1;

import java.util.Scanner;

public class IllegalArgumentExceptionProblem {
    public static void generateException() {
        throw new IllegalArgumentException("Illegal Argument Exception demonstration");
    }

    public static  void handleException() {
        try {
            generateException();
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal Argument exception occured");
        } catch (Exception e) {
            System.out.println("Exception occured");
        }
    }

    public static void main(String[] args) {

        handleException();

    }
}