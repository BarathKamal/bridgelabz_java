package com.bridgelabz.java_strings.level_2;

import java.util.Scanner;

public class StringWordLengthProblem {

    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }

        return count;
    }

    public static String[] splitWords(String text) {
        int length = findLength(text);
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index] = i;
                index++;
            }
        }

        String[] words = new String[wordCount];

        int start = 0;

        for (int i = 0; i < spaceIndexes.length; i++) {
            int end = spaceIndexes[i];
            String word = "";

            for (int j = start; j < end; j++) {
                word += text.charAt(j);
            }

            words[i] = word;
            start = end + 1;
        }

        String lastWord = "";

        for (int i = start; i < length; i++) {
            lastWord += text.charAt(i);
        }

        words[wordCount - 1] = lastWord;

        return words;
    }

    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] result = getWordLengths(words);

        System.out.println("\nWord\tLength");

        for (int i = 0; i < result.length; i++) {
            int length = Integer.parseInt(result[i][1]);

            System.out.println(result[i][0] + "\t" + length);
        }
    }
}
