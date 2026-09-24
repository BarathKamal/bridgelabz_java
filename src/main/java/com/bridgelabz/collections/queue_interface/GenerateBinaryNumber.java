package com.bridgelabz.collections.queue_interface;

import java.util.Queue;
import java.util.LinkedList;

public class GenerateBinaryNumber {
    public static void main(String[] args) {
        int n = 6;
        Queue<String> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.add(Integer.toBinaryString(i+1));
        }

        System.out.println("Binary numbers till n = " + n + ": ");
        System.out.println(queue.toString());
    }
}
