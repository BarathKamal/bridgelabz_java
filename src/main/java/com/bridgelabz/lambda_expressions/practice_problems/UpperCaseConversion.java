package com.bridgelabz.lambda_expressions.practice_problems;

import java.util.function.Function;

public class UpperCaseConversion {
    public static void main(String[] args) {

        Function<String, String> toUpperCase = (String string) -> string.toUpperCase();

        String input = "hello world";
        String result = toUpperCase.apply(input);

        System.out.println(result);
    }
}

