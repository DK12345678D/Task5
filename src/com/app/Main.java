package com.app;

public class Main {
    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount("Dinkar Prasad", "SB123456", 3.5);

        myAccount.deposit(10000);
        myAccount.withdraw(2500);
        myAccount.applyInterest();
        myAccount.printBalance();
        myAccount.printTransactionHistory();
    }
}

