package com.bridgelabz.java_strings.level_3;

import java.util.Scanner;

public class UniqueCharacterProblem {

    public static int findLength(String text) {
        int length = 0;

        for (char c : text.toCharArray()) {
            length++;
        }

        return length;
    }

    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] unique = new char[length];
        int count = 0;

        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                unique[count++] = current;
            }
        }

        char[] result = new char[count];

        for (int i = 0; i < count; i++) {
            result[i] = unique[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] result = findUniqueCharacters(text);

        System.out.println("Unique characters:");

        for (char c : result) {
            System.out.print(c + " ");
        }

        sc.close();
    }
}
