package com.bridgelabz.collections.list_interface;

/*
Program to reverse a list using an arraylist
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ReverseAList {
    public static List<Integer> reverseList(List<Integer> list) {
        int length = list.size();

        for (int i = 0; i < length / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(length - i - 1));
            list.set(length - i - 1, temp);
        }

        return list;
    }

    public static void displayList(List<Integer> list) {
        System.out.println("List: " + list.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("Enter the total number of elements: ");
        int noOfElements = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < noOfElements; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int num = scanner.nextInt();
            scanner.nextLine();

            list.add(num);
        }

        System.out.println("List before reversal: ");
        displayList(list);

        list = reverseList(list);

        System.out.println("List after reversal: ");
        displayList(list);
    }
}
