package com.mindtree.groupb;

import com.mindtreefirstset.validations.AllValidationChecks;

public class RemoveDuplicatesInAString {

	public static void main(String[] args) {

		System.out.println("Enter the string");
		String string = AllValidationChecks.stringLineCheck();

		String[] words = AllValidationChecks.splittingMethod(string, ' ');
		for (String word : words) {
			System.out.println(word);
		}

		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					if (i != j) {
						words[j] = "";
					}
				}
			}
		}

		for (String word : words) {
			if (word != "") {
				System.out.print(word + " ");
			}
		}
	}

}
