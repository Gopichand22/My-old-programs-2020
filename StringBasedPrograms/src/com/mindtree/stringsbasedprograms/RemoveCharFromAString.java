package com.mindtree.stringsbasedprograms;

import java.util.Scanner;

import com.mindtreefirstset.validations.AllValidationChecks;

public class RemoveCharFromAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String str = AllValidationChecks.stringLineCheck();
		System.out.println("Enter a char to remove in the string");
		char ch = sc.next().charAt(0);
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				continue;
			} else {
				result = result + str.charAt(i);
			}
		}
		System.out.println(result);
	}
}
