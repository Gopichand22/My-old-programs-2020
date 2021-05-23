package com.mindtree.practiceme;

import com.mindtreefirstset.validations.AllValidationChecks;

public class ShuffleString {

	public static void main(String[] args) {
		System.out.println("Enter a word:");
		String word = AllValidationChecks.stringCheck();
		String shuffledWord = "";
		int last = word.length() - 1;
		int a = 0;
		for (int i = 0; i < word.length(); i++) {
			if (i % 2 == 0) {
				if (word.charAt(a) >= 'a' && word.charAt(a) <= 'z') {
					shuffledWord += word.charAt(a);
					a++;
				} else {
					shuffledWord += ((char) (word.charAt(a) + 32));
					a++;
				}
			} else {
				if (word.charAt(last) >= 'A' && word.charAt(last) <= 'Z') {
					shuffledWord += word.charAt(last);
					last--;
				} else {
					shuffledWord += ((char) (word.charAt(last) - 32));
					last--;
				}

			}
		}
		System.out.print(shuffledWord);
	}
}
