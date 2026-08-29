package com.bridgelabz.java_object_modeling.practice_problems;

import java.util.List;
import java.util.ArrayList;
/*
Program to demonstrate the association relationship using Bank scenario
having Bank, BankAccount and Customer classes
 */
public class Bank {

    private int id;
    private String name;
    private List<BankAccount> bankAccounts = new ArrayList<>(); // list of bank accounts
    private List<Customer> customers = new ArrayList<>(); // list of bank's customers
    private static int nextAccountId = 1;
    private static int nextCustomerId = 1;

    public Bank(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // method to open a bank account for a customer
    public void openAccount(Customer customer) {
        customer.setId(nextCustomerId);
        customers.add(customer);

        // creation of BankAccount object
        BankAccount account = new BankAccount(id, nextAccountId, nextCustomerId);
        bankAccounts.add(account);

        // addition of account to customer's bankAccounts list
        customer.getBankAccounts().add(account);

        nextAccountId ++;
        nextCustomerId ++;
    }

    // method to display the customers of the bank
    public void displayCustomers() {
        System.out.println(name + " bank's customers:");
        int count = 1;
        for (Customer customer : customers) {
            System.out.println("Customer " + count + ": " + customer.getName());
            count++;
        }
    }
}

class BankAccount {

    private final int bankId;
    private final int id;
    private final int customerId;
    private int balance = 0;

    public BankAccount(int bankId, int id, int customerId) {
        this.bankId = bankId;
        this.id = id;
        this.customerId = customerId;
    }

    public int getBankId() {
        return bankId;
    }
    public int getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

}

class Customer {
    private String name;
    private int id;
    private List<BankAccount> bankAccounts = new ArrayList<>(); // list to store the bank accounts

    public Customer(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    // displays the list of bank accounts
    public void displayBankAccounts() {
        System.out.println(name + "'s Bank Accounts: ");
        for (BankAccount account : bankAccounts) {
            System.out.println("Account (" + account.getId() + ") of bank id " + account.getBankId() + " has balance of Rs. " + account.getBalance());
        }
    }

    // instance method to view the balance in an account
    public void viewBalance(BankAccount bankAccount) {
        System.out.println("Balance of " + name + "'s account with Bank Id and account Id (" + bankAccount.getBankId() + ", " + bankAccount.getId() + ") is " + bankAccount.getBalance());
    }
}

class BankMain {
    public static void main(String[] args) {
        // Bank object creation
        Bank bank1 = new Bank(1, "canara");
        Bank bank2 = new Bank(2, "icici");

        // Customer object creation
        Customer customer1 = new Customer("Muthu");
        Customer customer2 = new Customer("Chandran");
        Customer customer3 = new Customer("Jason");

        // opening bank accounts for respective customers
        bank1.openAccount(customer1);
        bank1.openAccount(customer2);
        bank2.openAccount(customer1);
        bank2.openAccount(customer3);

        // displays the list of customers in the bank
        bank1.displayCustomers();
        bank2.displayCustomers();

        // displays the list of bank accounts a customer has
        customer1.displayBankAccounts();
        customer2.displayBankAccounts();

        // instance method calling to view the balance
        customer1.viewBalance(customer1.getBankAccounts().get(0));

    }
}
