package org.example;

class FixedAccount {
    protected double balance;

    public FixedAccount(double balance) {
        this.balance = balance;
    }

    public void calculateInterest() {
        // Fixed account interest calculation logic
        double interestRate = 0.05; // Example fixed account interest rate
        double interest = balance * interestRate;
        System.out.println("Interest on Fixed Account: $" + interest);
    }
}

class SavingsAccount extends FixedAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void calculateInterest() {
        // Savings account interest calculation logic
        double interestRate = 0.03; // Example savings account interest rate
        double interest = balance * interestRate;
        System.out.println("Interest on Savings Account: $" + interest);
    }
}

public class AccountDemo {
    public static void main(String[] args) {
        FixedAccount fixedAccount = new FixedAccount(1000);
        SavingsAccount savingsAccount = new SavingsAccount(1000);

        fixedAccount.calculateInterest(); // Calls the FixedAccount's calculateInterest method
        savingsAccount.calculateInterest(); // Calls the SavingsAccount's calculateInterest method
    }
}
