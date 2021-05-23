package com.mindtree.onedarrayprograms;

import java.util.Scanner;

import com.mindtreefirstset.validations.AllValidationChecks;

public class DuplicateWordInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of strings that you want:");
		int num = AllValidationChecks.integerCheck();
		String[] words = new String[num];
		System.out.println("Enter " + num + " words:");
		for (int i = 0; i < words.length; i++) {
			words[i] = sc.next();
		}

		for (int i = 0; i < words.length - 1; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					System.out.println(words[i]);
				}
			}
		}

	}

}
