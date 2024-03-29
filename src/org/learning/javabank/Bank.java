package org.learning.javabank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the account number: ");
        int accountNumber = Integer.parseInt(scan.nextLine());

        System.out.print("Enter the owner name: ");
        String ownerName = scan.nextLine();

        Conto account = new Conto(accountNumber, ownerName, 0);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Actual Balance: " + account.balance + "€");

        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Exit");
            System.out.print("Your choice: ");
            int choice = Integer.parseInt(scan.nextLine());

            if (choice == 1) {
                System.out.print("Enter the amount to deposit: ");
                int depositAmount = Integer.parseInt(scan.nextLine());
                account.deposit(depositAmount);
                System.out.println("The balance is now equal to: " + account.balance + "€");
            } else if (choice == 2) {
                System.out.print("Enter the amount to withdraw: ");
                int withdrawAmount = Integer.parseInt(scan.nextLine());
                account.withdraw(withdrawAmount);
                System.out.println("The balance is now equal to: " + account.balance + "€");
            } else if (choice == 3) {
                exit = true;
                System.out.println("Exiting...");
                System.out.println();
            } else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        System.out.println(account.printAccountInfo());

        scan.close();
    }
}
