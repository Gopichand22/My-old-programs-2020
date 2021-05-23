package com.mindtree.practiceme;

import java.util.Scanner;

import com.mindtreefirstset.validations.AllValidationChecks;

public class WordCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentance = "";
		boolean isValid = true;
		do {
			switch (optionsOfTheProgram(sc)) {
			case 1:
				sentance = enterString();
				break;
			case 2:
				findWordsCount(sentance);
				break;
			case 3:
				findVowelsCount(sentance);
				break;
			case 4:
				returnAllWords(sentance);
				break;
			case 5:
				System.out.println("\n\nExiting...");
				System.out.println("Bye Have a nice day");
				isValid = false;
				break;
			default:
				System.out.println("***choose correct option between 1-5:\n");
			}

		} while (isValid);
	}

	private static void returnAllWords(String str) {
		if (str == "") {
			System.out.println(
					"***Initially please go with option 1 because there is no data to perform operations on sentance\n");
		} else {
			String[] words = AllValidationChecks.splittingMethod(str, ' ');
			for (String word : words) {
				System.out.println(word);
			}
		}
	}

	private static void findVowelsCount(String str) {
		if (str == "") {
			System.out.println(
					"***Initially please go with option 1 because there is no data to perform operations on sentance\n");
		} else {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
						|| str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
						|| str.charAt(i) == 'O' || str.charAt(i) == 'U') {
					count++;
				}
			}
			System.out.println("***Total number o vowels in the sentance:" + count + "\n");
		}
	}

	private static void findWordsCount(String str) {
		if (str == "") {
			System.out.println(
					"***Initially please go with option 1 because there is no data to perform operations on sentance\n");

		} else {
			int count = 1;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' ') {
					count++;
				}
			}
			System.out.println("***Total number of words in the sentance:" + count + "\n");
		}
	}

	private static String enterString() {
		System.out.println("Enter Sentance:");
		String Sentance = AllValidationChecks.stringLineCheck();

		return Sentance;
	}

	private static int optionsOfTheProgram(Scanner sc) {
		System.out.println("******************MENU******************");
		System.out.println("Option 1.Enter a sentance\nOption 2.Count the words in the given sentence\nOption "
				+ "3.Count the number of vowels in the given sentence\nOption 4.Return array of words "
				+ "from the sentance\nOption 5.Exit from the program");
		System.out.println("****************************************");
		int option = sc.nextInt();
		sc.nextLine();
		return option;
	}

}
