package com.bridgelabz.lambda_expressions.practice_problems;

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class CalculatorProblem {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator multiply = (a, b) -> a*b;

        System.out.println("Addition: " + add.calculate(num1, num2));
        System.out.println("Subtraction: " + subtract.calculate(num1, num2));
        System.out.println("Multiply: " + multiply.calculate(num1, num2));
    }
}
