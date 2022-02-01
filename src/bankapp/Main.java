package bankapp;

import bankapp.accounts.Account;

public class Main {

    public static void main(String[] args) {
        Account account = new Account(100,0.025);
        account.status();
        account.withdraw(44.50);
        account.status();
        account.withdraw(69.90);
        account.status();
        account.deposit(25.60);
        account.status();
    }
}
