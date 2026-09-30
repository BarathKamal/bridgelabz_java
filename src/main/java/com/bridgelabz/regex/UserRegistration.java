package com.bridgelabz.regex;

/*
Program to demonstrate Regex expression usage through validating
1. First name, Last name
2. Mobile Number
3. Email
4. Password
with the help of Pattern and Matcher classes
 */

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration {

    public static void validateName(String input) {
        Pattern pattern = Pattern.compile("[A-Z][a-z]{2,}");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Valid Name");
            return;
        }
        System.out.println("Invalid Name");
    }

    public static void validateEmail(String input) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Valid Email");
            return;
        }
        System.out.println("Invalid Email");
    }

    public static void validateMobileNumber(String input) {
        Pattern pattern = Pattern.compile("^91 [6-9][0-9]{9}$");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Valid Mobile Number");
            return;
        }
        System.out.println("Invalid Mobile Number");
    }

    public static void validatePassword(String input) {
        Pattern pattern = Pattern.compile("^(?=.{8,}$)(?=.*[A-Z])(?=.*[0-9])(?=(?:.*[^a-zA-Z0-9]){1}.*$).*$");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Valid Password");
            return;
        }
        System.out.println("Invalid Password");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first name: ");
        String firstName = scanner.nextLine();
        validateName(firstName);

        System.out.println("Enter the last name: ");
        String lastName = scanner.nextLine();
        validateName(lastName);

        System.out.println("Enter the email: ");
        String email = scanner.nextLine();
        validateEmail(email);

        System.out.println("Enter the mobile number: ");
        String mobileNo = scanner.nextLine();
        validateMobileNumber(mobileNo);

        System.out.println("Enter the password: ");
        String password = scanner.nextLine();
        validatePassword(password);
    }
}
