package com.bridgelabz.java_object_modeling.practice_problems;

import java.util.List;
import java.util.ArrayList;

public class Bank {

    private int id;
    private String name;
    private List<BankAccount> bankAccounts = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();
    private static int nextAccountId = 1;
    private static int nextCustomerId = 1;

    public Bank(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void openAccount(Customer customer) {
        customer.setId(nextCustomerId);
        customers.add(customer);

        BankAccount account = new BankAccount(id, nextAccountId, nextCustomerId);
        bankAccounts.add(account);

        customer.getBankAccounts().add(account);

        nextAccountId ++;
        nextCustomerId ++;
    }

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
    private List<BankAccount> bankAccounts = new ArrayList<>();

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

    public void displayBankAccounts() {
        System.out.println(name + "'s Bank Accounts: ");
        for (BankAccount account : bankAccounts) {
            System.out.println("Account (" + account.getId() + ") of bank id " + account.getBankId() + " has balance of Rs. " + account.getBalance());
        }
    }

    public void viewBalance(BankAccount bankAccount) {
        System.out.println("Balance of " + name + "'s account with Bank Id and account Id (" + bankAccount.getBankId() + ", " + bankAccount.getId() + ") is " + bankAccount.getBalance());
    }
}

class BankMain {
    public static void main(String[] args) {
        Bank bank1 = new Bank(1, "canara");
        Bank bank2 = new Bank(2, "icici");

        Customer customer1 = new Customer("Muthu");
        Customer customer2 = new Customer("Chandran");
        Customer customer3 = new Customer("Jason");

        bank1.openAccount(customer1);
        bank1.openAccount(customer2);
        bank2.openAccount(customer1);
        bank2.openAccount(customer3);

        bank1.displayCustomers();
        bank2.displayCustomers();

        customer1.displayBankAccounts();
        customer2.displayBankAccounts();

        customer1.viewBalance(customer1.getBankAccounts().get(0));

    }
}
