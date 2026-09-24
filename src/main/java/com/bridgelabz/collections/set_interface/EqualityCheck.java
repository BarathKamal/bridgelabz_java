package com.bridgelabz.collections.set_interface;

/*
Program to check whether two sets are equal without using equals() method
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EqualityCheck {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet(Arrays.asList("Apple", "Banana", "Cat"));
        Set<String> set2 = new HashSet(Arrays.asList("Dog", "Elephant", "Fish"));

        if (set1.size() == set2.size() && set1.containsAll(set2)) {
            System.out.println("Both the sets are equal");
        }
        else {
            System.out.println("Both the sets are not equal");
        }

    }
}
