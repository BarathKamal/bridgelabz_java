package com.bridgelabz.java_oop_core;
/*
Program to demonstrate inheritance, abstraction, encapsulation and polymorphism using a Banking System Scenario
 */

// Loanable interface
interface Loanable {
    void applyForLoan();
    boolean calculateLoanEligibility();
}

// Abstraction
abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Encapsulation: controlled access to account details
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Abstract method
    public abstract double calculateInterest();
}

// subclass SavingsAccount extending the superclass BankAccount and implementing the interface
class SavingsAccount extends BankAccount implements Loanable {

    private double interestRate = 4.0;

    public SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    // method overriding
    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    // method overriding (here, implementation of method declared in interface)
    @Override
    public void applyForLoan() {
        System.out.println("Savings account loan application submitted.");
    }

    // method overriding (here, implementation of method declared in interface)
    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000;
    }
}

// subclass extending superclass as well as implementation an interface
class CurrentAccount extends BankAccount implements Loanable {

    private double interestRate = 2.0;

    public CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    // super class method overriding
    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    // interface method overriding
    @Override
    public void applyForLoan() {
        System.out.println("Current account loan application submitted.");
    }

    // interface method overriding
    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 25000;
    }
}


public class BankingSystem {

    public static void main(String[] args) {

        // Polymorphism
        BankAccount savingsAccount =
                new SavingsAccount(101, "Virat", 50000);

        BankAccount currentAccount =
                new CurrentAccount(102, "Rahul", 100000);

        savingsAccount.deposit(5000);
        savingsAccount.withdraw(2000);

        currentAccount.deposit(10000);
        currentAccount.withdraw(5000);

        // Polymorphism functionality
        System.out.println("\nSavings Account Interest: "
                + savingsAccount.calculateInterest());

        System.out.println("Current Account Interest: "
                + currentAccount.calculateInterest());

        // Loanable interface
        Loanable savingsLoan = (SavingsAccount) savingsAccount;

        savingsLoan.applyForLoan();

        System.out.println("Savings Account Loan Eligible: "
                + savingsLoan.calculateLoanEligibility());
    }
}
