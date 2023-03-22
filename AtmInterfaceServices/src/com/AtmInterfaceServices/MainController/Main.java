package com.AtmInterfaceServices.MainController;

import java.util.Scanner;

import com.AtmInterfaceServices.Entity.Atm;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to  Java Onboard Atm");

		Atm atm = new Atm();

		while (true) {
			if (atm.login()) {
				while (true) {

					System.out.println("Choose an option:");
					System.out.println("1. View transaction history");
					System.out.println("2. Withdraw");
					System.out.println("3. Deposit");
					System.out.println("4. Transfer");
					System.out.println("5. Quit");
					System.out.print("Choice: ");

					int choice = scanner.nextInt();

					switch (choice) {
					case 1:
						atm.getTransactionHistory();
						break;
					case 2:
						atm.userWithdraw();
						break;
					case 3:
						atm.userDeposit();
						break;
					case 4:
						atm.userAmountTransfer();;
						break;
					case 5:
						System.out.println("Thank You For Visit :) ");
						return;
					default:
						System.out.println("Please Choice a Right Option");
						break;
					}
				}
			} else {
				System.out.println("Please Enter right Pin Or Password ");
			}

		}

	}
}
