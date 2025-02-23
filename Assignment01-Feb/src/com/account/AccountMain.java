package com.account;

public class AccountMain {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account(1000);

        account1.deposit(500);
        account1.displayBalance();

        account2.withdraw(300);
        account2.displayBalance();
    }
}
