package com.mindtree.programset2;

import java.util.Scanner;

import com.mindtreefirstset.validations.AllValidationChecks;

public class PalindromeNumberAndString {

	static Scanner scan;

	public static void main(String args[]) {
		scan = new Scanner(System.in);
		do {

			switch (menuItems()) {
			case 1:
				palindromeForNumbers();
				break;
			case 2:
				palindromeForString();
				break;
			case 3:
				return;
			default:
				System.out.println("Enter the correct value");

			}
		} while (true);
	}

	private static void palindromeForString() {
		System.out.println("Enter the word");
		String name = AllValidationChecks.stringCheck();
		String backUp = name;
		String rev = reverseMe(name);

		if (rev.equals(backUp)) {
			System.out.println("You Entered a name" + " " + backUp + " " + "which is a palidrome\n\n");
		} else {
			System.out.println("You Entered a name" + " " + backUp + " " + "which is not a palidrome\n\n");
		}
	}

	private static void palindromeForNumbers() {

		System.out.println("Enter the number");
		int number = AllValidationChecks.integerCheck();
		int backUp = reverseMe(number);
		if (number == backUp) {
			System.out.println("You Entered a number" + " " + backUp + " " + "which is a palidrome\n\n");
		} else {
			System.out.println("You Entered a number" + " " + backUp + " " + "which is not  a palidrome\n\n");
		}
	}

	private static int menuItems() {
		System.out.println("*****************************MENU*******************************");
		System.out.println("1. check the given number is a palindrome or not");
		System.out.println("2. check the weather the given string is a palindrome or not");
		System.out.println("3. Exit");
		System.out.println("****************************************************************");
		System.out.println("Enter the choice");
		return AllValidationChecks.integerCheck();
	}

	private static String reverseMe(String name) {
		int length = name.length();
		String reverse = "";
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
		}
		return reverse;
	}

	private static int reverseMe(int number) {
		int rev, sum = 0;
		while (number != 0) {
			rev = number % 10;
			sum = sum * 10 + rev;
			number = number / 10;
		}
		return sum;
	}

}