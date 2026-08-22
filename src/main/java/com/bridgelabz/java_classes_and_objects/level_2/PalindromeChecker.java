package com.bridgelabz.java_classes_and_objects.level_2;

public class PalindromeChecker {
    private String text;
    private boolean result;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public void checkPalindrome() {
        int startIndex = 0;
        int endIndex = text.length() - 1;
        this.result = true;

        for (int i = 0; i < text.length()/2; i++) {
            if (text.charAt(startIndex) != text.charAt(endIndex)) {
                this.result = false;
            }
        }
    }

    public void displayResult() {
        if (result) {
            System.out.println(text + " is a palindrome");
        }
        else {
            System.out.println(text + " is not a palindrome");
        }
    }
}

class PalindromeMain {
    public static void main(String[] args) {
        PalindromeChecker palindromeChecker = new PalindromeChecker("malayalam");
        palindromeChecker.checkPalindrome();
        palindromeChecker.displayResult();

    }
}
