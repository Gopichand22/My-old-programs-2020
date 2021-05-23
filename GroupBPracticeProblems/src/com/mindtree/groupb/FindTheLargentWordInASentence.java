package com.mindtree.groupb;

import java.util.Scanner;

import com.mindtreefirstset.validations.AllValidationChecks;

public class FindTheLargentWordInASentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentance = sc.nextLine();

		String[] words = AllValidationChecks.splittingMethod(sentance, ' ');

		int max = 0;
		String result = null;
		for (String word : words) {
			if (word.length() > max) {
				max = word.length();
				result = word;
			}
		}
		System.out.println("Largest word in the sentence is ----> " + result);
	}

}
