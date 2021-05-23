package com.mindtree.groupb;

import java.util.Scanner;

import com.mindtreefirstset.validations.AllValidationChecks;

public class ReverseSentance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentance = sc.nextLine();

		String[] words = AllValidationChecks.splittingMethod(sentance, ' ');
		String reversedWord = "";
		for (int i = 0; i < words.length; i++) {
			for (int j = i; j <= i; j++) {
				reversedWord += reverseWords(words[i]);
			}
		}
		System.out.println("Reversed words in a string:\n" + reversedWord);

	}

//one test case is failing
	// i.e:when ever we give a number in between the string then we get wrong output
	private static String reverseWords(String word) {
		String result = "";
		int count = 0;

		// if a number exists at first then this logic
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) >= 48 && word.charAt(i) <= 57) {
				result += word.charAt(i);
				if (i == word.length() - 1) {
					result += " ";
				}
			} else {
				// if a number exists at last then this logic
				for (int k = word.length() - 1; k >= i; k--) {
					if (word.charAt(k) >= 48 && word.charAt(k) <= 57) {
						count++;
					} else {
						result += word.charAt(k);
					}
				}
				// adding number from back
				for (int j = word.length() - count; j < word.length(); j++) {
					result += word.charAt(j);
				}
				result += " ";
				break;
			}

		}
		return result;
	}

}
