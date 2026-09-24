package com.bridgelabz.collections.set_interface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/*
Program to check whether a set is a subset of another set
without using containsAll() method
 */

public class SubsetCheck {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(2, 3, 4));

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        Iterator<Integer> iterator = set2.iterator();

        while(iterator.hasNext()) {
            int num = iterator.next(); // Unboxing of Integer wrapper class happens internally

            if (!set1.contains(num)) {
                System.out.println("Set 2 is not a subset of Set 1");
                return;
            }
        }

        System.out.println("Set 2 is a subset of Set 1");
    }
}
