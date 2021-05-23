package com.mindtree.stringsbasedprograms;

import com.mindtreefirstset.validations.AllValidationChecks;

public class LongestPalindrome {

	public static void main(String[] args) {
		System.out.println("Enter the string:");
		String str = AllValidationChecks.stringLineCheck();
		String[] words = AllValidationChecks.splittingMethod(str, ' ');
		String[] palindrome = findPalindrome(words);
		String result = "";
		int max = 0;
		for (String element : palindrome) {
			if (element != null) {
				if (element.length() > max) {
					result = element;
				}
			}
		}
		if (result == "") {
			System.out.println("There are no palindrome words in the string");
		}
		System.out.println("Longest palindrome word is: " + result);
	}

//Methods starts from here
	private static String[] findPalindrome(String[] words) {
		String temp = "";
		String[] palin = new String[words.length];
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > 1) {
				for (int j = words[i].length() - 1; j >= 0; j--) {
					temp = temp + words[i].charAt(j);
				}
				if (temp.equals(words[i])) {
					palin[i] = temp;
				}
				temp = "";
			}
		}
		return palin;
	}
}
