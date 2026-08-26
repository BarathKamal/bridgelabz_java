package com.bridgelabz.java_keywords.practice_problems;

import java.util.Scanner;

/*
Program to create a Bank Account system and demonstrate the use of java keywords
 */
public class BankAccount {
    // variables declaration
    public static String bankName = "Canara Bank";
    public String accountHolderName;
    public final int accountNumber; // final keyword to avoid changing the accountNumber
    private static int totalAccounts = 0;

    // default constructor
    public BankAccount() {
        this.accountHolderName = "Guest";
        this.accountNumber = 0;
        totalAccounts ++;
    }

    // parameterized constructor
    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts ++;
    }

    // static method to get the total number of accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // instance method to display the account details
    public void displayDetails() {
        System.out.println("Bank Account Details: ");
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
    }
}

class BankAccountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // getting user inputs
        System.out.println("Enter the account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the account holder name: ");
        String accountHolderName = scanner.nextLine();

        // creating BankAccount objects
        BankAccount bankAccount1 = new BankAccount(accountHolderName, accountNumber);
        BankAccount bankAccount2 = new BankAccount();

        // checking whether the object is an instance of the class
        if (bankAccount1 instanceof BankAccount) {
            bankAccount1.displayDetails();
            System.out.println("Total number of bank accounts: " + BankAccount.getTotalAccounts());
        }

        scanner.close();
    }
}
