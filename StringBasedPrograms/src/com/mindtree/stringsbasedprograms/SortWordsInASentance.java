package com.mindtree.stringsbasedprograms;

import com.mindtreefirstset.validations.AllValidationChecks;

public class SortWordsInASentance {

	public static void main(String[] args) {
		System.out.println("Enter the sentance");
		String str = AllValidationChecks.stringLineCheck();

		String[] words = AllValidationChecks.splittingMethod(str, ' ');
		String[] result = sortedWords(words);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	private static String[] sortedWords(String[] words) {
		String temp;
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length - i - 1; j++) {
				if (words[j].length() < words[j + 1].length()) {
					temp = words[j];
					words[j] = words[j + 1];
					words[j + 1] = temp;
				}
			}

		}

		return words;
	}

}
