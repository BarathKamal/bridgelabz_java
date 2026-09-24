package com.bridgelabz.collections.set_interface;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class SetToSortedList {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet(List.of(5, 1, 7, 2, 3));

        System.out.println("Set: " + hashSet.toString());

        List<Integer> list = new ArrayList<>(hashSet);

        Collections.sort(list);

        System.out.println("Sorted List: " + list.toString());
    }
}
