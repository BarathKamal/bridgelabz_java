package com.bridgelabz.lambda_expressions.practice_problems;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.List;
import java.util.ArrayList;

public class PrintElements {
    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        Consumer<List<Integer>> printList = list -> {
            for (int num : list) {
                System.out.println(num);
            }
        };

        printList.accept(inputList);
    }
}
