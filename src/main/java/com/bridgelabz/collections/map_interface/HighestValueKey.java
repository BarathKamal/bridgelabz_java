package com.bridgelabz.collections.map_interface;
/*
Program to find the key with the highest value in a hashmap
 */
import java.util.*;

public class HighestValueKey {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        System.out.println(maxKey);
    }
}