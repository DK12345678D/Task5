package com.app;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String name, String accNo, double interestRate) {
        super(name, accNo);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = (balance * interestRate) / 100;
        deposit(interest); // Reuses parent deposit method
        transactionHistory.add("Interest Applied: ₹" + interest);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("[SavingsAccount] Custom Withdraw Logic");
        super.withdraw(amount); // Calls parent method
    }
}
