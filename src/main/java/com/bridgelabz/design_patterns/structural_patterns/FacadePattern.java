package com.bridgelabz.design_patterns.structural_patterns;

/*
Program to demonstrate Facade Patters using a Banking system
 */

// Subsystem 1 - AccountService
class AccountService {
    public void openAccount() {
        System.out.println("Account opened");
    }
}

// Subsystem 2 - BalanceService
class BalanceService {
    public void checkBalance() {
        System.out.println("Balance: Rs. 10000");
    }
}

// Subsystem 3 - TransactionService
class TransactionService {
    public void transferMoney() {
        System.out.println("Money transferred");
    }
}

// Facade interface - BankFacade
interface BankFacade {

    // set of simplified methods exposed to the client
    public void openAccount();
    public void checkBalance();
    public void transferMoney();
}

// Facade implementation class - BankFacadeImplementation
class BankFacadeImplementation implements BankFacade {

    // internal implementation of the methods
    @Override
    public void openAccount() {
        AccountService accountService = new AccountService();
        accountService.openAccount();
    }

    @Override
    public void checkBalance() {
        BalanceService balanceService = new BalanceService();
        balanceService.checkBalance();
    }

    @Override
    public void transferMoney() {
        TransactionService transactionService = new TransactionService();
        transactionService.transferMoney();
    }
}

// client interaction
public class FacadePattern {
    public static void main(String[] args) {
        BankFacade bankFacade = new BankFacadeImplementation();

        bankFacade.openAccount();
        bankFacade.checkBalance();
        bankFacade.transferMoney();
    }
}
