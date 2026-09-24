package com.bridgelabz.collections.map_interface;
/*
Program to invert a map (keys to values and values to keys)
 */
import java.util.*;

public class InvertAMap {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);

        Map<Integer, List<String>> invertedMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            String key = entry.getKey();
            Integer value = entry.getValue();

            invertedMap
                    .computeIfAbsent(value, k -> new ArrayList<>())
                    .add(key);
        }

        System.out.println(invertedMap);
    }
}
