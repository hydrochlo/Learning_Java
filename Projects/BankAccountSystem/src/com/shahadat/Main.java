package com.shahadat;

public class Main {
    public static void main(String[] args) {
        BankAccount arefin;
        arefin = new BankAccount();
        arefin.setAccountNumber("260253");
        arefin.setUserName("Shamitul Arefin");
        arefin.setAccountType("Current");
        arefin.setBalance(100);
        System.out.println(arefin.getAccountDetails());
        System.out.println("\n-------------------------\n");

        Transaction first;
        first = new Transaction();
        first.setTransactionID("260253352062");
        first.setAccountNumber("260253");
        first.setAmount(3090.5);
        first.setType("True");
        first.setDate("24/04/2026");
        System.out.println(first.getTransactionDetails());
    }
}
