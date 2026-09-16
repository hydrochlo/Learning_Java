package com.shahadat;

public class Transaction {
    private String transactionId ;
    private String date;
    private String type;
    private double amount;
    private String accountNumber;

    public void setTransactionId(String id){
        this.transactionId = id;
    }

    public String getTransactionId() {
        return this.transactionId;
    }
    public void setDate(String date){
        this.date = date;
    }

    public String getDate() {
        return this.date;
    }
    public void setType(String type){
        this.type=type;
    }

    public String getType() {
        return this.type;
    }
    public void setAmount(double amount){
        this.amount=amount;
    }

    public double getAmount() {
        return this.amount;
    }
    public void setAccountNumber(String number){
        this.accountNumber = number;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getTransactionDetails(){
        return "Transaction ID: " + this.transactionId +"\nDate: "+ this.date +"\nType: "+ this.type +"\nAmount: " +this.amount +"\nAccount Number: " + this.accountNumber;
    }



}
