package com.mindtree.stringsbasedprograms;

import com.mindtreefirstset.validations.AllValidationChecks;

public class FindCountOfVowelsConsonents {

	public static void main(String[] args) {
		String str = AllValidationChecks.stringCheck();
		int vowelsCount = 0, consonentsCount = 0;
		// validation of string
		if (str.matches("^[A-Za-z]*")) {
		for (int i = 0; i < str.length(); i++) {
			// check vowels
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
					|| str.charAt(i) == 'O' || str.charAt(i) == 'U') {
				vowelsCount++;
			} else {
				consonentsCount++;
			}
		}
		System.out.println("Vowels: " + vowelsCount + "\nConsonents: " + consonentsCount);
	} else {
		System.out.println("Please enter only alphas(lowerCase or upperCase)");
	}
	}

}
