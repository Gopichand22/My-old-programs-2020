package com.mindtree.stringsbasedprograms;

import com.mindtreefirstset.validations.AllValidationChecks;

public class ShuffleProblem {

	public static void main(String[] args) {
		System.out.println("Enter first string:");
		String first = AllValidationChecks.stringCheck();
		System.out.println("Enter second string:");
		String second = AllValidationChecks.stringCheck();
		if (first.length() == second.length()) {
			System.out.println("Enter both first and second strings in a shuffled way:");
			String third = AllValidationChecks.stringCheck();
			// checking both strings lengths
			// checking sum of 2 strings & third
			if ((first.length() + second.length()) == third.length()) {
				// checking which string intitiated 1st
				boolean flag = true;
				if (first.charAt(0) == third.charAt(0)) {
					for (int i = 0, j = 0, k = 0; i < third.length(); i++) {
						if (i % 2 == 0) {// even places with first string
							if (first.charAt(j++) != third.charAt(i)) {
								flag = false;
								System.out.println("Not properly shuffled");
								break;
							}
						} else {// odd places with second string
							if (second.charAt(k++) != third.charAt(i)) {
								flag = false;
								System.out.println("Not properly shuffled");
								break;
							}
						}
					}
					// checking which string intitiated 1st
				} else if (second.charAt(0) == third.charAt(0)) {
					for (int i = 0, j = 0, k = 0; i < third.length(); i++) {
						if (i % 2 == 0) {// even places with second string
							if (second.charAt(j++) != third.charAt(i)) {
								flag = false;
								System.out.println("Not properly shuffled");
								break;
							}
						} else {// odd places with first string
							if (first.charAt(k++) != third.charAt(i)) {
								flag = false;
								System.out.println("Not properly shuffled");
								break;
							}
						}

					}
				} else {
					System.out.println("Two Strings are Not shuffled properly");
				}
				if (flag) {
					System.out.println("Two strings are perfectly shuffled");
				}
			} else {
				System.out.println("The sum of 2strings length is not equal to third string");
			}
		} else {
			System.out.println("The 2strings should maintain same lengths");
		}

	}

}
