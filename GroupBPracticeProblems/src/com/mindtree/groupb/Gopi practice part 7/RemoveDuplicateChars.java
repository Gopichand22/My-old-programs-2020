package com.mindtree.groupb;

import com.mindtreefirstset.validations.AllValidationChecks;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
		System.out.println("Enter the word:");
		String word = AllValidationChecks.stringLineCheck();
		char[] character = new char[word.length()];
		for (int i = 0; i < word.length(); i++) {
			character[i] = word.charAt(i);
		}
		int index = 0;
		for (int i = 0; i < character.length; i++) {
			int j;
			for (j = 0; j < i; j++) {
				if (character[i] == character[j]) {
					break;
				}
			}
			if (j == i) {
				character[index] = character[i];
				index++;
			}
		}
		for (int i = 0; i < index; i++) {
			if (character[i] != ' ') {
				System.out.print(character[i]);

			}
		}
		System.out.println();
		System.out.println();

		// indexOf method
		String str = "";
		int len = word.length();
		for (int i = 0; i < len; i++) {
			char c = word.charAt(i);

			if (str.indexOf(c) < 0) {
				str += c;
			}
		}
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				System.out.print(str.charAt(i));
			}
		}

	}
}
