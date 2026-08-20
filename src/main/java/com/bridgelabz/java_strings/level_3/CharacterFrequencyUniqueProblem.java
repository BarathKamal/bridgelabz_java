package com.bridgelabz.java_strings.level_3;

import java.util.Scanner;

public class CharacterFrequencyUniqueProblem {

    public static char[] findUniqueCharacters(String text) {
        char[] unique = new char[text.length()];
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
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

    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        char[] unique = findUniqueCharacters(text);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(frequency[unique[i]]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = findFrequency(text);

        System.out.println("Character\tFrequency");

        for (String[] row : result) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }

        sc.close();
    }
}
