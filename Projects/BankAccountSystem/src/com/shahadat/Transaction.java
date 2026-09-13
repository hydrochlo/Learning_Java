package com.shahadat;

public class Transaction {
    private String transactionID;
    private String date;
    private String type;
    private double amount;
    private String accountNumber;

    // Setters
    public void setTransactionID(String ID){
        this.transactionID = ID;
    }
    public void setDate(String date){
        this.date = date;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    // Getters

    public String getTransactionID() {
        return this.transactionID;
    }
    public String getDate() {
        return this.date;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public String getType() {
        return this.type;
    }
    public double getAmount() {
        return this.amount;
    }


    //
    public String getTransactionDetails(){
        return "TransactionID: "+this.transactionID+"\nDate: "+this.date+"\nType: "+this.type+"\nAmount: "+this.amount+"\nAccount Number: "+this.accountNumber;
    }
}
