package com.shahadat;

public class Main {
    public static void main(String[] args) {
        Account nayem = new Account("260254", "Ridwan Kabir Naim", "Saving", 1000.00);
        System.out.println(nayem.getAccountDetails());
        nayem.deposit(5000.00);
        System.out.println(nayem.getAccountDetails());
        nayem.withdraw(500.00);
        System.out.println(nayem.getAccountDetails());
    }

}
