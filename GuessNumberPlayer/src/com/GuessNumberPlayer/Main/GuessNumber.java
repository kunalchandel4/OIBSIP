package com.GuessNumberPlayer.Main;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	static String Black = "\u001b[30m";
	static String Red = "\u001b[31m";
	static String Green = "\u001b[32m";
	static String Yellow = "\u001b[33m";
	static String Blue = "\u001b[34m";
	static String Magenta = "\u001b[35m";
	static String Cyan = "\u001b[36m";
	static String White = "\u001b[37m";
	static String BrightBlack = "\u001b[30;1m";
	static String BrightRed = "\u001b[31;1m";
	static String BrightGreen = "\u001b[32;1m";
	static String BrightYellow = "\u001b[33;1m";
	static String BrightBlue = "\u001b[34;1m";
	static String BrightMagenta = "\u001b[35;1m";
	static String BrightCyan = "\u001b[36;1m";
	static String BrightWhite = "\u001b[37;1m";
	static String Reset = "\u001b[0m";

	static String BackgroundBlack = "\u001b[40m";
	static String BackgroundRed = "\u001b[41m";
	static String BackgroundGreen = "\u001b[42m";
	static String BackgroundYellow = "\u001b[43m";
	static String BackgroundBlue = "\u001b[44m";
	static String BackgroundMagenta = "\u001b[45m";
	static String BackgroundCyan = "\u001b[46m";
	static String BackgroundWhite = "\u001b[47m";
	static String BackgroundBrightBlack = "\u001b[40;1m";
	static String BackgroundBrightRed = "\u001b[41;1m";
	static String BackgroundBrightGreen = "\u001b[42;1m";
	static String BackgroundBrightYellow = "\u001b[43;1m";
	static String BackgroundBrightBlue = "\u001b[44;1m";
	static String BackgroundBrightMagenta = "\u001b[45;1m";
	static String BackgroundBrightCyan = "\u001b[46;1m";
	static String BackgroundBrightWhite = "\u001b[47;1m";

	public static void main(String[] args) {
		int max = 100;
		int min = 1;
		int attempts = 0; // Number of attempts user has made
		int score = 0; // Score of the user

		Random rand = new Random(); // Generate a random number between 1 and 100

		int randomNumber = rand.nextInt((max - min) + 1) + min;

		Scanner scanner = new Scanner(System.in);
		System.out.println(Red + BackgroundBrightYellow);
		System.out.println("Welcome into a Guess Game " + BackgroundBrightWhite);
		System.out.println();
		System.out.println("Guess a number between 1 and 100:");
		System.out.println(Reset);

		while (true) {

			int guessNumber = scanner.nextInt();

			attempts++; // Increment the attempt count by one each time

			if (guessNumber > randomNumber) {
				System.out.println(BackgroundBrightGreen);
				System.out.println("Your guess is too high!");
			} else if (guessNumber < randomNumber) {
				System.out.println(BackgroundMagenta);
				System.out.println("Your guess is too low!");
			} else {
				System.out.println(BackgroundBlue);
				System.out.println("You guessed it! The number was " + randomNumber);

				score += (max - attempts);
				System.out.println(BackgroundBrightRed);
				System.out.println("It took you " + attempts + " attempts to guess correctly.");
				System.out.println(BackgroundCyan);
				System.out.println("Your score is: " + score);
				System.out.println(Reset);
				break;
			}

		}

	}
}
