package com.mindtree.programset2;

import java.util.Scanner;

import com.mindtreefirstset.validations.AllValidationChecks;

public class GuessNumberGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to generate a random number");
		int secretNumber = AllValidationChecks.integerCheck();
		System.out.println("Yeah... Start guessing the number");
		guessTheNumber(secretNumber);
	}

	// Guessing number logic
	private static void guessTheNumber(int secretNumber1) {

		int userGuess, count = 0;

		do {

			System.out.print("Guess a Number: ");

			userGuess = AllValidationChecks.integerCheck();

			if (userGuess == secretNumber1) {

				System.out.println("Your guess is correct. Congratulations!");
				count++;
			}

			else if (userGuess < secretNumber1) {

				System.out.println("Too Low");
				count++;
			}

			else if (userGuess > secretNumber1) {

				System.out.println("Too High");
				count++;

			}
		} while (userGuess != secretNumber1);
		System.out.println("You took " + count + " guesses to find the number.");
	}

}
