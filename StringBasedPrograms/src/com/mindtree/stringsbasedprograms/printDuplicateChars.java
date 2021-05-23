package com.mindtree.stringsbasedprograms;

import com.mindtreefirstset.validations.AllValidationChecks;

public class printDuplicateChars {

	public static void main(String[] args) {
		System.out.println("Enter word to print duplicate characters in the string:");
		String str = AllValidationChecks.stringCheck();
		String duplicate2 = "";
		// loop starts
		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			// inner loop
			boolean flag = true;
			char ch = str.charAt(i);
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
//Without Using indexOf Method
			for (int k = 0; k < duplicate2.length(); k++) {
				if (duplicate2.charAt(k) == ch) {
					flag = false;
				}
			}
			if (count > 1 && flag) {
				duplicate2 += ch;
				System.out.print(ch + " ");
			}
		}
	}

}
