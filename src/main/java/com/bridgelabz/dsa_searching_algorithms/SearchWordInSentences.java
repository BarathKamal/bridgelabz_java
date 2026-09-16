package com.bridgelabz.dsa_searching_algorithms;

/*
Program to find the first sentence containing a specific word
using Linear Search.
*/

public class SearchWordInSentences {

    // Searches for the first sentence containing the given word.
    public static String findSentence(String[] sentences, String word) {

        // Traverse each sentence from the beginning.
        for (String sentence : sentences) {

            // Check whether the sentence contains the given word.
            if (sentence.contains(word)) {
                return sentence;
            }
        }

        // Return "Not Found" if no sentence contains the word.
        return "Not Found";
    }

    public static void main(String[] args) {

        String[] sentences = {
                "Java is a powerful programming language.",
                "Python is easy to learn.",
                "Java is widely used for backend development.",
                "C++ is commonly used for system programming."
        };

        String word = "Java";

        String result = findSentence(sentences, word);

        System.out.println("Search word: " + word);
        System.out.println("Result: " + result);
    }
}