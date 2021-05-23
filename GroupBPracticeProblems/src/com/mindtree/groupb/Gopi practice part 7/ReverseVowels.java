package com.mindtree.groupb;

import com.mindtreefirstset.validations.AllValidationChecks;

public class ReverseVowels {

	public static void main(String[] args) {
		String str = AllValidationChecks.stringLineCheck();
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
					|| str.charAt(i) == 'O' || str.charAt(i) == 'U') {

				result = result + str.charAt(i);

			}
		}
		for (int i = result.length() - 1; i >= 0; i--) {
			System.out.print(result.charAt(i));
		}
	}

}
