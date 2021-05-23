package com.mindtree.stringsbasedprograms;

import com.mindtreefirstset.validations.AllValidationChecks;

public class FindAnagram {

	public static void main(String[] args) {
		System.out.println("Enter 2 string to find whether they are anagrams or not");
		System.out.println("Enter string 1:");
		String string1 = AllValidationChecks.stringCheck();
		System.out.println("Enter string 2:");
		String string2 = AllValidationChecks.stringCheck();

		if (string1.length() == string2.length()) {
			String string3 = "";
			String string4 = "";
			String[] word = new String[string1.length()];
			String[] anagram = new String[string1.length()];
			for (int i = 0; i < string1.length(); i++) {
				string3 += string1.charAt(i);
				string4 += string2.charAt(i);
				word[i] = string3;
				anagram[i] = string4;
				string3 = "";
				string4 = "";
			}

			for (int i = 0; i < string1.length(); i++) {
				for (int j = 0; j < string1.length() - i - 1; j++) {
					if (word[j].compareTo(word[j + 1]) > 0) {
						String temp = word[j];
						word[j] = word[j + 1];
						word[j + 1] = temp;
					}
				}
			}
			for (int i = 0; i < string1.length(); i++) {
				for (int j = 0; j < string1.length() - i - 1; j++) {
					if (anagram[j].compareTo(anagram[j + 1]) > 0) {
						String temp = anagram[j];
						anagram[j] = anagram[j + 1];
						anagram[j + 1] = temp;
					}
				}
			}
			boolean flag = true;
			for (int i = 0; i < string1.length(); i++) {
				if (!word[i].equals(anagram[i])) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("Given strings are Anagrams");
			} else {
				System.out.println("Given strings are not Anagrams");
			}

		} else {
			System.out.println("The size of two strings are not same.");
		}
	}
}
