package com.bridgelabz.java_strings.extras;

import java.util.Scanner;

/*
Program to find the longest word in a given sentence
 */

public class LongestWord {

    static String longestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.println("Longest Word: " + longestWord(sentence));
    }
}
