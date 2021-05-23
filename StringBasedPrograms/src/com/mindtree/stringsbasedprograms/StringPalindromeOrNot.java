package com.mindtree.stringsbasedprograms;

import com.mindtreefirstset.validations.AllValidationChecks;

public class StringPalindromeOrNot {

	public static void main(String[] args) {
		System.out.println("Enter Word:");
		String str = AllValidationChecks.stringCheck();
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			temp = temp + str.charAt(i);
		}
		if (temp.equals(str)) {
			System.out.println("Given word: " + str + " is a palindrome");
		} else {
			System.out.println("Given word: " + str + " is not a palindrome");
		}
	}
}
