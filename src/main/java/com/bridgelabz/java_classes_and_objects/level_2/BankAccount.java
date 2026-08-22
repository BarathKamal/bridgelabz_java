package com.bridgelabz.java_classes_and_objects.level_2;

public class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountHolder, int accountNumber, int balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (balance > amount) {
            balance -= amount;
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance (in Rs.): " + balance);
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Josh alauddin", 672534, 54600);
        account.deposit(10000);
        account.displayDetails();
    }
}
