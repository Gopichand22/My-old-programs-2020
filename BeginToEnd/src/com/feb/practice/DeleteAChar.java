package com.feb.practice;

import java.util.Scanner;

import com.mindtreefirstset.validations.AllValidationChecks;

public class DeleteAChar {
	// Enter a sentance here
	// enter a char that u want to remove
	// take an empty string to store the result
	// loop to traverse from start to end
	// check where u r finding that char in the sentance
	// if you find that char in the sentance then just skip it
	// store the chars which are othethan user entered char(concatenate)
	// print the solution/result on the console

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		// give a sentance here
		String str = AllValidationChecks.stringLineCheck();
		// method to logic part
		String result = removeCharsFromAString(str, sc);
		// print the solution/result
		System.out.println(result);
	}

	private static String removeCharsFromAString(String str, Scanner sc) {
		System.out.println("Enter a char to remove in the string");
		// enter a char that u want to remove
		char ch = sc.next().charAt(0);
		// take an empty string to store the result
		String result = "";
		// loop to traverse from start to end
		for (int i = 0; i < str.length(); i++) {
			// check where u r finding that char in the sentance
			if (str.charAt(i) == ch) {
				// if you find that char in the sentance then just skip it
				continue;
			} else {
				// store the chars which are othethan the that char(concatenate)
				result = result + str.charAt(i);
			}
		}
		return result;
	}

}
