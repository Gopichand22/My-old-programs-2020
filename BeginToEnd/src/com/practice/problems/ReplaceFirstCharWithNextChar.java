package com.practice.problems;

import com.mindtreefirstset.validations.AllValidationChecks;

public class ReplaceFirstCharWithNextChar {

	public static void main(String[] args) {
		String str = "This is my sample application";
		String[] words = AllValidationChecks.splittingMethod(str, ' ');
		String[] alteredWords = new String[words.length];
		String temp = "";
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				if (words[i].charAt(j) >= 97 && words[i].charAt(j) <= 122
						|| words[i].charAt(j) >= 65 && words[i].charAt(j) <= 90) {
					if (j == 0) {
						if (words[i].charAt(j) == 'z') {
							temp = "a";
						} else {
							temp = temp + (char) (words[i].charAt(j) + 1);
						}
						if (words[i].charAt(j) == 'Z') {
							temp = "A";
						}

					} else {
						temp += words[i].charAt(j);
						alteredWords[i] = temp;
					}
				}
			}
			temp = "";
		}
		if (alteredWords.length % 2 == 0) {
			for (int i = 0; i < alteredWords.length - 1; i = i + 2) {
				String temp1 = alteredWords[i];
				alteredWords[i] = alteredWords[i + 1];
				alteredWords[i + 1] = temp1;
				temp1 = "";
			}
		} else {
			for (int i = 0; i < alteredWords.length - 1; i = i + 2) {
				String temp1 = alteredWords[i];
				alteredWords[i] = alteredWords[i + 1];
				alteredWords[i + 1] = temp1;
			}
		}
		for (String string : alteredWords) {
			System.out.println(string);
		}
	}

}
