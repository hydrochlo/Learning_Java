package com.shahadat;

public class BankAccount {
    private String accountNumber;
    private String userName;
    private String accountType;
    private double balance;

    // Setters
    public void setAccountNumber(String accountNum){
        this.accountNumber = accountNum;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public void setAccountType(String accountType){
        this.accountType = accountType;
    }
    public void setBalance(double amount){
        this.balance = amount;
    }

    // Getters
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public String getUserName(){
        return this.userName;
    }
    public String getAccountType(){
        return this.accountType;
    }
    public double getBalance(){
        return this.balance;
    }

    // Services or Methods
    public void deposit(double amount){
        this.balance += amount;
    }

    public boolean withdraw(double amount){
        if(this.balance>=amount) {
            this.balance -= amount;
            return true;
        }
        else return false;
    }

    public String getAccountDetails(){
        return "Account number: "+ this.accountNumber + "\nName: " + this.userName + "\nType: " + this.accountType + "\nBalance: "+ this.balance;
    }
}
