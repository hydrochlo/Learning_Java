package com.shahadat;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BankSystem {
    private BankAccount account;
    private Transaction transaction;
//    private BankAccount accountholders[];
    private ArrayList<BankAccount> accountholders;
    private ArrayList<Transaction> transactionlist;
    private int deleteIndex = 0;


    public BankSystem()
    {
        this.accountholders = new ArrayList<>();
        this.transactionlist = new ArrayList<>();
    }

    public void addAccount(String number, String name, double initBalance){
        BankAccount account = new BankAccount(number, name, initBalance);
        this.accountholders.add(account); //Adding account object to array
    }


    // if arr is just a array then, arr[i] = 10;
    // arr = {2,5,7}
    // if arr is a arraylist then, arr.add(10);
    // arr = {2,5,7,10}
    // if arr is a arraylist then, arr.add(8);
    // arr = {2,5,7,10,8}

    public void addTransaction(String accountNumber, double amount, String operation){
        String tid = "t" + (transactionlist.size() + 1); // t01
        Transaction t = new Transaction(tid, amount, accountNumber, operation);
        transactionlist.add(t); // a, b, c, t
    }

    public void printTransactionList(){
        for(int i=0; i<this.transactionlist.size(); i++){
            System.out.println(this.transactionlist.get(i).transactionDetails());
        }
    }

    public void performDeposit(String accountNumber, double amount){
        addTransaction(accountNumber, amount, "Deposit");
    }

    public void performWithdraw(String accountNumber, double amount){
        addTransaction(accountNumber, amount, "Withdraw");
    }

    public BankAccount searchAccount(String number){
        for(BankAccount accnt: this.accountholders){
            if(accnt == null) break;
            if(accnt.getAccountNumber().equals(number)) {
                return accnt; //If found return the account object
            }
        }
        return null; //If account not found
    }

    public int getNumberOfCustomers(){
        return this.accountholders.size();
    }

    public void createAccount(BankAccount account)
    {
        this.account = account;
        this.accountholders.add(account);
        System.out.println("!Created account!");
    }

    public void deleteAccount(String accountNumber)
    {
        int found = 0;
        for(int i = 0; i < this.accountholders.size(); i++){
            if(this.accountholders.get(i).getAccountNumber().equals(accountNumber)){
                this.accountholders.remove(i);
                deleteIndex++;
                System.out.println("Account Deleted. \nDeleted account count: " + deleteIndex);
                found = 1;
                return;
            }
        }

        if(found == 0){
           System.out.println("Account Not found!");
        }
    }

    public void performtransaction(String number, double amount, String operation) {
        this.transaction = new Transaction(number+"01", amount, number, operation);
        this.account.deposit(amount);
        System.out.println("Performed transaction \n" + this.transaction);
    }

    public void performDeposit(double amount){
        this.account.deposit(amount);
    }

    public void performWithdraw(double amount){
        this.account.withdraw(amount);
    }



    public void printStatement(BankAccount acc){
        System.out.println(acc.statement());
    }

    public void accountDetails(){
        System.out.println(this.account);
    }

    public void getAllAccountDetails(){
        for(int i = 0; i < this.accountholders.size(); i++){
            System.out.println(this.accountholders.get(i));
        }
    }
}