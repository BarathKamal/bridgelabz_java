package com.bridgelabz.java_constructors.level_2;

/*
Program to
1. Create a BankAccount class with variables accountNumber (public)
accountHolder (protected) and balance (private)
2. Access and Modify the private instance variable
3. Access the public and protected instance variables
 */

public class BankAccount {
    // variable declaration
    public int accountNumber;
    protected String accountHolder;
    private int balance;

    // parameterized constructor
    public BankAccount(int accountNumber, String accountHolder, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // public method to get the balance variable
    public int getBalance() {
        return this.balance;
    }

    // public method to set value to the balance variable
    public void setBalance(int balance) {
        this.balance = balance;
    }
}

// Child class inheriting parent class
class SavingsAccount extends BankAccount {

    // child class constructor
    public SavingsAccount(int accountNumber, String accountHolder, int balance) {
        super(accountNumber, accountHolder, balance);
    }
}

class BankAccountMain {
    public static void main(String[] args) {
        // parent class object creation
        BankAccount account1 = new BankAccount(101, "abc", 1000);

        // accessing private instance variable balance
        int balance = account1.getBalance();
        System.out.println("Existing balance: Rs. " + balance);

        // modifying private instance variable balance
        int newBalance = balance + 1000;
        account1.setBalance(newBalance);
        System.out.println("Updated balance: Rs. " + newBalance);
        System.out.println();

        // child class object creation
        SavingsAccount account2 = new SavingsAccount(102, "def", 500);

        // accessing public and protected instance variables
        System.out.println("Account number: " + account2.accountNumber);
        System.out.println("Account Holder: " + account2.accountHolder);
    }
}
