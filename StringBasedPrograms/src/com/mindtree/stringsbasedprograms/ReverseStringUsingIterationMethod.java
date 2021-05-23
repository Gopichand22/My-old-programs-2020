package com.mindtree.stringsbasedprograms;

import com.mindtreefirstset.validations.AllValidationChecks;

public class ReverseStringUsingIterationMethod {

	public static void main(String[] args) {
		System.out.println("Enter String");
		String str = AllValidationChecks.stringCheck();
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
