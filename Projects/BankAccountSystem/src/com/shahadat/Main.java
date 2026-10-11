package com.shahadat;


public class Main {

    public static void main(String args[]){
        BankSystem banksys = new BankSystem();
        banksys.addAccount("00011", "Rohim", 100);
        banksys.addAccount("00022", "Karim", 250);
        banksys.addAccount("00033", "Rohoman", 250);
        banksys.getAllAccountDetails();

        BankAccount baccnt = banksys.searchAccount("00022");
        if(baccnt==null){
            System.out.println("\nCustomer not found.");
        }
        else{
            //System.out.println(""\nFound the customer>> \n"" + baccnt);
            banksys.deleteAccount("00022");
            banksys.getAllAccountDetails();
        }

        System.out.println("\n-------------------\n");

        BankAccount baccnt2 = banksys.searchAccount("00011");
        if(baccnt2==null){
            System.out.println("\nCustomer not found.");
        }
        else{
            banksys.printStatement(baccnt2);
        }

        banksys.addAccount("00033", "Shahadat", 500);

        banksys.performDeposit("00033", 500);
        banksys.performDeposit("00011", 1000);
        banksys.performWithdraw("00011", 300);
        banksys.performWithdraw("00033", 150);

        banksys.printTransactionList();
    }
}