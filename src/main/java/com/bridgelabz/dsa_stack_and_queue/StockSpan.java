package com.bridgelabz.dsa_stack_and_queue;

/*
Program to find the span of a stock price array
 */
import java.util.Stack;
import java.util.Arrays;

public class StockSpan {

    public static int[] calculateSpan(int[] prices) {
        if (prices == null) {
            throw new IllegalArgumentException("Prices cannot be null");
        }

        int[] span = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {

            // Remove days whose prices are <= current price.
            while (!stack.isEmpty() &&
                    prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // Calculate span using the nearest greater price.
            span[i] = stack.isEmpty()
                    ? i + 1
                    : i - stack.peek();

            // Store the current day's index.
            stack.push(i);
        }

        return span;
    }
}

class StockSpanMain {
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        int[] span = StockSpan.calculateSpan(prices);

        System.out.println("Prices: " + Arrays.toString(prices));
        System.out.println("Span:   " + Arrays.toString(span));
    }
}
