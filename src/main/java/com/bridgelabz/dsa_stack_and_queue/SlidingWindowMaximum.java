package com.bridgelabz.dsa_stack_and_queue;

/*
Program to find the maximum element in all sliding windows of a given size in an array
 */

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0 || k > nums.length) {
            throw new IllegalArgumentException("Invalid input");
        }

        int[] result = new int[nums.length - k + 1];

        // Deque stores indices of useful elements.
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {

            // Remove indices outside the current window.
            while (!deque.isEmpty() &&
                    deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove smaller elements from the back.
            while (!deque.isEmpty() &&
                    nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }

            // Add the current index.
            deque.offerLast(i);

            // The front always contains the maximum.
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }
}

class SlidingWindowMaximumMain {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] result = SlidingWindowMaximum.maxSlidingWindow(nums, k);

        System.out.println("Array:  " + Arrays.toString(nums));
        System.out.println("Result: " + Arrays.toString(result));
    }
}
