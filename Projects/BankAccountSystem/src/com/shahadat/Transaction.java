package com.shahadat;

public class Transaction {
    private String transactionId ;
    private String date;
    private String type;
    private double amount;
    private String accountNumber;

    public Transaction(String transactionId, String date, String type, double amount, String accountNumber) {
        this.transactionId = transactionId;
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.accountNumber = accountNumber;
    }


    public String getTransactionId() {
        return this.transactionId;
    }

    public String getDate() {
        return this.date;
    }

    public String getType() {
        return this.type;
    }

    public double getAmount() {
        return this.amount;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getTransactionDetails(){
        return "Transaction ID: " + this.transactionId +"\nDate: "+ this.date +"\nType: "+ this.type +"\nAmount: " +this.amount +"\nAccount Number: " + this.accountNumber;
    }



}
