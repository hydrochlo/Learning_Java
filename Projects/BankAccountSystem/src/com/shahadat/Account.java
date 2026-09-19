package com.shahadat;

public class Account {
    private String accountNumber;
    private String accountName;
    private String accountType;
    private double balance;

    public Account(String accountNumber, String accountName, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Get method for accountNumber
    public String getAccountNumber(){
        return this.accountNumber;
    }

    // Get method for accountName
    public String getAccountName(){
        return this.accountName;
    }

    // Get method for accountType
    public String getAccountType(){
        return this.accountType;
    }

    // Get method for balance
    public double getBalance(){
        return this.balance;
    }

    // Deposit
    public void deposit(double amount){
        this.balance = this.balance + amount;

        Transaction trans = new Transaction("11223344", "19/09/2026","Deposit" , amount, this.accountNumber);
        System.out.println(trans.getTransactionDetails() + "\n");
    }

    // Withdraw
    public boolean withdraw(double amount){
        if(this.balance>=amount){
            this.balance = this.balance - amount;
            Transaction trans = new Transaction("11223344", "19/09/2026","Withdraw" , amount, this.accountNumber);
            System.out.println(trans.getTransactionDetails() + "\n");
            return true;
        }

        else return false;
    }

    public String getAccountDetails(){
        return "\nAccount Number: " + this.accountNumber + "\nAccount Name: " + this.accountName + "\nAccount Type: " + this.accountType + "\nAccount Balance: " + this.balance + "\n";
    }
}