package com.bridgelabz.collections.queue_interface;

/*
Program to reverse a queue using Queue interface implementations
 */

import java.util.*;

public class ReverseAQueue {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>(List.of(1, 2, 3, 4, 5));

        System.out.println("Original Queue: " + queue1.toString());

        Deque<Integer> queue2 = new ArrayDeque<>();

        while(!queue1.isEmpty()) {
            queue2.addFirst(queue1.remove());
        }

        System.out.println("Reversed Queue: " + queue2.toString());
    }
}
