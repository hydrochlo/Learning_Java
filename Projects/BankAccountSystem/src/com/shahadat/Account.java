package com.shahadat;

public class Account {
    private String accountNumber;
    private String accountName;
    private String accountType;
    private double balance;


    // Set and get method for accountNumber
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }

    // Set and get method for accountName
    public void setAccountName(String accountName){
        this.accountName = accountName;
    }
    public String getAccountName(){
        return this.accountName;
    }

    // Set and get method for accountType
    public void setAccountType(String accountType){
        this.accountType = accountType;
    }
    public String getAccountType(){
        return this.accountType;
    }

    // Set and get method for balance
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }

    // Deposit
    public void deposit(double amount){
        this.balance = this.balance + amount;

        Transaction trans = new Transaction();
        trans.setTransactionId("11223344");
        trans.setAccountNumber(this.accountNumber);
        trans.setAmount(amount);
        trans.setDate("13/09/2026");
        trans.setType("Deposit");
        System.out.println(trans.getTransactionDetails() + "\n");
    }

    // Withdraw
    public boolean withdraw(double amount){
        if(this.balance>=amount){
            this.balance = this.balance - amount;
            Transaction trans = new Transaction();
            trans.setTransactionId("11223344");
            trans.setAccountNumber(this.accountNumber);
            trans.setAmount(amount);
            trans.setDate("13/09/2026");
            trans.setType("Withdraw");
            System.out.println(trans.getTransactionDetails() + "\n");
            return true;
        }

        else return false;
    }

    public String getAccountDetails(){
        return "Account Number: " + this.accountNumber + "\nAccount Name: " + this.accountName + "\nAccount Type: " + this.accountType + "\nAccount Balance: " + this.balance;
    }
}