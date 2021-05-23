package com.mindtree.stringsbasedprograms;

import com.mindtreefirstset.validations.AllValidationChecks;

public class ExchangeSpaceWithSomeText {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		String str = AllValidationChecks.stringLineCheck();
		// spliting word by word
		String[] words = AllValidationChecks.splittingMethod(str, ' ');
		for (int i = 0; i < words.length - 1; i++) {
			System.out.print(words[i] + "%20");
		}
		System.out.print(words[words.length - 1]);
	}

}
