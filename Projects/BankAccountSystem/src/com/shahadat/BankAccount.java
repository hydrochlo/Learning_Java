package com.shahadat;

public class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    private String operation;
    private double changeAmount;

    public BankAccount(String number, String holdername, double balance) {
        this.accountNumber = number;
        this.holderName = holdername;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        this.changeAmount = amount;
        this.operation = "Deposited";
    }

    public void withdraw(double amount) {

        this.balance -= amount;
        this.changeAmount = amount;
        this.operation = "Withdrawn";
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String statement() {
        return "Account Number: " + this.accountNumber + " Current balance: " + this.balance + " " + this.operation + ":" + this.changeAmount;
    }

    public String toString() {
        return "Account number:" + this.accountNumber + ", Holder name: " + this.holderName + ", Balance: " + this.balance;
    }

}
