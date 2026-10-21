package com.bridgelabz.lambda_expressions.practice_problems;

import java.util.function.Predicate;

public class PositiveEvenNumber {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = num -> num > 0;
        Predicate <Integer> isEven = num -> num % 2 == 0;

        int inputNum1 = 10;
        int inputNum2 = -2;

        System.out.println("Input Number 1: ");
        System.out.println(isPositive.and(isEven).test(inputNum1));
        System.out.println(isPositive.and(isEven).test(inputNum2));

    }
}
