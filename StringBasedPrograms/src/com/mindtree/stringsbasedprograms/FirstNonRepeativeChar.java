package com.mindtree.stringsbasedprograms;

import com.mindtreefirstset.validations.AllValidationChecks;

public class FirstNonRepeativeChar {

	public static void main(String[] args) {
		System.out.println("Enter String:");
		String str = AllValidationChecks.stringCheck();
		// char array
		char letter;
		int k = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			boolean flag = true;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					if (i != j) {
						flag = false;
						break;
					}
				}
			}
			if (flag) {
				letter = str.charAt(i);
				System.out.println(letter);
				break;
			}

		}
	}

}
