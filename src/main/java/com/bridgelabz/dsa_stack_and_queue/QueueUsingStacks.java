package com.bridgelabz.dsa_stack_and_queue;

/*
Program to implement a queue using two stacks
 */

import java.util.Stack;

public class QueueUsingStacks {

    // Stacks declaration using Stack class
    private final Stack<Integer> stack1 = new Stack<>();
    private final Stack<Integer> stack2 = new Stack<>();

    // enqueue operation
    public void enqueue(int value) {
        stack1.push(value);
    }

    // dequeue operation
    public int dequeue() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        // Transfer only when stack2 is empty.
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    // empty queue check
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}

class QueueUsingStacksMain {
    public static void main(String[] args) {

        // Queue initialization
        QueueUsingStacks queue = new QueueUsingStacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        queue.enqueue(40);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
