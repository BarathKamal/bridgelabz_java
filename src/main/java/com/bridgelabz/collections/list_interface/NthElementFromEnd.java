package com.bridgelabz.collections.list_interface;

/*
Program to find the nth element from the end of an arraylist
 */

import java.util.ArrayList;
import java.util.List;

public class NthElementFromEnd {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        int n = 2;

        if (n < 0 || n > list.size() - 1) {
            System.out.println("Invalid nth place!");
        }

        int nthLastElement;

        for (int i = 0; i < n - 1; i++) {
            list.removeLast();
        }

        nthLastElement = list.getLast();
        System.out.println("The nth last element (where n = " + n + ") is " + nthLastElement);
    }
}
