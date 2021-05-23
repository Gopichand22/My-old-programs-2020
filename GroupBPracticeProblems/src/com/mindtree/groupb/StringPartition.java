package com.mindtree.groupb;

import com.mindtreefirstset.validations.AllValidationChecks;

public class StringPartition {

	public static void main(String[] args) {
		String str = AllValidationChecks.stringLineCheck();
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}

		String[] allWords = AllValidationChecks.splittingMethod(str, ' ');
		for (String word : allWords) {
			System.out.print(word + " ");
		}
		System.out.println();

		if (allWords.length % 2 == 0) {
			method1(allWords, count);
		} else {
			method2(allWords, count);
		}

	}

//for odd words count
	private static void method2(String[] allWords, int count) {
		String[] result = new String[count];
		int k = 0;
		for (int i = (allWords.length / 2) + 1; i < allWords.length; i++) {
			result[k] = allWords[i];
			k++;
		}
		result[k] = allWords[allWords.length / 2];
		k++;
		for (int i = 0; i < allWords.length / 2; i++) {
			result[k] = allWords[i];
			k++;
		}
		for (int i = 0; i < allWords.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
		String supportString = "";
		for (String element : result) {
			supportString += element;
		}
		String finalAnswer = "";
		String star = "*";
		for (int i = 0; i < supportString.length(); i++) {
			if (i % 2 != 0) {
				finalAnswer += star;
			} else {
				finalAnswer += supportString.charAt(i);
			}
		}
		for (int i = 0; i < finalAnswer.length(); i++) {
			System.out.print(finalAnswer.charAt(i));
		}
	}

//for even words count
	private static void method1(String[] allWords, int count) {
		String[] result = new String[count];
		int k = 0;
		for (int i = (allWords.length / 2); i < allWords.length; i++) {
			result[k] = allWords[i];
			k++;
		}
		for (int i = 0; i < allWords.length / 2; i++) {
			result[k] = allWords[i];
			k++;
		}
		for (int i = 0; i < allWords.length; i++) {
			System.out.print(result[i] + " ");
		}

		System.out.println();
		String supportString = "";
		for (String element : result) {
			supportString += element;
		}
		String finalAnswer = "";
		String star = "*";
		for (int i = 0; i < supportString.length(); i++) {
			if (i % 2 != 0) {
				finalAnswer += star;
			} else {
				finalAnswer += supportString.charAt(i);
			}

		}
		finalAnswer += " ";
		for (int i = 0; i < finalAnswer.length(); i++) {
			System.out.print(finalAnswer.charAt(i));
		}
	}

}
