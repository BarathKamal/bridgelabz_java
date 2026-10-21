package com.bridgelabz.lambda_expressions.practice_problems;

import java.util.function.Consumer;

public class StudentDetailsProcessor {
    public static void main(String[] args) {
        String inputName = "BridgeLabz";

        Consumer<String> consumer1 = name -> {
            System.out.println("Name in lower case: " + name.toLowerCase());
        };

        Consumer<String> consumer2 = name -> {
            System.out.println("Length of the name: " + name.length());
        };

        consumer1.andThen(consumer2).accept(inputName);
    }
}
