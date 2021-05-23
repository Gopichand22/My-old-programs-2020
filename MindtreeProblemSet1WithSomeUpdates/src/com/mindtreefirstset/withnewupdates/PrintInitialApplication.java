package com.mindtreefirstset.withnewupdates;

import com.mindtreefirstset.validations.AllValidationChecks;

public class PrintInitialApplication {

	public static void main(String[] args) {
		System.out.print("Enter name with you Initial:");
		String name = AllValidationChecks.stringCheck();
		// PulagamGopichandReddy
		// OUTPUT:- PGR
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) >= 65 && name.charAt(i) <= 90) {
				System.out.print(name.charAt(i));
			}
		}
	}
}
