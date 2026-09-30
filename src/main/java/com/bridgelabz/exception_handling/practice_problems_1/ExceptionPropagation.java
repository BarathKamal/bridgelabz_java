package com.bridgelabz.exception_handling.practice_problems_1;
/*
Program to demonstrate Exception Propagation using 2 methods
 */
public class ExceptionPropagation {

    static void method1() {
        int result = 10 / 0; // throws excepyion
    }

    static void method2() {
        method1();
    }

    public static void main(String[] args) {

        try {
            method2();
        } catch (ArithmeticException e) { // handles the exception
            System.out.println("Handled exception in main");
        }
    }
}
