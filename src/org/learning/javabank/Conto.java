package org.learning.javabank;

import java.util.Random;

public class Conto {
    // ATTRIBUTI
    public int accountNumber;
    public String ownerName;
    public int balance;

    // COSTRUTTORI
    public Conto(int accountNumber, String ownerName, int balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = generateRandomBalance();
    }

    // METODI
    public int generateRandomBalance() {
        Random random = new Random();
        return random.nextInt(1000);
    }
    public int deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "€ successfully paid in");
        } else {
            System.out.println("The amount to be paid must be greater than zero");
        }
        return balance;
    }

    public int withdraw(int amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(amount + "€ successfully withdrawn");
            } else {
                System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("The amount to be withdrawn must be greater than zero");
        }
        return balance;
    }

    public String printAccountInfo() {
        String accountInfo = "Account number: " + accountNumber + "\n";
        accountInfo += "Owner: " + ownerName + "\n";
        accountInfo += "Balance: " + balance + "€\n";
        return accountInfo;
    }
}

