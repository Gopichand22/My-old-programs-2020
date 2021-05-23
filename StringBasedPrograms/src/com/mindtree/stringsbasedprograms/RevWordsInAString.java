package com.mindtree.stringsbasedprograms;

import com.mindtreefirstset.validations.AllValidationChecks;

public class RevWordsInAString {

	public static void main(String[] args) {
		System.out.println("Enter the string:");
		String str = AllValidationChecks.stringLineCheck();
		String[] words = AllValidationChecks.splittingMethod(str, ' ');

		for (int i = words.length - 1; i >= 0; i--) {
			int j = 0;
			if (i != j) {
				System.out.print(words[i] + " ");
			} else {
				System.out.println(words[i]);
			}
		}
	}

}
