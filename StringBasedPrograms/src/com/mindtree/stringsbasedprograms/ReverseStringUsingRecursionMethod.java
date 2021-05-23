package com.mindtree.stringsbasedprograms;

import com.mindtreefirstset.validations.AllValidationChecks;

public class ReverseStringUsingRecursionMethod {

	public static void main(String[] args) {
		System.out.println("Enter String");
		String str = AllValidationChecks.stringCheck();
		String reversedString = revString(str);
		System.out.println(reversedString);
	}

	private static String revString(String str) {
		if (str == null || str.length() <= 1) {
			return str;
		}
		return revString(AllValidationChecks.subStringMethod(str, 1)) + str.charAt(0);
	}

}
