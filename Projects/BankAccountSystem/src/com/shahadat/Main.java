package com.shahadat;

public class Main {
    public static void main(String[] args) {
        Account nayem = new Account();
        nayem.setAccountNumber("260254");
        nayem.setAccountName("Naim");
        nayem.setAccountType("Current");
        nayem.setBalance(999.99);
        nayem.deposit(5000.00);
        nayem.deposit(5000.00);
    }

}
