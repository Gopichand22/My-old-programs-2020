package com.mindtree.groupb;

import com.mindtreefirstset.validations.AllValidationChecks;

public class ExchangeSequenseOfCharacters {

	public static void main(String[] args) {
		System.out.println("Enter First string:");
		String string1 = AllValidationChecks.stringCheck();
		System.out.println("Enter Second string:");
		String string2 = AllValidationChecks.stringCheck();
		System.out.println("\n" + string1);
		System.out.println(string2 + "\n");
		System.out.println("Enter starting index point:");
		int start = AllValidationChecks.integerCheck();
		System.out.println("Enter ending index point:");
		int end = AllValidationChecks.integerCheck();
		char[] strCharacters1 = new char[string1.length()];
		char[] strCharacters2 = new char[string2.length()];

		for (int i = 0; i < string1.length(); i++) {
			strCharacters1[i] = string1.charAt(i);
		}
		for (int i = 0; i < string2.length(); i++) {
			strCharacters2[i] = string2.charAt(i);
		}
		if (start <= end) {
			if (start >= 0 && (end < string1.length() && end < string2.length())) {

				for (int i = start; i <= end; i++) {
					strCharacters2[i] = string1.charAt(i);
					strCharacters1[i] = string2.charAt(i);
				}
				System.out.print(string1 + " is converted as :");
				for (int i = 0; i < string1.length(); i++) {
					System.out.print(strCharacters1[i]);
				}
				System.out.println();
				System.out.print(string2 + " is converted as :");
				for (int j = 0; j < string2.length(); j++) {
					System.out.print(strCharacters2[j]);
				}
			} else {
				System.out.println(
						"Please give a valid subString values");
			}
		} else {
			System.out.println("Please give a valid subString values condition is start value should be <= end value");
		}

	}
}