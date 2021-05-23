package com.mindtree.stringsbasedprograms;

import java.util.Scanner;

import com.mindtreefirstset.validations.AllValidationChecks;

public class CheckTheAlphaCountInAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = AllValidationChecks.stringCheck();
		System.out.println("Enter a character to find in the given string");
		char ch = sc.next().charAt(0);
		// convert to tochararray
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println(ch + ":" + count);
		} else {
			System.out.println("Character is not present in the string");
		}

	}

}
