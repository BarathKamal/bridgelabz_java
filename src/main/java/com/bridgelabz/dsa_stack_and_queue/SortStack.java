package com.bridgelabz.dsa_stack_and_queue;

/*
Program to sort a stack using recursion
 */

import java.util.Stack;

public class SortStack {

    public static void sort(Stack<Integer> stack) {
        // Base case: stack is already sorted.
        if (stack.isEmpty()) {
            return;
        }

        int value = stack.pop();

        // Sort the remaining elements recursively.
        sort(stack);

        // Insert the removed element at its correct position.
        insertSorted(stack, value);
    }

    private static void insertSorted(Stack<Integer> stack, int value) {
        // Place value if stack is empty or top is smaller/equal.
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
            return;
        }

        int top = stack.pop();

        insertSorted(stack, value);

        // Restore the removed element.
        stack.push(top);
    }
}

class SortStackMain {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        SortStack.sort(stack);

        System.out.println("Sorted stack: " + stack);
    }
}
