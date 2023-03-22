package com.AtmInterfaceServices.Entity;

import java.util.ArrayList;
import java.util.Scanner;

public class Atm {
	 private Bank bank;
	    private Scanner scanner;

	    public Atm() {
	        this.bank = new Bank();
	        this.scanner = new Scanner(System.in);
	    }

	    public boolean login() {
	        System.out.print("User ID: ");
	        String userID = scanner.nextLine();
	        System.out.print("User PIN: ");
	        String userPIN = scanner.nextLine();
	        return bank.authenticateUser(userID, userPIN);
	    }



		/*
		 * Transaction History Method it work on History
		 */
	  
	    public void getTransactionHistory() {
	        User currentUser = bank.getCurrentUser();
	        System.out.println("Transaction history for " + currentUser.getFullName() + ":");
	        System.out.println();
	        ArrayList<String> history = currentUser.getTransactionHistory() ;
	       if(history.size()>0) {
	    	   for (String transaction : history ) {
		            System.out.println(transaction);
		        }
	       }else {
	    	   System.out.println("Currently No History is found on your Account :)");
	       }
	    }


		/*
		 * It work on WIthDraw Withdraw method
		 */
	    public void userWithdraw() {
	        User currentUser = bank.getCurrentUser();
	        System.out.print("Enter amount to withdraw: ");
	        double amount = scanner.nextDouble();
	        if (currentUser.withdraw(amount)) {
	            System.out.println("Withdrawal successful, new balance: $" + currentUser.getAccountBalance());
	        } else {
	            System.out.println("Insufficient balance");
	            System.out.println();
	        }
	    }


		/*
		 *  Deposit Method Deposit Logic WIll be applicable here
		 * 
		 **/
	    public void userDeposit() {
	        User currentUser = bank.getCurrentUser();
	        System.out.print("Enter amount to deposit: ");
	        double amount = scanner.nextDouble();
	        currentUser.deposit(amount);
	        System.out.println("Deposit successfully, new balance: $" + currentUser.getAccountBalance());
	    }

	/**
	             Transfer Method
	    
	           Transfer Logic Will Follows
	 **/
	    
	    public void userAmountTransfer() {
	        User currentUser = bank.getCurrentUser();

	        System.out.print("Enter recipient user ID: ");
	        String recipientID = scanner.nextLine();
	        User recipient = bank.getUserByID(recipientID);
	        if (recipient == null) {
	            System.out.println("Recipient not found.");
	            return;
	        }


	        System.out.print("Enter amount to transfer: ");
	        double amount = scanner.nextDouble();
	        if (currentUser.transfer(amount, recipient)) {
	            System.out.println("Transfer successful, new balance: $" + currentUser.getAccountBalance());
	        } else {
	            System.out.println("Insufficient funds");
	        }

	    }
}
