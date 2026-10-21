package com.bridgelabz.lambda_expressions.practice_problems;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class FilterEvenNumbers {
    public static List<Integer> findEvenNumbers(List<Integer> list) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        int index = 0;
        while (index < list.size()) {
            if (isEven.negate().test(list.get(index))) {
                list.remove(index);
            }
            else {
                index++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("Enter the total number of elements: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the number " + (i + 1) + ": ");
            int num = scanner.nextInt();
            scanner.nextLine();

            list.add(num);
        }

        System.out.println("Initial List: " + list.toString());
        list = findEvenNumbers(list);
        System.out.println("Even Numbers List: " + list.toString());
    }
}
