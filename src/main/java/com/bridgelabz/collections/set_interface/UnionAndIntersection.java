package com.bridgelabz.collections.set_interface;

import java.util.Arrays;
import java.util.HashSet;

/*
Program to find the Union and Intersection of two sets
 */
public class UnionAndIntersection {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        HashSet<Integer> union = new HashSet<>(set1);
        HashSet<Integer> intersection = new HashSet<>(set1);

        union.addAll(set2);
        intersection.retainAll(set2);

        System.out.println("Union of set 1 and set 2: " + union);
        System.out.println("Intersection of set 1 and set 2: " + intersection);

    }
}
