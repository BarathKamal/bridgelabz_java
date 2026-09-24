package com.bridgelabz.collections.list_interface;

/*
Program to rotate the given array by a given number of places
without using Collections.rotate()
 */

import java.util.List;
import java.util.ArrayList;

public class RotateElements {
    public static List<Integer> rotate(List<Integer> list, int rotatePlace) {
        int length = list.size();

        // temporary storage of elements that goes to back of the array
        List<Integer> list2 = new ArrayList<>(list.subList(0, rotatePlace));

        // rotating elements to the left
        for (int i = rotatePlace; i < length; i++) {
            list.set(i - rotatePlace, list.get(i));
        }

        // adding the remaining elements that came to back of the array
        for (int i = length - rotatePlace; i < length; i++){
            list.set(i, list2.get(i - (length - rotatePlace)));
        }

        return list;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        int rotatePlace = 3;

        if (rotatePlace > list.size() - 1) {
            System.out.print("Enter a valid rotate place number");
            return;
        }

        System.out.println("Original List: " + list.toString());
        list = rotate(list, rotatePlace);
        System.out.println("Rotated List: " + list.toString());
    }
}
